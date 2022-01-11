package com.halal.halal_appmwllc.data.remote

import com.halal.halal_appmwllc.model.*
import retrofit2.Response
import retrofit2.http.*

interface Service {

    @POST("application/")
    suspend fun postApplication(@Body application: Application):Response<Application>

    @GET("banners/all/")
    suspend fun getAllBanners(): Response<List<Banner>>

    @GET("banners/{id}/")
    suspend fun getBannerById(@Path("id") id: Int): Response<Banner>

    @GET("questions/all/")
    suspend fun getAllQuestions(): Response<List<Question>>

    @GET("questions/{id}/")
    suspend fun getQuestionById(@Path("id") id: Int): Response<Question>

    @POST("questions/all/")
    suspend fun postQuestion(@Body question: Question): Response<Question>

    @GET("companies/category/all/")
    suspend fun getAllCategory(): Response<Category>

    @GET("codes/all/")
    suspend fun getAllCodes(): Response<List<ECode>>

    @GET("codes/{id}/")
    suspend fun getCodeById(@Path("id") id: Int): Response<ECode>

    @GET("times/time/all/")
    suspend fun getAllTimes(): Response<List<Time>>

    @GET("times/time/{date}/")
    suspend fun getTimeByDate(@Path("date")date:String):Response<Time>

    @DELETE("times/time/{date}/")
    suspend fun deleteTimeByDate(@Path("date")date:String):Response<Time>

    @POST("auth/register/")
    suspend fun postRegister(@Body user: User):Response<User>
}
//sdas