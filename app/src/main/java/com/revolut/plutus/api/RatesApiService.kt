package com.revolut.plutus.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = " https://revolut.duckdns.org/"

fun getFlagUrl(countryCode: String) =
    "https://raw.githubusercontent.com/hjnilsson/country-flags/master/png250px/${countryCode.toLowerCase()}.png"

interface RatesApiService {
    @GET("/latest")
    fun getRatesAsync(@Query("base") type: String):
            Deferred<RatesResponse>
}

class RatesApi {

    fun getRatesService(): RatesApiService {

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(BASE_URL)
            .build()

        return retrofit.create(RatesApiService::class.java)

    }
}

enum class RatesApiStatus { LOADING, DONE, ERROR }