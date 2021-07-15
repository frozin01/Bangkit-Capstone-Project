package com.u1.capstoneproject.ui.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.u1.capstoneproject.R
import com.u1.capstoneproject.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

}