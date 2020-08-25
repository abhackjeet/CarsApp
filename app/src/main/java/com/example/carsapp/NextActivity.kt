package com.example.carsapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {
    lateinit var imagc: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)
        imagc = findViewById(R.id.google)
        attachListener()
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

    }
    fun attachListener(){
        imagc.setOnClickListener  {


            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}