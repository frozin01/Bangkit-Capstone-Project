package com.u1.capstoneproject.ui.prediction_res

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.u1.capstoneproject.network.api.ApiHelper
import com.u1.capstoneproject.network.data.ResponseData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResultViewModel : ViewModel() {
    var result = MutableLiveData<ResponseData>()

    private val apiInstance = ApiHelper.instance

    fun calculate(
            param1: Double,
            param2: Double,
            param3: Double,
            param4: Double,
            param5: Double,
            param6: Double,
            param7: Double,
            param8: Double,
            param9: Double,
            param10: Double,
            param11: Double,
            param12: Double,
            param13: Double,
            param14: Double,
            param15: Double,
            param16: Double,
            param17: Double
    ){
        apiInstance.getResult(
                param1, param2, param3, param4, param5, param6, param7,
                param8, param9, param10, param11, param12, param13,
                param14, param15, param16, param17
        ).enqueue(object : Callback<ResponseData> {
            override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                if (response.isSuccessful){
                    result.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                Log.e("Fail", t.message.toString())
            }
        })
    }

    fun getResult(): LiveData<ResponseData> {
        return result
    }
}