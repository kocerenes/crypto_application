package com.example.cryptoapplication.presentation.home

import androidx.fragment.app.viewModels
import com.example.cryptoapplication.base.BaseFragment
import com.example.cryptoapplication.databinding.FragmentHomeBinding
import com.example.cryptoapplication.utils.Constants.API_KEY
import com.example.cryptoapplication.utils.Constants.LIMIT
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        viewModel.getData(API_KEY, LIMIT)
    }

    override fun initializeListener() {
    }

    override fun observeEvents() {
    }

}