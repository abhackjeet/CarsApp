package com.example.carsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.AdapterView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model("Koenigsegg", "Koenigsegg Agera R", R.drawable.agera))

        list.add(Model("Bugatti", "Bugatti Cherron", R.drawable.cherron))

        list.add(Model("Lamborghini", "Lamborghini Gallardo", R.drawable.gallardo))

        list.add(Model("Lamborghini", "Lamborghini Veneno", R.drawable.veneno))

        list.add(Model("Lamborghini", "Lamborghini Terzo Milanio", R.drawable.terzo))


        listview.adapter= CarAdapter(this, R.layout.row, list)


        //onclick listener


        listview.setOnItemClickListener { parent: AdapterView<*>, view:View, position:Int, id:Long ->


            if(position==0)
            {
                Toast.makeText(this@MainActivity,  "I just love this Supercar :)", Toast.LENGTH_LONG).show()

            }

            if(position==1)
            {
                Toast.makeText(this@MainActivity,  "The fastest car in the world", Toast.LENGTH_LONG).show()

            }

            if(position==2)
            {
                Toast.makeText(this@MainActivity,  "Famous in its own category", Toast.LENGTH_LONG).show()

            }


            if(position==3)
            {
                Toast.makeText(this@MainActivity,  "Veneno claims the best design award", Toast.LENGTH_LONG).show()

            }


            if(position==4)
            {
                Toast.makeText(this@MainActivity,  "Terzo milanio yet to come in the market", Toast.LENGTH_LONG).show()

            }


        }


    }
}


