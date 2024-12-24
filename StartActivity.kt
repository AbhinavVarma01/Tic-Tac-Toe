package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Called when the "Start Game" button is clicked
    fun startGame(view: View) {
        // Replace this with the code to start your game activity
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    // Called when the "Exit Game" button is clicked
    fun exitGame(view: View) {
        finish() // Close the app
    }
}
