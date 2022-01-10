package com.halal.repository

import com.halal.halal_appmwllc.data.remote.RetrofitInstance
import com.halal.halal_appmwllc.model.*
import retrofit2.Response

class Repository {

    suspend fun postApplication(application: Application):Response<Application>{
        return RetrofitInstance.service.postApplication(application)
    }

    suspend fun getAllBanners(): Response<List<Banner>> {
        return RetrofitInstance.service.getAllBanners()
    }
    suspend fun getBannerById(id: Int): Response<Banner> {
        return RetrofitInstance.service.getBannerById(id)
    }

    suspend fun getAllQuestion(): Response<List<Question>> {
        return RetrofitInstance.service.getAllQuestions()
    }
    suspend fun getQuestionBy(id: Int): Response<Question> {
        return RetrofitInstance.service.getQuestionById(id)
    }
    suspend fun postQuestion(question: Question):Response<Question>{
        return RetrofitInstance.service.postQuestion(question)
    }

    suspend fun getAllCodes():Response<List<ECode>>{
        return RetrofitInstance.service.getAllCodes()
    }
    suspend fun getCodeById(id:Int):Response<ECode>{
        return RetrofitInstance.service.getCodeById(id)
    }

    suspend fun getAllCategory(): Response<Category> {
        return RetrofitInstance.service.getAllCategory()
    }

    suspend fun getAllTimes():Response<List<Time>>{
        return RetrofitInstance.service.getAllTimes()
    }
    suspend fun getTimeByDate(date:String):Response<Time>{
        return RetrofitInstance.service.getTimeByDate(date)
    }
    suspend fun deleteTimeByDate(date:String):Response<Time>{
        return RetrofitInstance.service.deleteTimeByDate(date)
    }

suspend fun postRegister(user: User):Response<User>{
   return RetrofitInstance.service.postRegister(user)
}
}