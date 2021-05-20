package com.digitalhouse.song

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title: String = "November Rain"
        val author = "Guns 'n' Roses"
        var albumCertifiedUnitsSoldInTheUS: Double = 500000.0
        val releaseYear = 1992
        val lengthMinutes: Float = 8.95f
        val firstLetter: Char = 'w'

        Log.d("Title: ",title)
        Log.d("Author: ",author)
        Log.d("Units sold in the US: ",albumCertifiedUnitsSoldInTheUS.toString())
        Log.d("Year of release", releaseYear.toString())
        Log.d("Duration",lengthMinutes.toString())
        Log.d("First letter",firstLetter.toString())
    }
}