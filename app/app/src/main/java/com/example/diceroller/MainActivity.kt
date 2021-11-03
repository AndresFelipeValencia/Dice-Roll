package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            rollDiceOne()
            rollDiceTwo()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDiceOne() {
        // Create new Dice object with 6 sides and roll it
        val diceOne = Dice(6)
        val diceRollOne = diceOne.roll()

        // Update the screen with the dice roll
        val resultTextViewOne: TextView = findViewById(R.id.textView2)
        resultTextViewOne.text = diceRollOne.toString()
    }

    private fun rollDiceTwo() {
        // Create new Dice object with 6 sides and roll it
        val diceTwo = Dice(6)
        val diceRollTwo = diceTwo.roll()

        // Update the screen with the dice roll
        val resultTextViewTwo: TextView = findViewById(R.id.textView3)
        resultTextViewTwo.text = diceRollTwo.toString()
    }

}



