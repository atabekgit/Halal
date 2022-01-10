package com.halal.halal_appmwllc.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.halal.repository.Repository

class MainViewModelFactory( val repository: Repository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
     return MainViewModel(repository) as T
    }
}