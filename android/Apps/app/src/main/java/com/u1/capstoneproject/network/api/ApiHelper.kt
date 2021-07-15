package com.u1.capstoneproject.network.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiHelper {
    private const val BASE_URL = "https://backend-rc-nchlkb6oxa-et.a.run.app/"

    val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val instance = retrofit.create(ApiInterface::class.java)
}