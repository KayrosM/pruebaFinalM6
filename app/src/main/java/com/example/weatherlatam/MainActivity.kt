package com.example.weatherlatam

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherlatam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val backgroundColor = BuildConfig.BKCOLOR
        setBackgroundColor(backgroundColor)
    }

    private fun setBackgroundColor(colorName: String) {
        val color = when (colorName) {
            "white" -> Color.WHITE
            "orange" -> Color.rgb(255, 165, 0)
            "black" -> Color.BLACK
            else -> Color.TRANSPARENT
        }
        binding.root.setBackgroundColor(color)
    }
}
