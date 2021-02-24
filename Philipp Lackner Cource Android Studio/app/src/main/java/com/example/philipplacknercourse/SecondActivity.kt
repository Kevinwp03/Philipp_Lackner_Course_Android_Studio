package com.example.philipplacknercourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person // "as Person" rekomendasi :di gunakan agar val person mendapatkan lokasi file class dengan spesifik
        tvPerson.text = person.toString()
    }
}