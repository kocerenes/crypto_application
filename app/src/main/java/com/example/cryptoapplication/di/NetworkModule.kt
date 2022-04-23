package com.example.cryptoapplication.di

import com.example.cryptoapplication.BuildConfig
import com.example.cryptoapplication.network.ApiFactory
import com.example.cryptoapplication.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

//http isteği atıcağımız zaman retrofit ile apifactory'mizi oluşturmamız gerekiyor
// istek oluşturmamız için. bunu bize otomatikleştiricek.
// biz içine parametre vermeden kendisi hangi parametresi eksikse tamamlayabilecek bir modül.
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideHttpLoggerInterceptor():HttpLoggingInterceptor{
        val httpLoggerInterceptor = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG){
            httpLoggerInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }else{
            httpLoggerInterceptor.level = HttpLoggingInterceptor.Level.NONE
        }

        return httpLoggerInterceptor
    }

    @Singleton
    @Provides
    fun provideHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor):OkHttpClient{
        return OkHttpClient.Builder().readTimeout(60,TimeUnit.SECONDS)
            .connectTimeout(60,TimeUnit.SECONDS).addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideConverterFactory():GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRetrofitInstance(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ):Retrofit{
        return Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
            .addConverterFactory(gsonConverterFactory).build()
    }

    @Singleton
    @Provides
    fun provideApiFactory(retrofit: Retrofit):ApiFactory{
        return retrofit.create(ApiFactory::class.java)
    }

}