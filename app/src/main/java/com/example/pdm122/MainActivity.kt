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
        val btnPrimerParcial: Button = findViewById((R.id.btnPrimerParcial))
        val btnLottieView: Button = findViewById(R.id.btnLottieAnimation)
        val btnTestView: Button = findViewById(R.id.btnGeographyTest)
        val btnPokedex: Button = findViewById(R.id.btnPokedex)
        val btnQrView: Button = findViewById(R.id.btnQrReader)
        val btnDialogueView: Button = findViewById(R.id.btnDialogue)
        val btnSegundoParcial: Button = findViewById(R.id.btnSegundoParcial)

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
        btnPrimerParcial.setOnClickListener {
            val intent = Intent(this,PrimerParcial::class.java).apply {

            }
            startActivity(intent)
        }
        btnLottieView.setOnClickListener {
            val intent = Intent(this,LottieView::class.java).apply {

            }
            startActivity(intent)
        }
        btnTestView.setOnClickListener {
            val intent = Intent(this,GeographyTest::class.java).apply {

            }
            startActivity(intent)
        }
        btnPokedex.setOnClickListener {
            val intent = Intent(this,Pokedex::class.java).apply {

            }
            startActivity(intent)
        }
        btnQrView.setOnClickListener {
            val intent = Intent(this,QrReader::class.java).apply {

            }
            startActivity(intent)
        }
        btnDialogueView.setOnClickListener {
            val intent = Intent(this,Dialogos::class.java).apply {

            }
            startActivity(intent)
        }
        btnSegundoParcial.setOnClickListener {
            val intent = Intent(this,SegundoExamenParcial::class.java).apply {

            }
            startActivity(intent)
        }
    }
}