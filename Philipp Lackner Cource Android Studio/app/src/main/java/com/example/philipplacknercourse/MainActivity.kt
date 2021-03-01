package com.example.philipplacknercourse

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Spinner
        val customList = listOf("First", "Second", "Third", "Fourt")
        val adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, customList)
        spMonths.adapter = adapter

        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long,
            ) {
                Toast.makeText(this@MainActivity,
                    "You Selected ${parent?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) { //NotImportant
            }
        }

        //AlertDialog
        val addContactDialog = AlertDialog.Builder(this)
            .setIcon(R.drawable.ic_add_contact)
            .setTitle("Add Contact")
            .setMessage("Do you want to Add Ms. Dian to your contact list?")
            .setPositiveButton("YES") { _, _ ->  // " _ " : artinya tidak menjalankan program tertentu
                Toast.makeText(this, "You added Ms. Dian to Your Contact", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("NO") { _, _ ->
                Toast.makeText(this, "You didn't add Ms. Dian to Your Contact", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        // Alert Dialog Untuk beberapa Pilihan (Single Choice Option)
        val option = arrayOf("First Option", "Second Option", "Third Option")
        val singelChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these option")
            .setSingleChoiceItems(option, 0) { _, i ->
                Toast.makeText(this, "You Click On ${option[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("YES"){ _,_ ->  // " _ " : artinya tidak menjalankan program tertentu
                Toast.makeText(this, "You accept the Single Choice Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("NO"){ _,_ ->
                Toast.makeText(this, "You declined the Single Choice Dialog", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog2.setOnClickListener {
            singelChoiceDialog.show()
        }

        val multiplyChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these option")
            .setMultiChoiceItems(option, booleanArrayOf(false, false, false)) {_, i, isChecked ->
                if (isChecked){
                Toast.makeText(this, "You Checked ${option[i]}", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "You Uncheked ${option[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("YES"){ _,_ ->  // " _ " : artinya tidak menjalankan program tersebut
                Toast.makeText(this, "You accept the Multiply Choice Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("NO"){ _,_ ->
                Toast.makeText(this, "You declined the Multiply Choice Dialog", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog3.setOnClickListener {
            multiplyChoiceDialog.show()
        }
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
