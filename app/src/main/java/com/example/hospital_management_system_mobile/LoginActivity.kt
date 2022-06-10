package com.example.hospital_management_system_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hospital_management_system_mobile.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)


        setContentView(binding.root)
    }
}