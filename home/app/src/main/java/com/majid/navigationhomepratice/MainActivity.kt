package com.majid.navigationhomepratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.majid.navigationhomepratice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.NavHost)
        binding.bottom.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.first -> {
                    navController.navigate(R.id.first)
                }

                R.id.second -> {
                    navController.navigate(R.id.second)
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}