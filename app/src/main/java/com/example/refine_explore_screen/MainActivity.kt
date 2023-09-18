package com.example.refine_explore_screen

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.l, "Rajesh"))
        data.add(ItemsViewModel(R.drawable.a, "Subhasish"))
        data.add(ItemsViewModel(R.drawable.b, "Sandip"))
        data.add(ItemsViewModel(R.drawable.c, "Samir"))
        data.add(ItemsViewModel(R.drawable.d, "Anil"))
        data.add(ItemsViewModel(R.drawable.e, "Raju"))
        data.add(ItemsViewModel(R.drawable.f, "Manish"))
        data.add(ItemsViewModel(R.drawable.m, "Sairam"))
        val adapter = CustomAdapter(data)


        recyclerview.adapter = adapter

    }
}
