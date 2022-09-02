package com.example.pdm122

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHide: Button = findViewById(R.id.btnHideImage)
        val imageClon: ImageView = findViewById(R.id.clon)
        val btnShow: Button = findViewById(R.id.btnShowImage)
        val btnJuegoView: Button = findViewById(R.id.btnShowJuegoView)
        val btnToastView: Button = findViewById(R.id.btnShowToast)
        val btnSumTwoNumbersView: Button = findViewById(R.id.btnSumTwoNumbersView)
        val btnShowIMCView: Button = findViewById(R.id.btnImcShowView)
        val btnpptChangeView: Button = findViewById(R.id.btnpptView)

        btnHide.setOnClickListener {
            imageClon.isVisible = false
            Log.d("my tag", "Mi primer listener")
        }
        btnShow.setOnClickListener {
            imageClon.isVisible = true
        }
        btnToastView.setOnClickListener {
            val intent = Intent(this,ToastActivity::class.java).apply {
            }
            startActivity(intent)
        }
        btnSumTwoNumbersView.setOnClickListener {
            val intent = Intent(this,SumTwoNumbers::class.java).apply {
            }
            startActivity(intent)
        }
        btnShowIMCView.setOnClickListener {
            val intent = Intent(this,IMC::class.java).apply {
            }
            startActivity(intent)
        }
        btnJuegoView.setOnClickListener {
            val intent = Intent(this,TimeFighter::class.java).apply {

            }
            startActivity(intent)
        }
        btnpptChangeView.setOnClickListener {
            val intent = Intent(this,PiedraPapelTijera::class.java).apply {

            }
            startActivity(intent)
        }
    }
}