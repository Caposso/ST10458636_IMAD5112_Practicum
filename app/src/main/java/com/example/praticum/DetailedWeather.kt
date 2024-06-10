package com.example.praticum

import android.os.Bundle
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

    }
}