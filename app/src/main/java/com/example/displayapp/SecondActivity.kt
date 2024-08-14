package com.example.displayapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        // Initialize TextView components
        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        val textViewNumber = findViewById<TextView>(R.id.textViewNumber)
        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            finish()
        }

        // Retrieve data from the intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val number = intent.getStringExtra("number")

        // Display the data
        textViewName.text = "Name: $name"
        textViewEmail.text = "Email: $email"
        textViewNumber.text = "Number: $number"
    }
}
