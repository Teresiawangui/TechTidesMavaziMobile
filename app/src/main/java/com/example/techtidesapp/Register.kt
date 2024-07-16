package com.example.techtidesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.techtidesapp.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textLogin.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)

        }
        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }


    }
    fun validateRegistration(){
        clearErrors()
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()){
            formError = true
            binding.tvFirstName.error = "First name is required"
        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()){
            formError = true
            binding.tvLastName.error = "Last name is required"
        }
        val email = binding.etEmail.text.toString()
        if (email.isBlank()){
            formError = true
            binding.tvEmail.error = "Email is required"
        }
        val phoneNo = binding.etPhoneNo.text.toString()
        if (phoneNo.isBlank()){
            formError = true
            binding.tvContact.error = "Phone number is required"
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()){
            formError = true
            binding.tvPassword.error = "Password is required"
        }
        val confirmPassword = binding.etConfirmPassword.text.toString()
        if (confirmPassword.isBlank()){
            formError = true
            binding.tvConfirmPassword.error = "Please confirm your password"
        }
        if(password!=confirmPassword){
            formError = true
            binding.etConfirmPassword.error  = "Password & confirmation must match!"
        }
        if (!formError){
            performRegistration(
                firstName = firstName,
                lastName = lastName,
                email = email,
                phoneNo = phoneNo,
                password = password,
                confirmPassword = confirmPassword,
            )
        }


    }

    fun clearErrors(){
        binding.etFirstName.error = null
        binding.etLastName.error = null
        binding.etEmail.error = null
        binding.etPhoneNo.error = null
        binding.etPassword.error = null
        binding.etConfirmPassword.error = null


    }

    private fun performRegistration(

        firstName: String,
        lastName:String,
        email:String,
        phoneNo:String,
        password:String,
        confirmPassword:String
    ){
        val intent = Intent(this,Login::class.java)
        startActivity(intent)
    }

}