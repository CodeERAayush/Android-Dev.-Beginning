package com.codeeraayush.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class mainViewModelFactory(val counter:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(counter) as T
    }

}