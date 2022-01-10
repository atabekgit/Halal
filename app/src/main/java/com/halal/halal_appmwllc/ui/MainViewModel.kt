package com.halal.halal_appmwllc.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.halal.halal_appmwllc.data.remote.RetrofitInstance
import com.halal.halal_appmwllc.model.Category
import com.halal.halal_appmwllc.model.Question
import com.halal.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class MainViewModel( val repository: Repository) : ViewModel() {

    var category: MutableLiveData<Response<Category>> = MutableLiveData()

    fun getAllCategory(){
viewModelScope.launch {
    val response =repository.getAllCategory()
    category.value = response
}
    }
}