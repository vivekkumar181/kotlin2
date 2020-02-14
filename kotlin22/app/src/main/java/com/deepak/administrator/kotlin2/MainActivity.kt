package com.deepak.administrator.kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage :ImageView
    lateinit var diceImage1 :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text="Dice Rolled"
        rollButton.setOnClickListener { rollDice() }
        //var diceImage : ImageView? = null
             diceImage= findViewById(R.id.dice_image)
             diceImage1= findViewById(R.id.dice_image1)

    }
    private fun rollDice(){

    val randomInt = (1..6).random()
        //val resultText: TextView = randomInt.toString()
        val resultText: TextView = findViewById(R.id.result_text)

       /* val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6


        }*/
        diceImage.setImageResource(getRandomDiceImage())
        diceImage1.setImageResource(getRandomDiceImage())
        resultText.text = randomInt.toString()
  Toast.makeText(this,"Value is :  "+randomInt,Toast.LENGTH_SHORT).show()
    }
    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()
        return when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

    }

    /*override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)


    }*/
}}
