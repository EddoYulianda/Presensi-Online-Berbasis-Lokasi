package com.example.presensionlinepnp.views.changepass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presensionlinepnp.R
import com.example.presensionlinepnp.databinding.ActivityChangePasswordBinding
import com.example.presensionlinepnp.databinding.ActivityMainBinding

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        onClick()
    }

    private fun onClick() {
        binding.tbChangePassword.setNavigationOnClickListener{
            finish()
        }
    }

    private fun init(){
        setSupportActionBar(binding.tbChangePassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}