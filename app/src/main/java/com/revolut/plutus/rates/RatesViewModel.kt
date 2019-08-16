package com.revolut.plutus.rates

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.revolut.plutus.api.Rate
import com.revolut.plutus.api.RatesApi
import com.revolut.plutus.api.RatesApiStatus
import com.revolut.plutus.api.RatesApiStatus.*
import com.revolut.plutus.countryCodes
import com.revolut.plutus.currencyNames
import kotlinx.coroutines.*

@Suppress("JoinDeclarationAndAssignment")
class RatesViewModel(private val ratesApi: RatesApi) : ViewModel() {

    private val viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private var rates: Map<String, Double>? = null

    private val _rateList = MutableLiveData<List<Rate>>()
    val rateList: LiveData<List<Rate>>
        get() = _rateList

    private var selectedRate: Rate

    private val _status = MutableLiveData<RatesApiStatus>()
    val status: LiveData<RatesApiStatus>
        get() = _status

    private val _scrollToTop = MutableLiveData<Boolean>()
    val scrollToTop: LiveData<Boolean>
        get() = _scrollToTop

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
                val ratesResponse = ratesResponseDeferred.await()
                _status.value = DONE
                if (ratesResponse.base == selectedRate.currencyCode) {
                    rates = ratesResponse.rates
                    updateRateList()
                }
                delay(1000)
                fetchRates()
            } catch (e: Exception) {
                _status.value = ERROR
                delay(1000)
                fetchRates()
            }
        }
    }

    private suspend fun updateRateList() {
        rates?.let {
            _rateList.value = withContext(viewModelJob + Dispatchers.Default) {
                val rateList = rates?.map {
                    Rate(
                        it.key,
                        currencyNames[it.key],
                        it.value,
                        countryCodes[it.key],
                        it.value * selectedRate.value,
                        false
                    )
                }
                    ?.sortedBy { it.currencyCode }
                    ?.filterNot { it.currencyCode == selectedRate.currencyCode }
                    ?.toMutableList()
                rateList?.add(0, selectedRate)
                rateList
            }
        }

    }

    fun onRateValueChanged(enteredValue: CharSequence, rate: Rate) {
        if (rate.currencyCode != selectedRate.currencyCode) return
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

    fun onRateClick(newRate: Rate) {
        coroutineScope.launch {
            calculateRelativeRates(newRate)
            selectedRate = newRate.apply {
                conversionRate = 1.0
                selected = true
            }
            updateRateList()
            _scrollToTop.value = true
        }
    }

    fun onScrollToTopDone() {
        _scrollToTop.value = false
    }

    private suspend fun calculateRelativeRates(newRate: Rate) {
        rates = withContext(viewModelJob + Dispatchers.Default) {
            val newRates = rates?.toMutableMap()
            newRates?.remove(newRate.currencyCode)
            newRates?.put(selectedRate.currencyCode, 1.0)
            newRates?.mapValues { it.value / newRate.conversionRate }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}