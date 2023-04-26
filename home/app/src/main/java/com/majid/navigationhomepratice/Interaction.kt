package com.majid.navigationhomepratice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.majid.navigationhomepratice.databinding.ActivityInteractionBinding

class Interaction : AppCompatActivity() {
    lateinit var binding: ActivityInteractionBinding
    lateinit var changecolor: Changecolor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInteractionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnClick.setOnClickListener {
changecolor.color(1)
        }
    }
}