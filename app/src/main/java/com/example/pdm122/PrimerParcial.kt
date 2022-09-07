package com.example.pdm122

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class PrimerParcial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_parcial)

        val txtproduccionTotal : EditText = findViewById(R.id.txtProduccionTotal)
        val txtproduccionActual : EditText = findViewById(R.id.txtProduccionActual)
        val txtPorcentaje : EditText = findViewById(R.id.txtPorcentaje)
        val btnProduccionTotal : ImageButton = findViewById(R.id.imgbtnProduccionTotal)
        val btnProduccionActual : ImageButton = findViewById(R.id.imgbtnProduccionActual)
        val btnPlusFive : Button = findViewById(R.id.btnPlusFive)
        val btnPlusFifteen : Button = findViewById(R.id.btnPlusFifteen)
        val btnPlusThirty : Button = findViewById(R.id.btnPlusThirty)
        val btnPlusFifty : Button = findViewById(R.id.btnPlusFifty)
        val btnCalcular : Button = findViewById(R.id.btnCalcular)
        val layout : ConstraintLayout = findViewById(R.id.layout)


        btnProduccionTotal.setOnClickListener {
            var produccionTotal = txtproduccionTotal.text.toString().toInt()
            val produccionTotalValue = produccionTotal * 80
            Toast.makeText(this,"Estimado de manzanas: $produccionTotalValue", Toast.LENGTH_LONG).show()
        }
        btnProduccionActual.setOnClickListener {
            var produccionActual = txtproduccionActual.text.toString().toInt()
            val produccionActualValue = produccionActual * 80
            Toast.makeText(this,"Estimado de manzanas: $produccionActualValue", Toast.LENGTH_SHORT).show()
        }
        btnPlusFive.setOnClickListener {
            var produccionActual = txtproduccionActual.text.toString().toInt()
            var produccionActualValue = produccionActual + 5
            txtproduccionActual.setText(produccionActualValue.toString())
        }
        btnPlusFifteen.setOnClickListener {
            var produccionActual = txtproduccionActual.text.toString().toInt()
            var produccionActualValue = produccionActual + 15
            txtproduccionActual.setText(produccionActualValue.toString())
        }
        btnPlusThirty.setOnClickListener {
            var produccionActual = txtproduccionActual.text.toString().toInt()
            var produccionActualValue = produccionActual + 30
            txtproduccionActual.setText(produccionActualValue.toString())
        }
        btnPlusFifty.setOnClickListener {
            var produccionActual = txtproduccionActual.text.toString().toInt()
            var produccionActualValue = produccionActual + 50
            txtproduccionActual.setText(produccionActualValue.toString())
        }
        btnCalcular.setOnClickListener {
            var produccionTotal = txtproduccionTotal.text.toString().toFloat()
            var produccionActual = txtproduccionActual.text.toString().toFloat()
            var porcentajeValue = (produccionActual * 100) / produccionTotal
            if (porcentajeValue >= 70){
                layout.setBackgroundColor(Color.RED)
            }
            txtPorcentaje.setText(porcentajeValue.toString())
        }

    }
}