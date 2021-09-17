package com.introid.cryptocurrencyinfoappcompose.di

import com.introid.cryptocurrencyinfoappcompose.common.Constants
import com.introid.cryptocurrencyinfoappcompose.common.Constants.BASE_URL
import com.introid.cryptocurrencyinfoappcompose.data.remote.CoinPaprikaApi
import com.introid.cryptocurrencyinfoappcompose.data.repository.CoinRepositoryImp
import com.introid.cryptocurrencyinfoappcompose.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesPaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImp(api)
    }




}