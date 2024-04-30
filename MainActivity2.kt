package com.example.assignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Get the button and text views
        val btnFeed = findViewById<Button>(R.id.btn_Feed)
        val btnClean = findViewById<Button>(R.id.btn_Clean)
        val btnHappy = findViewById<Button>(R.id.btn_happy)
        val txtHunger = findViewById<TextView>(R.id.txt_hungry)
        val txtClean = findViewById<TextView>(R.id.txt_Clean)
        val txtHappy = findViewById<TextView>(R.id.txt_happy)
        val petImage = findViewById<ImageView>(R.id.petImage)

        // Set the initial text views
        txtHunger.text = petHunger.toString()
        txtClean.text = petCleanliness.toString()
        txtHappy.text = petHealth.toString()

        // Handle button clicks
        btnFeed.setOnClickListener {
            petHunger -= 10
            petHealth += 10
            petHunger += 5
            txtHunger.text = petHunger.toString()
            animateImageChange(petImage, R.drawable.eatingdog)
        }

        btnClean.setOnClickListener {
            petCleanliness += 10
            petHunger += 5
            petCleanliness -= 5
            txtClean.text = petCleanliness.toString()
            animateImageChange(petImage, R.drawable.happydog)
        }

        btnHappy.setOnClickListener {
            petHealth += 10
            petHunger += 5
            petCleanliness -= 5
            txtHappy.text = petHealth.toString()
            animateImageChange(petImage, R.drawable.r)
        }
    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        val animation = AlphaAnimation(0.0f, 1.0f)
        animation.duration = 500
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)

    }
}