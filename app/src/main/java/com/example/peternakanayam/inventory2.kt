package com.example.peternakanayam

import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class
inventory2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        // Get TableLayout from the layout
        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)

        // Get data from Intent
        val tanggal = intent.getStringExtra("tanggal")
        val penghasilan1 = intent.getStringExtra("penghasilan1")
        val penghasilan2 = intent.getStringExtra("penghasilan2")
        val penghasilan3 = intent.getStringExtra("penghasilan3")

        // Create a new TableRow
        val newRow = TableRow(this)

        // Create TextViews for the new row
        val tanggalView = TextView(this).apply { text = tanggal }
        val kandang1View = TextView(this).apply { text = penghasilan1 }
        val kandang2View = TextView(this).apply { text = penghasilan2 }
        val kandang3View = TextView(this).apply { text = penghasilan3 }

        // Add TextViews to the TableRow
        newRow.addView(tanggalView)
        newRow.addView(kandang1View)
        newRow.addView(kandang2View)
        newRow.addView(kandang3View)

        // Add the new row to the TableLayout
        tableLayout.addView(newRow)
    }
}

