package com.u1.capstoneproject.ui.prediction_res

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.u1.capstoneproject.data.ParamData
import com.u1.capstoneproject.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_RES = "extra_res"
    }

    private lateinit var binding: ActivityResultBinding

    private val viewModel: ResultViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        val data = intent.getParcelableExtra<ParamData>(EXTRA_RES) as ParamData

        if (data != null) {
            showLoading(true)
            viewModel.calculate(
                    data.param1, data.param2, data.param3, data.param4, data.param5, data.param6, data.param7,
                    data.param8, data.param9, data.param10, data.param11, data.param12, data.param13,
                    data.param14, data.param15, data.param16, data.param17)
        }

        viewModel.getResult().observe(this,{
            if (it != null){
                showLoading(false)
                val result = it.Produksi
                setText(result)
            }
        })
    }

    private fun setText(result: Double){
        binding.totalRes.text = result.toString()
    }

    private fun showLoading(state: Boolean){
        if(state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.GONE
        }
    }

}