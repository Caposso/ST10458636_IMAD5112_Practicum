package com.example.praticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedWeather : AppCompatActivity() {
    val weekDays = arrayOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )
    val weather = arrayOf("Sunny", "Cloudy", "Sunny", "Rain", "Rain", "Cold", "Cold")
    val minTemperature = arrayOf(17, 13, 18, 11, 10, 8, 9)
    val maxTemperature = arrayOf(25, 23, 27, 21, 20, 15, 13)
    val textDay: TextView = findViewById(R.id.textDay)
    val textWeather: TextView = findViewById(R.id.textWeather)
    val textMinTemp: TextView =  findViewById(R.id.textMinTemp)
    val textMaxTemp: TextView = findViewById(R.id.textMaxTemp)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_weather)

        // Declare the Variable
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        // Set button On Click Listener
        buttonBack.setOnClickListener {
            // Create the explicit intent
            val intent = Intent(this, MainActivity::class.java)
            // Start Activity
            startActivity(intent)
        }





















        // Declare the Variable
        val button = findViewById<Button>(R.id.buttonBack)
        // Set button On Click Listener
        button.setOnClickListener {
            // Create the explicit intent
            val intent = Intent(this, MainActivity::class.java)
            // Start Activity
            startActivity(intent)
        }

    }
}