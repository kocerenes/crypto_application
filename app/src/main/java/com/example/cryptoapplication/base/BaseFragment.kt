package com.example.cryptoapplication.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<viewBinding: ViewBinding, viewModel:ViewModel>(
    private val bindingInflater: (inflater: LayoutInflater) ->viewBinding
): Fragment() {

    private var _binding: viewBinding? = null
    private val binding: viewBinding get() = _binding as viewBinding
    protected abstract val viewModel : viewModel
    protected abstract fun onCreateFinished()
    protected abstract fun initializeListener()
    protected abstract fun observeEvents()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(inflater)
        if (_binding == null){
            throw IllegalArgumentException("binding null")
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onCreateFinished()
        initializeListener()
        observeEvents()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}