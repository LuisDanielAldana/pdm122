package com.example.pdm122

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class TimeFighter : AppCompatActivity() {

    internal lateinit var btnTapMe: Button
    internal lateinit var btnRestart: Button
    internal lateinit var txtScore: TextView
    internal lateinit var txtTimer: TextView

    var score: Int = 0

    private var startMusic: MediaPlayer? = null
    private var endMusic: MediaPlayer? = null
    lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_fighter)

        val bounceAnimation = AnimationUtils.loadAnimation(this,R.anim.bounce)
        val shakeAnimation = AnimationUtils.loadAnimation(this,R.anim.shake)

        btnTapMe= findViewById(R.id.btnTapMe)
        btnRestart= findViewById(R.id.btnRestart)
        txtScore = findViewById(R.id.txtScore)
        txtTimer = findViewById(R.id.txtTimer)

        btnRestart.isVisible = false
        btnRestart.isEnabled = false

        btnTapMe.setOnClickListener {
            it.startAnimation(bounceAnimation)
            txtScore.startAnimation(shakeAnimation)
            startGame()
            aumentarScore()
        }

        btnRestart.setOnClickListener {
            restart()
        }
    }

    private fun startGame(){

        if (score === 0){
            startMusic = MediaPlayer.create(this,R.raw.musica)
            endMusic = MediaPlayer.create(this,R.raw.bye)
            startMusic?.start()
            object : CountDownTimer(5000, 1000) {

                override fun onTick(millisUntilFinished: Long) {
                    txtTimer.text = "seconds remaining: " + millisUntilFinished / 1000
                }

                override fun onFinish() {
                    endGame()
                }
            }.start()
        }
    }

    private fun aumentarScore(){
        score ++
        val newScore : String = getString(R.string.score,score.toString())
        txtScore.text = newScore
    }

    private fun endGame(){
        startMusic?.stop()
        endMusic?.start()
        btnTapMe.isEnabled = false
        btnRestart.isVisible = true
        btnRestart.isEnabled = true
        txtTimer.text = "Se termino el tiempo!"
    }

    private fun restart(){
        score = 0
        val restartScore = getString(R.string.score,score.toString())
        txtScore.text = restartScore
        endMusic?.stop()

        btnTapMe.isEnabled = true
        btnRestart.isVisible = false
        btnRestart.isEnabled = false
    }
}