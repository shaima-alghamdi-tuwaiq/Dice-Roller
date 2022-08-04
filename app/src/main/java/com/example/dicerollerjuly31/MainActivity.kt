package com.example.dicerollerjuly31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

/**
 * This activity allows the user
 * to interact with the screen (UI)
 * */
class MainActivity : AppCompatActivity() {

    // function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // must
        setContentView(R.layout.activity_main)
        // reference
        val rollButton : Button = findViewById(R.id.btn_roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // create object
        val dice = Dice(6)
        // save the result number
        val diceRoll = dice.roll()

        // reference to imageView
        val diceImage : ImageView = findViewById(R.id.img_dice)

        // check number and update screen (UI)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        } // End when
    } // End rollDice()

}