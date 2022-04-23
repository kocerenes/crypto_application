package com.example.cryptoapplication.presentation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapplication.model.home.CryptoResponse
import com.example.cryptoapplication.utils.NetworkResult
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val repository: HomeRepository) : ViewModel() {

    val cryptoResponse: MutableLiveData<CryptoResponse?> = MutableLiveData()
    val isLoading : MutableLiveData<Boolean> = MutableLiveData(true)
    val onError : MutableLiveData<String?> = MutableLiveData()

    fun getData(
        apiKey : String,
        limit : String
    )= viewModelScope.launch {
        isLoading.value = true
        val request = repository.getData(apiKey,limit)
        when(request){
            is NetworkResult.Success -> {
                cryptoResponse.value = request.data
                isLoading.value = false
            }
            is NetworkResult.Error -> {
                onError.value = request.message
                isLoading.value = false
            }
            else -> {}
        }
    }

}