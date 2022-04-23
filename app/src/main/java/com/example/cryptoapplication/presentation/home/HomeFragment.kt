package com.example.cryptoapplication.presentation.home

import androidx.fragment.app.viewModels
import com.example.cryptoapplication.base.BaseFragment
import com.example.cryptoapplication.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
    }

    override fun initializeListener() {
    }

    override fun observeEvents() {
    }

}