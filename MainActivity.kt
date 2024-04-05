package com.example.mk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //Declaring the views
val ageNumber = findViewById<EditText>(R.id.age.Number)
val btnGenerate = findViewById<Button>(R.id.btGenerate)
val btnCancel = findViewById<Button>(R.id.btnClear)
val txtResult = findViewById<TextView>(R.id.txtResult)
btnGenerate.setOneClickListener{
val age = ageNumber.text.toString().toIntOrNull()
if (age != null) {
val result = when (age) {
in 0 .. 12 ->"Child"
in 13..19->"Teenager"
in 20..59 ->"Adult"
else -> "Senior"
}
txtResult.text = "Age": $age\n$