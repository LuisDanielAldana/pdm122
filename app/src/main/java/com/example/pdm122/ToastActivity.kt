package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val btnShortDuration: Button = findViewById(R.id.btnShortDuration)
        val btnLongDuration: Button = findViewById(R.id.btnLongDuration)

        btnShortDuration.setOnClickListener {
            //Crear toast de corta duracion

            Toast.makeText(this,"Mi toast corto", Toast.LENGTH_SHORT).show()
        }
        btnLongDuration.setOnClickListener {
            //Crear toast de larga duracion
            var name = "Luis"
            Toast.makeText(this,"El valor de la variable name es: $name", Toast.LENGTH_LONG).show()
        }
    }
}

