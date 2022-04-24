package com.example.cryptoapplication.presentation.home

import android.provider.ContactsContract

interface ItemClickListener {
    fun onItemClick(coin:ContactsContract.Data)
}