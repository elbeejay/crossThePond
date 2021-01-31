package com.example.crossthepond

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load text file into memory once
        val inputString = application.assets.open("key.txt").bufferedReader().use { it.readText() }

        val phrasePair: List<String> = inputString.split("\n")
        val phraseSize = phrasePair.size - 2

        // Make button and on-click, pull random pair of words from text phrases
        val genButton: Button = findViewById(R.id.button)
        genButton.setOnClickListener {

            // Generate random value to pull from list
            val randomVal = (0..phraseSize).random()

            // Pull paired phrases based on random value
            val randomPhrase = phrasePair[randomVal]

            // Split paired phrase into a list of its own
            val phraseList = randomPhrase.split(",")

            // Stick first phrase (US phrase) into the US text view
            val usResultTextView: TextView = findViewById(R.id.textView2)
            usResultTextView.text = "US: " + phraseList[0]

            // Stick second phrase (UK phrase) into the US text view
            val ukResultTextView: TextView = findViewById(R.id.textView3)
            ukResultTextView.text = "UK: " + phraseList[1]
        }
    }
}