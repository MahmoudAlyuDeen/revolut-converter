package com.revolut.plutus.rates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.revolut.plutus.api.Rate
import com.revolut.plutus.databinding.ItemRateBinding

class RatesAdapter(private val rateListener: RateListener) :
    ListAdapter<Rate, RatesAdapter.RateViewHolder>(DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RateViewHolder {
        return RateViewHolder(ItemRateBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RateViewHolder, position: Int) {
        val rate = getItem(position)
        holder.bind(rate, rateListener)
    }

    class RateViewHolder(private var binding: ItemRateBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(rate: Rate, rateListener: RateListener) {
            binding.rate = rate
            binding.rateListener = rateListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Rate>() {
        override fun areItemsTheSame(oldItem: Rate, newItem: Rate): Boolean {
            return oldItem.currencyCode == newItem.currencyCode && oldItem.selected == newItem.selected
        }

        override fun areContentsTheSame(oldItem: Rate, newItem: Rate): Boolean {
            return oldItem == newItem
        }

    }

}

class RateListener(
    private val onTextChangedListener: (enteredValue: CharSequence) -> Unit,
    private val onClickListener: (rate: Rate) -> Unit
) {

    fun onTextChanged(s: CharSequence, rate: Rate) {
        if (rate.selected) {
            onTextChangedListener(s)
        }
    }

    fun onClick(rate: Rate) {
        if (!rate.selected) {
            onClickListener(rate)
        }
    }
}