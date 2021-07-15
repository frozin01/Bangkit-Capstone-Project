package com.u1.capstoneproject.ui.setup_location

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.u1.capstoneproject.R
import com.u1.capstoneproject.databinding.ActivityLocationSetupBinding
import com.u1.capstoneproject.ui.home.MainActivity
import com.u1.capstoneproject.ui.home.MainPremiumActivity

class LocationSetupActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    private lateinit var binding : ActivityLocationSetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val state = intent.getIntExtra(EXTRA_ID, 0)

        checkVisibility(state)

        binding.btnFree.setOnClickListener {
            startActivity(Intent(this@LocationSetupActivity, MainActivity::class.java))
            finish()
        }

        binding.btnPremium.setOnClickListener {
            startActivity(Intent(this@LocationSetupActivity, MainPremiumActivity::class.java))
            finish()
        }

        binding.btnSelect.setOnClickListener {
            onBackPressed()
        }
    }

    fun checkVisibility(state: Int){
        if (state == 0) {
            binding.btnPremium.visibility = View.GONE
            binding.btnFree.visibility = View.GONE
            binding.btnSelect.visibility = View.VISIBLE
        } else {
            binding.btnPremium.visibility = View.VISIBLE
            binding.btnFree.visibility = View.VISIBLE
            binding.btnSelect.visibility = View.GONE
        }
    }
}