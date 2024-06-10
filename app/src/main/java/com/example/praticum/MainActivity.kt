package com.example.praticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare the Variable
        val button = findViewById<Button>(R.id.button)
        // Set button On Click Listener
        button.setOnClickListener {
            // Create the explicit intent
            val intent = Intent(this, Weather::class.java)
            // Start Activity
            startActivity(intent)
        }



    }
}