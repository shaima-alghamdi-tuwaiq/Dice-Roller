package com.example.dicerollerjuly31

class Dice (val numSides: Int) { // Primary Constructor

    fun roll(): Int {
        // generate a random number between 1 and 6
        return (1..numSides).random()
    }
}