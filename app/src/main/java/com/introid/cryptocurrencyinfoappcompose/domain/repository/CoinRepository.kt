package com.introid.cryptocurrencyinfoappcompose.domain.repository

import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.CoinDetailDto
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId : String) : CoinDetailDto

}