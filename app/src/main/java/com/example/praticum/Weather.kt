package com.example.praticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Weather : AppCompatActivity() {
    val editText1: EditText = findViewById(R.id.editText1)
    val editText2: EditText = findViewById(R.id.editText2)
    val editText3: EditText = findViewById(R.id.editText3)
    val editText4: EditText = findViewById(R.id.editText4)
    val editText5: EditText = findViewById(R.id.editText5)
    val editText6: EditText = findViewById(R.id.editText6)
    val editText7: EditText = findViewById(R.id.editText7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val textDisplay = findViewById<TextView>(R.id.averageDisplay)
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val temperatures = arrayOf(
                editText1.text.toString().toFloatOrNull() ?: 0f,
                editText2.text.toString().toFloatOrNull() ?: 0f,
                editText3.text.toString().toFloatOrNull() ?: 0f,
                editText4.text.toString().toFloatOrNull() ?: 0f,
                editText5.text.toString().toFloatOrNull() ?: 0f,
                editText6.text.toString().toFloatOrNull() ?: 0f,
                editText7.text.toString().toFloatOrNull() ?: 0f
            )
            val sum = temperatures.sum()
            val average = sum / temperatures.size

            textDisplay.text = "Average Temperature: $average"
        }
        // Declare the Variable
        val button = findViewById<Button>(R.id.button3)
        // Set button On Click Listener
        button.setOnClickListener {
            // Create the explicit intent
            val intent = Intent(this, DetailedWeather::class.java)
            // Start Activity
            startActivity(intent)
        }


    }
}