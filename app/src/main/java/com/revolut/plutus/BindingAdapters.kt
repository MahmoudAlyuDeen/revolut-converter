package com.revolut.plutus

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.revolut.plutus.api.Rate
import com.revolut.plutus.api.RatesApiStatus
import com.revolut.plutus.api.getFlagUrl
import com.revolut.plutus.rates.RatesAdapter
import java.text.NumberFormat

@BindingAdapter("rates")
fun bindRecyclerView(recyclerView: RecyclerView, rates: List<Rate>?) {
    rates?.let {
        val adapter = recyclerView.adapter as RatesAdapter
        adapter.submitList(rates)
    }
}

@BindingAdapter("countryCode")
fun bindFlagImage(imageView: ImageView, countryCode: String?) {
    countryCode?.let {
        Glide.with(imageView.context)
            .load(getFlagUrl(countryCode))
            .apply(RequestOptions.circleCropTransform())
            .into(imageView)
    }
}

@BindingAdapter("currencyCode")
fun bindTextViewCurrencyCode(textView: TextView, currencyCode: String?) {
    currencyCode?.let { textView.text = currencyCode }
}

@BindingAdapter("currencyName")
fun bindTextViewCurrencyName(textView: TextView, currencyName: String?) {
    currencyName?.let { textView.text = currencyName }
}

@BindingAdapter("rateValue")
fun bindEditTextRateValue(editText: TextView, rateValue: Double?) {
    rateValue?.let {
        val numberFormat = NumberFormat.getNumberInstance()
        numberFormat.maximumFractionDigits = 2
        numberFormat.isGroupingUsed = false
        val roundedRateValue = numberFormat.format(rateValue)
        editText.text = roundedRateValue
    }
}

@BindingAdapter("apiStatus")
fun bindImageViewApiStatus(statusImageView: ImageView, status: RatesApiStatus?) {
    when (status) {
        RatesApiStatus.LOADING -> {
            statusImageView.visibility = View.GONE
        }
        RatesApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        RatesApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}
