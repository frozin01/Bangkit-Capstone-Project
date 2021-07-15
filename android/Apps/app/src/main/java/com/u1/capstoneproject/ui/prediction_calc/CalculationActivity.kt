package com.u1.capstoneproject.ui.prediction_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.u1.capstoneproject.data.ParamData
import com.u1.capstoneproject.databinding.ActivityCalculationBinding
import com.u1.capstoneproject.ui.prediction_res.ResultActivity

class CalculationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCalculationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnCalc.setOnClickListener {
            binding.apply {
                val param1 = input1.text.toString()
                val param2 = input2.text.toString()
                val param3 = input3.text.toString()
                val param4 = input4.text.toString()
                val param5 = input5.text.toString()
                val param6 = input6.text.toString()
                val param7 = input7.text.toString()
                val param8 = input8.text.toString()
                val param9 = input9.text.toString()
                val param10 = input10.text.toString()
                val param11 = input11.text.toString()
                val param12 = input12.text.toString()
                val param13 = input13.text.toString()
                val param14 = input14.text.toString()
                val param15 = input15.text.toString()
                val param16 = input16.text.toString()
                val param17 = input17.text.toString()

                when {
                    param1.isEmpty() -> {
                        input1.error = "Masih Kosong"
                    }
                    param2.isEmpty() -> {
                        input2.error = "Masih Kosong"
                    }
                    param3.isEmpty() -> {
                        input3.error = "Masih Kosong"
                    }
                    param4.isEmpty() -> {
                        input4.error = "Masih Kosong"
                    }
                    param5.isEmpty() -> {
                        input5.error = "Masih Kosong"
                    }
                    param6.isEmpty() -> {
                        input6.error = "Masih Kosong"
                    }
                    param7.isEmpty() -> {
                        input7.error = "Masih Kosong"
                    }
                    param8.isEmpty() -> {
                        input8.error = "Masih Kosong"
                    }
                    param9.isEmpty() -> {
                        input9.error = "Masih Kosong"
                    }
                    param10.isEmpty() -> {
                        input10.error = "Masih Kosong"
                    }
                    param11.isEmpty() -> {
                        input11.error = "Masih Kosong"
                    }
                    param12.isEmpty() -> {
                        input12.error = "Masih Kosong"
                    }
                    param13.isEmpty() -> {
                        input13.error = "Masih Kosong"
                    }
                    param14.isEmpty() -> {
                        input14.error = "Masih Kosong"
                    }
                    param15.isEmpty() -> {
                        input15.error = "Masih Kosong"
                    }
                    param16.isEmpty() -> {
                        input16.error = "Masih Kosong"
                    }
                    param17.isEmpty() -> {
                        input17.error = "Masih Kosong"
                    }
                    else -> {
                        val data = setData(
                                param1, param2, param3, param4, param5, param6, param7,
                                param8, param9, param10, param11, param12, param13,
                                param14, param15, param16, param17)
                        sendIntent(data)
                    }
                }
            }
        }
    }

    private fun setData(
        param1: String,
        param2: String,
        param3: String,
        param4: String,
        param5: String,
        param6: String,
        param7: String,
        param8: String,
        param9: String,
        param10: String,
        param11: String,
        param12: String,
        param13: String,
        param14: String,
        param15: String,
        param16: String,
        param17: String
    ) : ParamData {
        return ParamData(
                param1.toDouble(), param2.toDouble(), param3.toDouble(), param4.toDouble(), param5.toDouble(), param6.toDouble(), param7.toDouble(),
                param8.toDouble(), param9.toDouble(), param10.toDouble(), param11.toDouble(), param12.toDouble(), param13.toDouble(), param14.toDouble(),
                param15.toDouble(), param16.toDouble(), param17.toDouble()
        )
    }

    private fun sendIntent(data: ParamData){
        val intent = Intent(this@CalculationActivity, ResultActivity::class.java)
        intent.putExtra(ResultActivity.EXTRA_RES, data)
        startActivity(intent)
    }
}