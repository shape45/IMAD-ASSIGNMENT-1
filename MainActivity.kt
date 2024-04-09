package com.example.mk

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.txtAgeNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..27 -> "one"
                    in 28..35-> "two"
                    in 36..44-> "three"
                    in 44 ..51-> "four"
                    in 52 .. 60->"five"
                    in 60 .. 67->"six"
                    in 68 ..75->"seven"
                    in 76 ..83->"eight"
                    in 84 .. 91->"nine"
                    in 92 ..100->"ten"
                    else -> "invalid"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "one" -> "Notorious B.I.G was a American rapper as he was widely considered one of the greatest rapper of all time."
                        "two" -> "Easy E was an American rapper who propelled West Coast-rap and gangster."
                        "three" -> "Kobe Bryant was an American professional basketball player , who spent 20 years in Los Angeles Lakers."
                        "four"->"Michael Jackson was an American artist , known as the king of POP"
                        "five"->"Prince was an American singer and a multiple talented artist with numerous awards and nominations."
                        "six"->"Leonardo Da Vinci was a italian polymath artist, engineer, scientist, theorist and architect"
                        "seven"->"Charles Darwin was an english naturalist and biologist widely known for his contributions to evolutionary biology."
                        "eight"->"Victor Sen Yung was an American actor known for playing hop songs in the  western series"
                        "nine"->"Isaac Newton was a English polymath and author who was described  as a natural philosopher"
                        "ten"->"Betty White was an American actress, comedian and producer"
                        else -> "You are a Senior."
                    }
                    
                }"
            } else {
                txtResult.text = "Please enter a valid age. "
            }
        }

        btnClear.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }


    }






