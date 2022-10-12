package com.example.pdm122

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class SegundoParcialAplication : AppCompatActivity() {

    private lateinit var btnLeerPlaca: Button
    private lateinit var btnAbout: Button
    private lateinit var btnCerrarSesion: Button
    private lateinit var btnCerrar: Button
    private lateinit var btnWebPage: Button
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo_parcial_aplication)
        btnLeerPlaca = findViewById(R.id.btnSegundoParcialLeerPlaca)
        btnAbout = findViewById(R.id.btnSegundoParcialAcercaDe)
        btnCerrarSesion = findViewById(R.id.btnSegundoParcialCerrarSesion)

        val dialogView = layoutInflater.inflate(R.layout.about_dialog, null)
        btnCerrar = dialogView.findViewById(R.id.btnAboutDialogCerrar)
        btnWebPage = dialogView.findViewById(R.id.btnAboutDialogWebPage)


        btnCerrar.setOnClickListener {

        }

        btnWebPage.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LuisDanielAldana"))
            startActivity(browserIntent)

        }


        btnLeerPlaca.setOnClickListener {
            val intent = Intent(this,LeerPlacaQrScanner::class.java).apply {
            }
            startActivity(intent)
        }

        btnAbout.setOnClickListener {
            AlertDialog.Builder(this).setView(dialogView).setTitle("About").show()
        }

        btnCerrarSesion.setOnClickListener {
            val intent = Intent(this,SegundoExamenParcial::class.java).apply {
            }
            startActivity(intent)
        }
    }
}