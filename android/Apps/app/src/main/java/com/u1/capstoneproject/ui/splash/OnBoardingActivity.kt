package com.u1.capstoneproject.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.u1.capstoneproject.databinding.ActivityOnBoardingBinding
import com.u1.capstoneproject.ui.setup_location.LocationSetupActivity

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding

    private val id = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this@OnBoardingActivity, LocationSetupActivity::class.java)
            intent.putExtra(LocationSetupActivity.EXTRA_ID, 1)
            startActivity(intent)
            finish()
        }
    }
}