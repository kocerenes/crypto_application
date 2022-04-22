package com.example.cryptoapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.cryptoapplication.R
import com.example.cryptoapplication.base.BaseFragment
import com.example.cryptoapplication.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding,HomeViewModel>(
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