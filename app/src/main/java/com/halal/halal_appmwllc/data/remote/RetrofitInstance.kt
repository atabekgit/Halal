package com.halal.halal_appmwllc.data.remote

import com.halal.halal_appmwllc.constant.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
private val retrofit by lazy {
Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
    .build()
}
val service: Service by lazy {
retrofit.create(Service::class.java)
}
}