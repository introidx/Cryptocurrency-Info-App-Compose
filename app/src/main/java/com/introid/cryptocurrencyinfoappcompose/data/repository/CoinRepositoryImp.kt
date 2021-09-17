package com.introid.cryptocurrencyinfoappcompose.data.repository

import com.introid.cryptocurrencyinfoappcompose.data.remote.CoinPaprikaApi
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.CoinDetailDto
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.CoinDto
import com.introid.cryptocurrencyinfoappcompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }

}