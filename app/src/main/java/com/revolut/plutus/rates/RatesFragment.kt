package com.revolut.plutus.rates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.revolut.plutus.databinding.FragmentRatesBinding

class RatesFragment : Fragment() {

    private val viewModel: RatesViewModel by lazy {
        ViewModelProviders.of(this).get(RatesViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentRatesBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.ratesViewModel = viewModel
        binding.ratesRecycler.adapter = RatesAdapter(RateListener(
                { viewModel.onRateValueChanged(it) },
                { viewModel.onRateClick(it) }
        ))
        binding.ratesRecycler.itemAnimator?.changeDuration = 0
        return binding.root
    }
}