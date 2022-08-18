package com.example.actividad2
// Made by Sofía Jiménez Martínez

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find the button
        val button = findViewById<Button>(R.id.button)

        // find the edit text
        val text = findViewById<EditText>(R.id.editText)

        // find the text view
        val textView = findViewById<TextView>(R.id.textView)

        // set onClickListener on button
        button.setOnClickListener {
            // get the user input
            val userInput = text.text

            // change the text of the text View
            textView.text = userInput
        }
    }
}