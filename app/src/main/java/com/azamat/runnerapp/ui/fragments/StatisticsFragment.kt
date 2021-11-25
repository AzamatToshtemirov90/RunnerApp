package com.azamat.runnerapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.azamat.runnerapp.R
import com.azamat.runnerapp.ui.viewmodels.MainViewModel
import com.azamat.runnerapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){

    //this is to get viewModel from Dagger
    private val viewModel: StatisticsViewModel by viewModels()

}