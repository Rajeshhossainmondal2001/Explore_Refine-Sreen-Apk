package com.example.refine_explore_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip

class RefineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)
        val textView: TextView = findViewById<TextView>(R.id.cp1)
        var isSelected = false // To track selection state

        textView.setOnClickListener {
            isSelected = !isSelected // Toggle selection state
            if (isSelected) {
                // Change text color when selected
                textView.setTextColor(ContextCompat.getColor(this, R.color.text_color))
            } else {
                // Change text color back to the default when deselected
                textView.setTextColor(ContextCompat.getColor(this, R.color.tv_background_color))
            }
        }

        val autoComplete :AutoCompleteTextView = findViewById(R.id.auto_complete)
        
        val adapter = ArrayAdapter.createFromResource(this,R.array.Availability,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        autoComplete.setAdapter(adapter)
        autoComplete.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, i, l ->

        }
    }
}