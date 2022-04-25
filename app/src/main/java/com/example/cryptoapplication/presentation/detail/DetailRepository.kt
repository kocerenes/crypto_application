package com.example.cryptoapplication.presentation.detail

import com.example.cryptoapplication.base.BaseRepository
import com.example.cryptoapplication.network.ApiFactory
import javax.inject.Inject

class DetailRepository @Inject constructor(private val apiFactory: ApiFactory) : BaseRepository() {

    suspend fun getDetail(
        apiKey: String,
        symbol: String
    ) = safeApiRequest {
        apiFactory.getDetail(apiKey, symbol)
    }

}