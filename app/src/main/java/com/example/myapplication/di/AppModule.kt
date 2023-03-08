package com.example.myapplication.di

import com.example.myapplication.common.Constants.BASE_URL
import com.example.myapplication.data.remote.LoremApi
import com.example.myapplication.data.repository.RepositoryImpl
import com.example.myapplication.domain.model.Lorem
import com.example.myapplication.domain.repository.Repository
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
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitApi(retrofit: Retrofit): LoremApi{
        return retrofit.create(LoremApi::class.java)
    }

    @Singleton
    @Provides
    fun provideRepository(api: LoremApi): Repository = RepositoryImpl(api)


}