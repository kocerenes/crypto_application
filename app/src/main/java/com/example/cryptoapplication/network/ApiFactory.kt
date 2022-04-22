package com.example.cryptoapplication.network

import com.example.cryptoapplication.model.home.CryptoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiFactory {

    //https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?limit=10

    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getData(
        @Header("X-CMC_PRO_API_KEY") apiKey:String,
        @Query("limit") limit : String
    ):CryptoResponse

}