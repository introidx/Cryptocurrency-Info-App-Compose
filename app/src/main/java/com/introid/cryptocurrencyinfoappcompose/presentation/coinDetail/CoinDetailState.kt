package com.introid.cryptocurrencyinfoappcompose.presentation.coinDetail

import com.introid.cryptocurrencyinfoappcompose.common.Resource
import com.introid.cryptocurrencyinfoappcompose.domain.model.Coin
import com.introid.cryptocurrencyinfoappcompose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin : CoinDetail? = null,
    val error : String = ""

)
