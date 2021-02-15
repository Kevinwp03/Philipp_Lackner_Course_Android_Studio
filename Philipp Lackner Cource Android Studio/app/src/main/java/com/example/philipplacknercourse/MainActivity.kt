package com.example.philipplacknercourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.philipplacknercourse.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    // private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0

        binding.btnCount.setOnClickListener {
            count++
            binding.tvCount.text = "Let's count Together = $count"
        }
    }
}
