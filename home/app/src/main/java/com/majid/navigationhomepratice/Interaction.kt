package com.majid.navigationhomepratice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        binding.btnadd.setOnClickListener {
            changecolor.add(10)
            Toast.makeText(this,"Click", Toast.LENGTH_LONG).show()
        }
        binding.btnsub.setOnClickListener {
            changecolor.sub(10)

        }
    }
}