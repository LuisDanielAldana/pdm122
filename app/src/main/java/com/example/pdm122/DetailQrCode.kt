package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailQrCode : AppCompatActivity() {

    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_qr_code)

        txtResult = findViewById(R.id.txtQrCodeResult)
        val qrCodeValue = intent.getStringExtra("qrCodeValue")
        txtResult.text = qrCodeValue
    }
}