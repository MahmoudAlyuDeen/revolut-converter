package com.revolut.plutus.di

import com.revolut.plutus.api.RatesApi
import com.revolut.plutus.rates.RatesViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { RatesApi() }

    viewModel { RatesViewModel(get()) }
}
