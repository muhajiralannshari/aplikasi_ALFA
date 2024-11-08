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

class Penghasilan : AppCompatActivity() {

    private lateinit var tanggal: EditText
    private lateinit var penghasilan1: EditText
    private lateinit var penghasilan2: EditText
    private lateinit var penghasilan3: EditText
    private lateinit var confirmButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_penghasilan)

        tanggal = findViewById(R.id.tanggal)
        penghasilan1 = findViewById(R.id.penghasilan1)
        penghasilan2 = findViewById(R.id.penghasilan2)
        penghasilan3 = findViewById(R.id.penghasilan3)
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
        val penghasilan1Input = penghasilan1.text.toString()
        val penghasilan2Input = penghasilan2.text.toString()
        val penghasilan3Input = penghasilan3.text.toString()

        // Buat Intent untuk mengarahkan ke aktivitas berikutnya
        val intent = Intent(this, inventory2::class.java).apply {
            // Sisipkan data yang diinputkan ke Intent
            putExtra("tanggal", tanggalInput)
            putExtra("penghasilan1", penghasilan1Input)
            putExtra("penghasilan2", penghasilan2Input)
            putExtra("penhasilan3", penghasilan3Input)
        }
        // Mulai aktivitas baru dengan Intent yang telah dikonfigurasi
        startActivity(intent)
    }
}