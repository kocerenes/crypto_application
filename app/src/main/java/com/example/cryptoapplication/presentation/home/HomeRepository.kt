package com.example.cryptoapplication.presentation.home

import com.example.cryptoapplication.base.BaseRepository
import com.example.cryptoapplication.network.ApiFactory
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiFactory: ApiFactory):BaseRepository() {

    suspend fun getData(
        apiKey:String,
        limit:String
    ) = safeApiRequest {
        apiFactory.getData(apiKey,limit)
    }

}