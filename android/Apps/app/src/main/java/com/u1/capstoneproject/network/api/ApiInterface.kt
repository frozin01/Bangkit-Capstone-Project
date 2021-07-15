package com.u1.capstoneproject.network.api

import com.u1.capstoneproject.network.data.ResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @GET("api/crops_predict")
    fun getResult(
            @Query("param1") param1: Double,
            @Query("param2") param2: Double,
            @Query("param3") param3: Double,
            @Query("param4") param4: Double,
            @Query("param5") param5: Double,
            @Query("param6") param6: Double,
            @Query("param7") param7: Double,
            @Query("param8") param8: Double,
            @Query("param9") param9: Double,
            @Query("param10") param10: Double,
            @Query("param11") param11: Double,
            @Query("param12") param12: Double,
            @Query("param13") param13: Double,
            @Query("param14") param14: Double,
            @Query("param15") param15: Double,
            @Query("param16") param16: Double,
            @Query("param17") param17: Double
    ) : Call<ResponseData>

}