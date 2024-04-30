package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_next)
        button.setOnClickListener {
            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}