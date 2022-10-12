package com.example.pdm122

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class SegundoExamenParcial : AppCompatActivity() {

    private lateinit var txtUser: EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo_examen_parcial)

        txtUser = findViewById(R.id.txtSegundoParcialUser)
        txtPassword = findViewById(R.id.txtSegundoParcialPassword)
        btnLogin = findViewById(R.id.btnSegundoParcialIniciar)

        btnLogin.setOnClickListener {
            if (txtUser.text.toString() == "segundoparcial" && txtPassword.text.toString() == "1"){
                val intent = Intent(this,SegundoParcialAplication::class.java).apply {
                }
                startActivity(intent)
            } else {
                val dialogView = layoutInflater.inflate(R.layout.failed_login_dialog, null)
                AlertDialog.Builder(this).setView(dialogView).setTitle("Wrong user or password").show()
            }
        }

    }
}