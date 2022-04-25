package com.example.cryptoapplication.presentation.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.cryptoapplication.R
import com.example.cryptoapplication.base.BaseFragment
import com.example.cryptoapplication.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding,DetailViewModel>(
    FragmentDetailBinding :: inflate
) {
    override val viewModel by viewModels<DetailViewModel>()
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateFinished() {
        TODO("Not yet implemented")
    }

    override fun initializeListener() {
        TODO("Not yet implemented")
    }

    override fun observeEvents() {
        TODO("Not yet implemented")
    }

}