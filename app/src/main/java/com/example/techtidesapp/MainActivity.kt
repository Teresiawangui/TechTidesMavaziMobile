package com.example.techtidesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.techtidesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvChecking.layoutManager = LinearLayoutManager(this)
        displayCheckOut()
    }
    fun displayCheckOut(){
        val checkout1 =Zaras("Cargo Pants","loosely cut pants originally designed for rough work environments and outdoor activities","$230","subtitle:$230")
        val checkout2=Zaras("Queen Money","loosely cut pants originally designed for rough work environments and outdoor activities","$230","subtitle:$230")
        val checkout3 =Zaras("White Suit","loosely cut pants originally designed for rough work environments and outdoor activities","$230","subtitle:$230")

        val myCheckout = listOf(checkout1,checkout2,checkout3)
        val checkOutAdapter = CheckOutAdapter(myCheckout)
        binding.rvChecking.adapter = checkOutAdapter



    }
}