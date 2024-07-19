package com.example.techtidesapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.techtidesapp.Homepage
import com.example.techtidesapp.databinding.ActivityContactBinding

class Contact : AppCompatActivity() {
    lateinit var binding: ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSendMessage.setOnClickListener {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

    }
}