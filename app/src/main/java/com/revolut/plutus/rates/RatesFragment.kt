package com.revolut.plutus.rates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.revolut.plutus.databinding.FragmentRatesBinding
import org.koin.android.viewmodel.ext.android.viewModel

class RatesFragment : Fragment() {

    private val ratesViewModel: RatesViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentRatesBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.ratesViewModel = ratesViewModel
        binding.ratesRecycler.adapter = RatesAdapter(RateListener(
            { ratesViewModel.onRateValueChanged(it) },
            { ratesViewModel.onRateClick(it) }
        ))
        binding.ratesRecycler.itemAnimator?.changeDuration = 0
        return binding.root
    }
}