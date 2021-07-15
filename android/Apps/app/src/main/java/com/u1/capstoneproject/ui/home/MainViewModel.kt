package com.u1.capstoneproject.ui.home

import androidx.lifecycle.ViewModel
import com.u1.capstoneproject.data.DummyBuilder
import com.u1.capstoneproject.data.DummyData

class MainViewModel: ViewModel(){
    fun getSuhuData(): List<DummyData> = DummyBuilder.generateSuhuData()

    fun getKelembapanData(): List<DummyData> = DummyBuilder.generateKelembapanData()

    fun getCurahHujanData(): List<DummyData> = DummyBuilder.generateCurahHujanData()

    fun getLamaPenyinaranData(): List<DummyData> = DummyBuilder.generateLamaPenyinaranData()
}