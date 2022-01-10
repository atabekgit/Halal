package com.halal.repository

import com.halal.halal_appmwllc.data.remote.RetrofitInstance
import com.halal.halal_appmwllc.model.Banner
import com.halal.halal_appmwllc.model.Category
import com.halal.halal_appmwllc.model.Question
import retrofit2.Response

class Repository {

    suspend fun getAllCategory(): Response<Category> {
        return RetrofitInstance.service.getAllCategory()
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
}