package com.example.techtidesapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.techtidesapp.databinding.ActivityPaymentBinding

class Payment : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnPay.setOnClickListener {
            val intent = Intent(this,Contact::class.java)
            startActivity(intent)
        }
        binding.btnPay.setOnClickListener { validatePaymeent() }
    }
    fun validatePaymeent(){
        clearErrors()
        var formError = false
        val phonenumber = binding.rvEnterPhone.text.toString()
        if (phonenumber.isBlank()){
            formError = true
            binding.rvPhone.error = "Phone number required"
        }
        val pin = binding.rvEnterPin.text.toString()
        if (pin.isBlank()){
            formError = true
            binding.rvPhone.error = "PIN required"
        }
    }
    fun clearErrors(){
        binding.rvPhone.error = null
        binding.rvText.error = null
    }
}