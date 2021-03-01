package com.example.philipplacknercourse

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "You Click on Add Contact", Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish() // Otomatis keluar
            R.id.miFavorites -> Toast.makeText(this, "You Click on Favorite", Toast.LENGTH_SHORT).show()
            R.id.miFeedback -> Toast.makeText(this, "You Click on Feedback", Toast.LENGTH_SHORT).show()
            R.id.miSetting -> Toast.makeText(this, "You Click on Setting", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
