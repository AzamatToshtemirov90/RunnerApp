package com.azamat.runnerapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.azamat.runnerapp.R
import com.azamat.runnerapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run){

    //this is to get viewModel from Dagger
    private val viewModel: MainViewModel by viewModels()

}