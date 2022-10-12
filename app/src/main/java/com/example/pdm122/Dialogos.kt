package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Dialogos : AppCompatActivity() {
    private lateinit var btnDialogImage: Button
    private lateinit var btnShowDialog: Button
    private lateinit var btnCancelLoginDialog: Button
    private lateinit var btnConfirmLoginDialog: Button
    private lateinit var txtDialogName: EditText
    private lateinit var txtDialogEmail: EditText
    private lateinit var txtDialogPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogos)

//        btnDialogImage = findViewById(R.id.btnDialogImage)
//        btnShowDialog = findViewById(R.id.btnShowDialog)
//        btnCancelLoginDialog = findViewById(R.id.btnLoginCancelar)
//        btnConfirmLoginDialog = findViewById(R.id.btnLoginAceptar)
//        txtDialogName = findViewById(R.id.txtDialogName)
//        txtDialogEmail = findViewById(R.id.txtDialogEmail)
//        txtDialogPassword = findViewById(R.id.txtDialogPassword)
//
//        btnShowDialog.setOnClickListener {
//            val dialogLogin = layoutInflater.inflate(R.layout.login_dialog, null)
//            AlertDialog.Builder(this).setView(dialogView).setTitle()
//        }


        btnDialogImage.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.dialog_vista, null)
            AlertDialog.Builder(this).setView(dialogView).setTitle("Image Dialog").show()
        }
    }
}