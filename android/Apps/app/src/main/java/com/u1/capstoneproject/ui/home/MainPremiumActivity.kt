package com.u1.capstoneproject.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.u1.capstoneproject.databinding.ActivityMainPremiumBinding
import com.u1.capstoneproject.ui.about.AboutActivity
import com.u1.capstoneproject.ui.home.adapter.DataAdapter
import com.u1.capstoneproject.ui.prediction_calc.CalculationActivity
import com.u1.capstoneproject.ui.setup_location.LocationSetupActivity

class MainPremiumActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainPremiumBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPremiumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.info.setOnClickListener {
            startActivity(Intent(this@MainPremiumActivity, AboutActivity::class.java))
        }

        binding.btnSwap.setOnClickListener {
            startActivity(Intent(this@MainPremiumActivity, LocationSetupActivity::class.java))
        }

        binding.btnCalc.setOnClickListener {

        }

        binding.btnForward.setOnClickListener {
            startActivity(Intent(this@MainPremiumActivity, CalculationActivity::class.java))
        }

        setSuhuRV()
        setKelembapanRV()
        setCurahHujanRV()
        setLamaPenyinaranRV()
    }

    private fun setSuhuRV(){
        val dataSuhu = viewModel.getSuhuData()
        val adapter = DataAdapter()
        adapter.setData(dataSuhu)
        val rvSuhu = binding.rvSuhu
        rvSuhu.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvSuhu.adapter = adapter
        rvSuhu.setHasFixedSize(true)
    }

    private fun setKelembapanRV(){
        val dataKelembapan = viewModel.getKelembapanData()
        val adapter = DataAdapter()
        adapter.setData(dataKelembapan)
        val rvKelembapan = binding.rvKelembapan
        rvKelembapan.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvKelembapan.adapter = adapter
        rvKelembapan.setHasFixedSize(true)
    }

    private fun setCurahHujanRV(){
        val dataCurahHujan = viewModel.getCurahHujanData()
        val adapter = DataAdapter()
        adapter.setData(dataCurahHujan)
        val rvCurahHujan = binding.rvCurah
        rvCurahHujan.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCurahHujan.adapter = adapter
        rvCurahHujan.setHasFixedSize(true)
    }

    private fun setLamaPenyinaranRV(){
        val dataLamaPenyinaran = viewModel.getLamaPenyinaranData()
        val adapter = DataAdapter()
        adapter.setData(dataLamaPenyinaran)
        val rvLamaPenyinaran = binding.rvSinar
        rvLamaPenyinaran.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvLamaPenyinaran.adapter = adapter
        rvLamaPenyinaran.setHasFixedSize(true)
    }
}