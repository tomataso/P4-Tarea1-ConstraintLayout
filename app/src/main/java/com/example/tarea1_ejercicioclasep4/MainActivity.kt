package com.example.tarea1_ejercicioclasep4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Se cambia al activity constraint layout.
        setContentView(R.layout.activity_constraint_layout)
    }
}