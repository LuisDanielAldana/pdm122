package com.example.pdm122

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SumTwoNumbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum_two_numbers)

        val firstNumber : EditText = findViewById(R.id.inputNumberOne)
        val secondNumber : EditText = findViewById(R.id.inputNumberTwo)
        val btnSumTwoNumbers : Button = findViewById(R.id.btnSumTwoNumbers)
        val answer : TextView = findViewById(R.id.txtviewResult)

        btnSumTwoNumbers.setOnClickListener {
            val firstNumberValue= firstNumber.text.toString().toInt()
            val secondNumberValue= secondNumber.text.toString().toInt()
            val sum = firstNumberValue + secondNumberValue
            Toast.makeText(this,"Resultado: $sum",Toast.LENGTH_LONG).show()

        }
    }
}