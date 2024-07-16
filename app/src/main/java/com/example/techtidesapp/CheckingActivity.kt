package com.example.techtidesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.techtidesapp.databinding.ActivityCheckingBinding
import com.example.techtidesapp.databinding.ActivityDeliveryBinding

class CheckingActivity : AppCompatActivity() {
    lateinit var binding: ActivityCheckingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCheckingBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}