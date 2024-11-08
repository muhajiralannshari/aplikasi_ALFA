package com.example.peternakanayam

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.peternakanayam.R
import java.util.Calendar
import kotlin.math.tan

class TambahData : AppCompatActivity() {

    private lateinit var tanggal: EditText
    private lateinit var kandang1: EditText
    private lateinit var kandang2: EditText
    private lateinit var kandang3: EditText
    private lateinit var confirmButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tambah_data)

        tanggal = findViewById(R.id.tanggal)
        kandang1 = findViewById(R.id.kandang1)
        kandang2 = findViewById(R.id.kandang2)
        kandang3 = findViewById(R.id.kandang3)
        confirmButton = findViewById(R.id.confirm_button)

        tanggal.setOnClickListener {
            showDatePickerDialog()
        }

        confirmButton.setOnClickListener {
            confirmData()
        }
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                val date = "$dayOfMonth/${month + 1}/$year"
                tanggal.setText(date)
            },
            year, month, day
        )
        datePickerDialog.show()
    }

    private fun confirmData() {
        val tanggalInput = tanggal.text.toString()
        val kandang1Input = kandang1.text.toString()
        val kandang2Input = kandang2.text.toString()
        val kandang3Input = kandang3.text.toString()

        // Buat Intent untuk mengarahkan ke aktivitas berikutnya
        val intent = Intent(this, inventory1::class.java).apply {
            // Sisipkan data yang diinputkan ke Intent
            putExtra("tanggal", tanggalInput)
            putExtra("kandang1", kandang1Input)
            putExtra("kandang2", kandang2Input)
            putExtra("kandang3", kandang3Input)
        }
        // Mulai aktivitas baru dengan Intent yang telah dikonfigurasi
        startActivity(intent)
    }
}