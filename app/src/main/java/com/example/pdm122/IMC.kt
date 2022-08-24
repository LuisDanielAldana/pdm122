package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val weight : EditText = findViewById(R.id.txtWeight)
        val height : EditText = findViewById(R.id.txtHeight)
        val answer : TextView = findViewById(R.id.txtViewAnswer)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            val weightValue = weight.text.toString().toFloat()
            val heightValue = height.text.toString().toFloat()
            val imcValue = weightValue / (heightValue * heightValue)
            if (imcValue < 18.5){
                Toast.makeText(this,"Ta bajo", Toast.LENGTH_LONG).show()
            } else if (imcValue in 18.5..24.9){
                Toast.makeText(this,"Ta bien", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Ta alto", Toast.LENGTH_LONG).show()
            }

            answer.text = imcValue.toString()
        }
    }
}