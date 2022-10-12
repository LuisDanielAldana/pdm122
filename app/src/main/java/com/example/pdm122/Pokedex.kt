package com.example.pdm122

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

private val pokemonBank = listOf(
    Pokemon("Articuno",R.drawable.articuno,true),
    Pokemon("Bayleef",R.drawable.bayleef,false),
    Pokemon("Beautifly",R.drawable.beautifly,false),
    Pokemon("Bonsly",R.drawable.bonsly,false),
    Pokemon("Charizard",R.drawable.charizard,false),
    Pokemon("Dewgong",R.drawable.dewgong,false),
    Pokemon("Espeon",R.drawable.espeon,false),
    Pokemon("Furret",R.drawable.furret,false),
    Pokemon("Houndoom",R.drawable.houndoom,false),
    Pokemon("Ivysour",R.drawable.ivysour,false),
    Pokemon("Lapras",R.drawable.lapras,false),
    Pokemon("Leafeon",R.drawable.leafeon,false),
    Pokemon("Lucario",R.drawable.lucario,false),
    Pokemon("Lugia",R.drawable.lugia,true),
    Pokemon("Marowak",R.drawable.marowak,false),
    Pokemon("Mewtwo",R.drawable.mewtwo,true),
    Pokemon("Munchlax",R.drawable.munchlax,false),
    Pokemon("Nidorina",R.drawable.nidorina,false),
    Pokemon("Ninetales",R.drawable.ninetales,false),
    Pokemon("Pidgeotto",R.drawable.pidgeotto,false),
    Pokemon("Snivy",R.drawable.snivy,false),
    Pokemon("Suicune",R.drawable.suicune,true),
    Pokemon("Togetic",R.drawable.togetic,false)

)
private lateinit var btnNext: Button
private lateinit var imgPokemon: ImageView
private lateinit var txtPokemonName: TextView
private lateinit var layoutPokedex: ConstraintLayout
private var currentIndex = 0

class Pokedex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex)
        layoutPokedex = findViewById(R.id.layoutPokedex)
        btnNext = findViewById(R.id.btnNexttPokemon)
        imgPokemon = findViewById(R.id.imgPokemon)
        txtPokemonName = findViewById(R.id.txtPokemonName)



        btnNext.setOnClickListener {
            currentIndex = (currentIndex + 1) % pokemonBank.size
            nextPokemon()
        }
        nextPokemon()
    }
    private fun nextPokemon(){
        imgPokemon.setImageResource(pokemonBank[currentIndex].image)
        txtPokemonName.text = pokemonBank[currentIndex].name
        if(pokemonBank[currentIndex].isLegendary){
            layoutPokedex.setBackgroundColor(Color.RED)
        }else{
            layoutPokedex.setBackgroundColor(Color.WHITE)
        }

    }
}