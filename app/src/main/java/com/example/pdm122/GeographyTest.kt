package com.example.pdm122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private val questionBank = listOf(
    Preguntas(R.string.question_australia, false),
    Preguntas(R.string.question_oceans, false),
    Preguntas(R.string.question_mideast, true),
    Preguntas(R.string.question_africa, true),
    Preguntas(R.string.question_americas, true),
    Preguntas(R.string.question_asia, true)
)
private lateinit var btnFalse:Button
private lateinit var btnTrue:Button
private lateinit var btnNext:Button
private lateinit var txtQuestion:TextView

private var index = 0
private var toastAns = 0
class GeographyTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geography_test)
        btnFalse = findViewById(R.id.btnFalse)
        btnTrue = findViewById(R.id.btnTrue)
        btnNext = findViewById(R.id.btnNext)
        txtQuestion = findViewById(R.id.txtQuestion)

        txtQuestion.setText(questionBank[index].textResId)


        btnFalse.setOnClickListener {
            validateAnswer(false)
        }

        btnTrue.setOnClickListener {
            validateAnswer(true)
        }

        btnNext.setOnClickListener {
            updateQuestion()
        }

    }

    fun updateQuestion(){
        index++
        index = (index ++) % questionBank.count()
        txtQuestion.setText(questionBank[index].textResId)

    }

    fun validateAnswer(userAnswer: Boolean){

        if(userAnswer == questionBank[index].answer ){
            toastAns = R.string.correctToast;
            updateQuestion()
        }else{
            toastAns = R.string.badToast;
        }
        Toast.makeText(this, toastAns, Toast.LENGTH_SHORT).show()

    }
}