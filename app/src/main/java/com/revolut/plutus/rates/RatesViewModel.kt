package com.revolut.plutus.rates

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.revolut.plutus.api.Rate
import com.revolut.plutus.api.RatesApi
import com.revolut.plutus.api.RatesApiStatus
import com.revolut.plutus.api.RatesApiStatus.*
import com.revolut.plutus.api.RatesResponse
import com.revolut.plutus.countryCodes
import com.revolut.plutus.currencyNames
import kotlinx.coroutines.*

@Suppress("JoinDeclarationAndAssignment")
class RatesViewModel(private val ratesApi: RatesApi) : ViewModel() {

    private val viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private var ratesResponse: RatesResponse? = null

    private val _rateList = MutableLiveData<List<Rate>>()
    val rateList: LiveData<List<Rate>>
        get() = _rateList

    private var selectedRate: Rate

    private val _status = MutableLiveData<RatesApiStatus>()
    val status: LiveData<RatesApiStatus>
        get() = _status

    init {
        selectedRate = Rate(
            "EUR",
            "Euro",
            1.0,
            "EU",
            100.0,
            true
        )
        fetchRates()
    }

    private fun fetchRates() {
        coroutineScope.launch {
            val ratesResponseDeferred = ratesApi.getRatesService().getRatesAsync(selectedRate.currencyCode)
            try {
                _status.value = LOADING
                ratesResponse = ratesResponseDeferred.await()
                _status.value = DONE
                updateRateList()
                delay(1000)
                fetchRates()
            } catch (e: Exception) {
                _status.value = ERROR
                Log.e("getRatesError: ", e.message)
                delay(1000)
                fetchRates()
            }
        }
    }

    private suspend fun updateRateList() {
        _rateList.value = withContext(viewModelJob + Dispatchers.Default) {
            val rates = ratesResponse?.rates ?: return@withContext ArrayList<Rate>()
            val rateList = rates.map {
                Rate(
                    it.key,
                    currencyNames[it.key],
                    it.value,
                    countryCodes[it.key],
                    it.value * selectedRate.value,
                    false
                )
            }.asReversed().filterNot { it.currencyCode == selectedRate.currencyCode }.toMutableList()
            rateList.add(0, selectedRate)
            rateList
        }
    }

    fun onRateValueChanged(enteredValue: CharSequence) {
        selectedRate.value = if (enteredValue.isEmpty()) 0.0
        else try {
            enteredValue.toString().replace(",", "").toDouble()
        } catch (e: Exception) {
            return
        }
        coroutineScope.launch {
            updateRateList()
        }
    }

    fun onRateClick(rate: Rate) {
        selectedRate = rate
        selectedRate.selected = true
        coroutineScope.launch {
            updateRateList()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}