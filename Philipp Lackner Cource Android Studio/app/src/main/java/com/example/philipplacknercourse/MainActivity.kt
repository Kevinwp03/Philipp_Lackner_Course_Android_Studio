package com.example.philipplacknercourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.philipplacknercourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            binding.Ivanime.setImageResource(R.drawable.anim_satoru_gojo)
            Toast.makeText(applicationContext, "Satoru Gojo", Toast.LENGTH_SHORT).show()
        }

    }
}
