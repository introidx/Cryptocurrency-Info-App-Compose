package com.introid.cryptocurrencyinfoappcompose.domain.use_case.get_coins

import com.introid.cryptocurrencyinfoappcompose.common.Resource
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.toCoin
import com.introid.cryptocurrencyinfoappcompose.domain.model.Coin
import com.introid.cryptocurrencyinfoappcompose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.lang.Error
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map {
                it.toCoin()
            }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An Unexpected error Occurred"))

        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server...Connect to Internet"))
        }

    }

}