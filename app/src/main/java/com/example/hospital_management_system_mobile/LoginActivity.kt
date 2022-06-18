package com.example.hospital_management_system_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hospital_management_system_mobile.commons.Patterns
import com.example.hospital_management_system_mobile.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginActivityBinding

    var email : String = ""
    private var password : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)

        email = binding.email.text.toString()
        password = binding.password.text.toString()

        if (!email.matches(Regex(Patterns.EMAIL_PATTERNS)))
            binding.emailInputLayout.error = "Enter a valid email"
        else if (password.isEmpty() || password.length < 6)
            binding.passwordInputLayout.error = "Enter a valid Password"
        else binding.loginBtn.setOnClickListener { startActivity(Intent(this, ProfileActivity::class.java)) }

        setContentView(binding.root)
    }
}