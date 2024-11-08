package com.example.peternakanayam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var buttonTambahData: LinearLayout
    private lateinit var buttonPenghasilan: LinearLayout
    private lateinit var buttonLokasi: LinearLayout
    private lateinit var inventory: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTambahData = findViewById(R.id.button_TambahData)
        inventory = findViewById(R.id.penyimpanan)
        buttonPenghasilan = findViewById(R.id.button_Penghasilan)
        buttonLokasi = findViewById(R.id.lokasi)

        buttonTambahData.setOnClickListener {
            val intentTambahData = Intent(this, TambahData::class.java)
            startActivity(intentTambahData)
        }

        buttonPenghasilan.setOnClickListener {
            val intentPenghasilan = Intent(this, Penghasilan::class.java)
            startActivity(intentPenghasilan)
        }
        inventory.setOnClickListener {
            val intentinventory1 = Intent(this, inventory1::class.java)
            startActivity(intentinventory1)
        }

        inventory.setOnClickListener {
            val intentinventory2 = Intent(this, inventory2::class.java)
            startActivity(intentinventory2)
        }

        buttonLokasi.setOnClickListener {
            val intentLokasi = Intent(this, MapActivity::class.java)
            startActivity(intentLokasi)
        }
    }
}