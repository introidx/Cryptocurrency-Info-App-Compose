package com.introid.cryptocurrencyinfoappcompose.domain.use_case.get_coin

import com.introid.cryptocurrencyinfoappcompose.common.Resource
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.toCoin
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.toCoinDetail
import com.introid.cryptocurrencyinfoappcompose.domain.model.Coin
import com.introid.cryptocurrencyinfoappcompose.domain.model.CoinDetail
import com.introid.cryptocurrencyinfoappcompose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.lang.Error
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId = coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An Unexpected error Occurred"))

        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server...Connect to Internet"))
        }

    }

}