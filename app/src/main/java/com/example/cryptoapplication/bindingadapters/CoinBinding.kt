package com.example.cryptoapplication.bindingadapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.cryptoapplication.utils.loadImage

class CoinBinding {

    companion object{
        @BindingAdapter("load_image")
        @JvmStatic
        fun loadImage(imageView: ImageView,coinImage : String){
            val imageURL = "https://s2.coinmarketcap.com/static/img/coins/64x64/$coinImage.png"
            imageView.loadImage(imageURL)
        }
    }

}