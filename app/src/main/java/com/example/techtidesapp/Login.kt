package com.example.techtidesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.techtidesapp.databinding.ActivityLoginBinding
import com.example.techtidesapp.Register

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            validateRegistration()

        }
        binding.tvSignUpBack.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

    }


    fun validateRegistration() {
        clearForms()
        var formError = false
        val firstName = binding.etLoginName.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tvLoginName.error = "First name is required"
        }

        val password = binding.etLoginPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tvLoginPassword.error = "Please enter your password"
        }
        if (!formError) {
            val login = LoginVal(
                firstName = firstName,
                password = password
            )
        }

    }

    fun clearForms() {
        binding.etLoginName.error = null
        binding.etLoginPassword.error = null


    }





}