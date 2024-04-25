package com.linhvng.apps.kotlin.demo1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Properties
    private lateinit var btnBirthdayCard: Button

    // Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Controls
        setControls()

        //Events
        setEvents()

        //system's option
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Main Funs
    private fun setControls() {
        btnBirthdayCard=findViewById(R.id.btnBirthdayCard)
    }

    private fun setEvents() {
        btnBirthdayCard.setOnClickListener {
            val intent = Intent(this, BirthdayCardActivity::class.java )
            startActivity(intent)
        }
    }

    // Other Funs
}