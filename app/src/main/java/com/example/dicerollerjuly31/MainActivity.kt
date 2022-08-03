package com.example.dicerollerjuly31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.btn_roll)
        val numberText : TextView = findViewById(R.id.txt_number)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}