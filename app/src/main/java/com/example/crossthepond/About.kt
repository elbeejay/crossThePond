package com.example.crossthepond

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {
    private var popupTitle = ""
    private var popupText = ""
    private var popupButton = ""
    private var darkStatusBar = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.activity_about)

        // Get strings
        val bundle = intent.extras
        popupTitle = bundle?.getString("popuptitle", "Title") ?: ""
        popupText = bundle?.getString("popuptext", "Text") ?: ""
        popupButton = bundle?.getString("popupbtn", "Button") ?: ""
        darkStatusBar = bundle?.getBoolean("darkstatusbar", false) ?: false

        // Assign them
        popup_window_title.text = popupTitle
        popup_window_text.text = popupText
        popup_window_button.text = popupButton

        // Close on button click
        popup_window_button.setOnClickListener {
            onBackPressed()
        }
    }
}