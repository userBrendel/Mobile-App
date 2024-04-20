package com.example.horoscopelovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)



        // Retrieve data passed through Intent
        val firstSign = intent.getStringExtra("firstSign")
        val secondSign = intent.getStringExtra("secondSign")
        val score = intent.getIntExtra("score", 0)
        val details = intent.getStringExtra("details")

        // Finding and updating the TextViews to display info
        val signsTextView = findViewById<TextView>(R.id.signsTextView)
        signsTextView.text = "$firstSign and $secondSign"

        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        scoreTextView.text = "Compatibility Score: $score%"

        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)
        detailsTextView.text = "$details"

        //button to go back to main activity
        findViewById<Button>(R.id.BackButton).setOnClickListener {
            finish()
        }
    }
}

