package com.example.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSegunda = findViewById<TextView>(R.id.segunda)

        txtSegunda.text = getText(R.string.segunda_parte)

    }
}