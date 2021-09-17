package com.introid.cryptocurrencyinfoappcompose.presentation.coinList

import com.introid.cryptocurrencyinfoappcompose.common.Resource
import com.introid.cryptocurrencyinfoappcompose.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins : List<Coin> = emptyList(),
    val error : String = ""

)
