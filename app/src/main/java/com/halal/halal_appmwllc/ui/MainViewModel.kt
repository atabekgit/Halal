package com.halal.halal_appmwllc.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.halal.halal_appmwllc.model.*
import com.halal.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(val repository: Repository) : ViewModel() {

    var postQuestionData: MutableLiveData<Response<Question>> = MutableLiveData()
    var getCategoryData: MutableLiveData<Response<Category>> = MutableLiveData()
    var getQuestionData: MutableLiveData<Response<Question>> = MutableLiveData()
    var getQuestionsData: MutableLiveData<Response<List<Question>>> = MutableLiveData()
    var getBannersData: MutableLiveData<Response<List<Banner>>> = MutableLiveData()
    var getBannerByIdData: MutableLiveData<Response<Banner>> = MutableLiveData()
    var getCodesData: MutableLiveData<Response<List<ECode>>> = MutableLiveData()
    var getCodeByIdData:MutableLiveData<Response<ECode>> = MutableLiveData()
    var getTimesData:MutableLiveData<Response<List<Time>>> = MutableLiveData()
    var getTimeByDateData:MutableLiveData<Response<Time>> = MutableLiveData()
    var deleteTimeByDateData:MutableLiveData<Response<Time>> = MutableLiveData()
    var postApplicationData:MutableLiveData<Response<Application>> = MutableLiveData()
    var postRegisterData:MutableLiveData<Response<User>> = MutableLiveData()

    fun getAllCategory() {
        viewModelScope.launch {
            val response = repository.getAllCategory()
            getCategoryData.value = response
        }
    }

    fun postQuestion(question: Question) {
        viewModelScope.launch {
            val response = repository.postQuestion(question)
            postQuestionData.value = response
        }
    }
    fun getAllQuestion() {
        viewModelScope.launch {
            val response = repository.getAllQuestion()
            getQuestionsData.value = response
        }
    }
    fun getQuestionById(id: Int) {
        viewModelScope.launch {
            val response = repository.getQuestionBy(id)
            getQuestionData.value = response
        }
    }

    fun getAllBanners() {
        viewModelScope.launch {
            val response = repository.getAllBanners()
            getBannersData.value = response
        }
    }
    fun getBannerById(id: Int) {
        viewModelScope.launch {
            val response = repository.getBannerById(id)
            getBannerByIdData.value = response
        }
    }

    fun getAllCodes() {
        viewModelScope.launch {
            val response = repository.getAllCodes()
            getCodesData.value = response
        }
    }
    fun getCodeById(id:Int){
        viewModelScope.launch {
            val response = repository.getCodeById(id)
            getCodeByIdData.value = response
        }
    }

    fun getAllTimes(){
        viewModelScope.launch {
            val response = repository.getAllTimes()
            getTimesData.value = response
        }
    }
    fun getTimeByDate(date:String){
        viewModelScope.launch {
        val response = repository.getTimeByDate(date)
        getTimeByDateData.value = response
    }
    }
    fun deleteTimeByDate(date:String){
        viewModelScope.launch {
            val response = repository.deleteTimeByDate(date)
            deleteTimeByDateData.value = response
        }
    }

    fun postApplication(application: Application){
        viewModelScope.launch {
            val response = repository.postApplication(application)
            postApplicationData.value = response
        }
    }
    fun postRegister(user: User){
        viewModelScope.launch {
            val response = repository.postRegister(user)
            postRegisterData.value = response
        }
    }
}