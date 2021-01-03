package com.example.crossthepond

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usPhrases = listOf("Snow", "Six-Thirty", "Tap Water", "Thanks", "Sweater", "Pants", "Arugula")

        val ukPhrases = listOf("White Rain", "Half-Six", "Still Water", "Cheers", "Jumper", "Trousers", "Rocket")

        val numPhrases = usPhrases.size - 1

        val genButton: Button = findViewById(R.id.button)
        genButton.setOnClickListener {

            val phraseIndex = (0..numPhrases).random()

            val usResultTextView: TextView = findViewById(R.id.textView2)
            usResultTextView.text = "US: " + usPhrases[phraseIndex]

            val ukResultTextView: TextView = findViewById(R.id.textView3)
            ukResultTextView.text = "UK: " + ukPhrases[phraseIndex]
        }
    }
}