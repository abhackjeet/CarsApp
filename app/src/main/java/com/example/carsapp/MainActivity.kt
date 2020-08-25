package com.example.carsapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model("Koenigsegg", "Koenigsegg Agera R", R.drawable.agera, "I just love this Supercar"))

        list.add(Model("Bugatti", "Bugatti Cherron", R.drawable.cherron,"The fastest car in the world"))

        list.add(Model("Lamborghini", "Lamborghini Gallardo", R.drawable.gallardo, "Famous in its own category"))

        list.add(Model("Lamborghini", "Lamborghini Veneno", R.drawable.veneno,"Veneno claims the best design award"))

        list.add(Model("Lamborghini", "Lamborghini Terzo Milanio", R.drawable.terzo, "Terzo milanio yet to come in the market"))


        listview.adapter= CarAdapter(this, R.layout.row, list)


        }


    }



