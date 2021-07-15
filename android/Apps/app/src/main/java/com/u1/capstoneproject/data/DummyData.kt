package com.u1.capstoneproject.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DummyData(
    val bulanTahun: String,
    val value: Double,
    val satuan: String
) : Parcelable
