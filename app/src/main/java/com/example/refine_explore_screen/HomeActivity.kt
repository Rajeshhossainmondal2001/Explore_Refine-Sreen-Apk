package com.example.refine_explore_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val Explore = findViewById<Button>(R.id.button)
        val Refine = findViewById<Button>(R.id.button2)
        Explore.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        Refine.setOnClickListener {
            val intent = Intent(this,RefineActivity::class.java)
            startActivity(intent)
        }
    }
}