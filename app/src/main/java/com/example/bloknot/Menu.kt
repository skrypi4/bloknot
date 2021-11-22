package com.example.bloknot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonPlus = findViewById<ImageButton>(R.id.imageButtonPlus)
        val listView = findViewById<ListView>(R.id.listView)

        val zametki: ArrayList<String> = ArrayList()

        zametki.add("1")
        zametki.add("2")
        zametki.add("3")

        val adapter = Adapter(zametki)
        listView.adapter = adapter






    }
}