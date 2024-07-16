package com.example.techtidesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.techtidesapp.databinding.ActivityDeliveryBinding

class Delivery : AppCompatActivity() {
    lateinit var binding: ActivityDeliveryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeliveryBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvButton2.setOnClickListener {
            val intent =Intent(this,CheckoutViewHolder::class.java)
            startActivity(intent)
        }
        fun validateDelivery(){
//            clearErrors()
            var formError = false
            val email = binding.rvEmail.text.toString()
            if (email.isBlank()){
                formError = true
                binding.tilEmail.error = "Email required"
            }
            val address = binding.rvAddress.text.toString()
            if (address.isBlank()){
                formError = true
                binding.tilAddress.error = "Address required"
            }
            val country = binding.rvCountry.text.toString()
            if (country.isBlank()){
                formError = true
                binding.tilCountry.error = "Country required"
            }
            val city = binding.rvCity.text.toString()
            if (city.isBlank()){
                formError = true
                binding.tilCity.error = "City required"
            }
        }
        fun clearErrors(){
            binding.tilEmail.error = null
            binding.tilAddress.error = null
            binding.tilCountry.error = null
            binding.tilCity.error = null
        }

    }
}