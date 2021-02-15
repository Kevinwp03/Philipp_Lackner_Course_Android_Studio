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

        binding.btnApply.setOnClickListener {
            Toast.makeText(applicationContext, "Button clicked", Toast.LENGTH_SHORT).show()
            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val birthDay = binding.etBirthDay.text.toString()
            val country = binding.etCountry.text.toString()
            Log.d("Main Activity", "Name : $firstName $lastName, born on : $birthDay, from $country. just applied to the formula")
        }
    }
}
