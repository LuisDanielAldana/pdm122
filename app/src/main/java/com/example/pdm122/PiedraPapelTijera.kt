package com.example.pdm122

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class PiedraPapelTijera : AppCompatActivity() {
    private var mSensorManager: SensorManager? = null
    private var mSensorListener: ShakeEventListener? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piedra_papel_tijera)
        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener()

        val btnJugar: Button = findViewById(R.id.btnJugar)
        val imageJuego: ImageView = findViewById(R.id.imgSelection)

        btnJugar.setOnClickListener {

            var rnd = (1..3).random()

            Log.d("mensaje","Presiono el boton")
            Log.d("randomNumber",rnd.toString())

            when(rnd){
                1 -> imageJuego.setImageResource(R.drawable.piedra)
                2 -> imageJuego.setImageResource(R.drawable.tijera)
                3 -> imageJuego.setImageResource(R.drawable.papel)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mSensorManager!!.registerListener(
            mSensorListener,
            mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI
        )
    }

    override fun onPause() {
        mSensorManager!!.unregisterListener(mSensorListener)
        super.onPause()
    }
}