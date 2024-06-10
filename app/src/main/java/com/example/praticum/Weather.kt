package com.example.praticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Weather : AppCompatActivity() {
    // Declaring variables at class so I can use it Globally
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
        //Creating a variable that the information that the user inputted is going to be displayed
        val textDisplay = findViewById<TextView>(R.id.averageDisplay)
        //creating a button so that when the presses is going to calculate the average
        val button2 = findViewById<Button>(R.id.button2)
        //setting the button on set click listener
        button2.setOnClickListener {
            //creating a array so the value can be stored
            val temperatures = arrayOf(
                editText1.text.toString().toFloatOrNull() ?: 0f,
                editText2.text.toString().toFloatOrNull() ?: 0f,
                editText3.text.toString().toFloatOrNull() ?: 0f,
                editText4.text.toString().toFloatOrNull() ?: 0f,
                editText5.text.toString().toFloatOrNull() ?: 0f,
                editText6.text.toString().toFloatOrNull() ?: 0f,
                editText7.text.toString().toFloatOrNull() ?: 0f
            )
            //Creating a variable so it can be use to calculate the average
            val sum = temperatures.sum()
            //calculating the average using the total of the array dividing it by its Size
            val average = sum / temperatures.size
            //Displaying the Average
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