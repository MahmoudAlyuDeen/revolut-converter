package com.revolut.plutus.api

data class Rate(
    val currencyCode: String,
    val currencyName: String?,
    var conversionRate: Double,
    val countryCode: String?,
    var value: Double,
    var selected: Boolean
)