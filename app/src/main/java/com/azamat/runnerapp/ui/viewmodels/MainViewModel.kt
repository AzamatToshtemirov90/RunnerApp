package com.azamat.runnerapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.azamat.runnerapp.repositories.MainRepository
import javax.inject.Inject
//import androidx.hilt.lifecycle.ViewModelInject
import dagger.hilt.android.lifecycle.HiltViewModel

//MainViewModel's role is to collect the data from MainRepository
// and to provide it into Fragments/Activities
@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel(){
}