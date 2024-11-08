package com.example.peternakanayam

import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class inventory1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        // Get TableLayout from the layout
        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)

        // Get data from Intent
        val tanggal = intent.getStringExtra("tanggal")
        val kandang1 = intent.getStringExtra("kandang1")
        val kandang2 = intent.getStringExtra("kandang2")
        val kandang3 = intent.getStringExtra("kandang3")

        // Create a new TableRow
        val newRow = TableRow(this)

        // Create TextViews for the new row
        val tanggalView = TextView(this).apply { text = tanggal }
        val kandang1View = TextView(this).apply { text = kandang1 }
        val kandang2View = TextView(this).apply { text = kandang2 }
        val kandang3View = TextView(this).apply { text = kandang3 }

        // Add TextViews to the TableRow
        newRow.addView(tanggalView)
        newRow.addView(kandang1View)
        newRow.addView(kandang2View)
        newRow.addView(kandang3View)

        // Add the new row to the TableLayout
        tableLayout.addView(newRow)
    }
}