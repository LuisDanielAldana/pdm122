package com.example.pdm122

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.budiyev.android.codescanner.AutoFocusMode
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.CodeScannerView
import com.budiyev.android.codescanner.DecodeCallback
import com.budiyev.android.codescanner.ErrorCallback
import com.budiyev.android.codescanner.ScanMode

class LeerPlacaQrScanner : AppCompatActivity() {

    private lateinit var codeScanner: CodeScanner
    val MY_CAMERA_PERMISSION_REQUEST = 1111
    private lateinit var scannerView: CodeScannerView

    private lateinit var txtMarca: TextView
    private lateinit var txtModelo: TextView
    private lateinit var txtAño: TextView
    private lateinit var txtDeuda: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leer_placa_qr_scanner)

        scannerView = findViewById(R.id.scanner_view)
        codeScanner = CodeScanner(this,scannerView)
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.formats = CodeScanner.ALL_FORMATS
        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = false

        //Info del dialog
        val dialogView = layoutInflater.inflate(R.layout.car_info_modal, null)
        txtMarca = dialogView.findViewById(R.id.txtCarInfoModelo)
        txtModelo = dialogView.findViewById(R.id.txtCarInfoModelo)
        txtAño = dialogView.findViewById(R.id.txtCarInfoModelo)
        txtDeuda = dialogView.findViewById(R.id.txtCarInfoModelo)

        codeScanner.decodeCallback = DecodeCallback{
            runOnUiThread {
                Toast.makeText(this, "Scan Result: ${it.text}", Toast.LENGTH_LONG).show()
                val intent = Intent(this, DetailQrCode::class.java)
                intent.putExtra("qrCodeValue", it.text)
                val str = it.text
                val delim = ","
                val list = str.split(delim)

                txtMarca.text = "Marca ${list[0]}"
                txtModelo.text = "Marca ${list[1]}"
                txtAño.text = "Marca ${list[2]}"
                txtDeuda.text = "Marca ${list[3]}"

                codeScanner.stopPreview()
            }
        }
        codeScanner.errorCallback = ErrorCallback {
            runOnUiThread {
                Toast.makeText(this, "Camera Error: ${it.message}", Toast.LENGTH_LONG).show()
            }
        }
        codeScanner.startPreview()
        checkPermission()

    }
    fun checkPermission(){
        if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), MY_CAMERA_PERMISSION_REQUEST)
        }else{
            codeScanner.startPreview()
        }
    }
    }
