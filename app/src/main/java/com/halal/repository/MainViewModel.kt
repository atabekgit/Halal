package com.halal.repository

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.halal.halal_appmwllc.data.remote.RetrofitInstance
import com.halal.halal_appmwllc.model.Question
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class MainViewModel() : ViewModel() {

 var  questionList:MutableLiveData<Response<List<Question>>> = MutableLiveData()

}