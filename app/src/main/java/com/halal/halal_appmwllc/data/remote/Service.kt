package com.halal.halal_appmwllc.data.remote

import com.halal.halal_appmwllc.model.Banner
import com.halal.halal_appmwllc.model.Language
import com.halal.halal_appmwllc.model.Question
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface Service {

    @GET("banners/all/")
    suspend fun getAllBanners(): Response<List<Banner>>

    @GET("banners/{id}/")
    suspend fun getBanner(@Path("id") id: Int): Response<Banner>

    @GET("questions/all/")
    suspend fun getAllQuestions():Response<List<Question>>

    @GET("questions/{id}/")
    suspend fun getQuestion(@Path("id")id:Int):Response<Question>

    @GET("companies/category/all/")
    suspend fun getAllCategory():Response<Language>

}