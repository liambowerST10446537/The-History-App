package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val fact = findViewById<Button>(R.id.btnFact)
        val show = findViewById<TextView>(R.id.txtFact)
        val age = findViewById<TextView>(R.id.txtAge)
        val clear = findViewById<Button>(R.id.btnClear)

        fact.setOnClickListener {
            // do something when the button is clicked
            val value = Integer.parseInt(age.text.toString())
            if (value in 20..29) {
                show.text = "You belong to the generation we call the Gen Z."
            } else if (value in 30..39) {
                show.text = "Bruce Lee passed away in his early 30's."
            } else if (value in 40..49) {
                show.text = "Soccer star Ronaldihno is also in his 40's."
            } else if (value in 50..59) {
                show.text = "You're a part of Gen X."
            } else if (value in 60..69) {
                show.text = "You're known for being named a baby boomer."
            } else if (value in 70..80) {
                show.text =
                    "Nelson Mandela was released from prison in his 70's after being incarcerated for 27 years."
            } else {
                show.text = "Invalid Age. Please re-enter age."
            }
        }
        clear.setOnClickListener {
            show.text = ""
            age.text = ""
        }
    }

}

