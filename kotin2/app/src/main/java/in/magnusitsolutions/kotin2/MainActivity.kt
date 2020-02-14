package `in`.magnusitsolutions.kotin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text="Dice Rolled"
        rollButton.setOnClickListener { rollDice() }

    }
    private fun rollDice(){

        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
       // val resultText: TextView = randomInt.toString()
        resultText.text = randomInt.toString()
        Toast.makeText(this,"button Clicked",Toast.LENGTH_SHORT).show()
    }
}