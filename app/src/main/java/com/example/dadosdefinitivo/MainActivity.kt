package com.example.dadosdefinitivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dadosdefinitivo.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    private val dados = arrayOf<Int>(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)



    }
    fun clickOnDado( view: View){
       // Snackbar.make(view, (R.drawable.dice6).toString),
        val dado1 = (1..6).random()
        val dado2 = (1..6).random()
        b.ivDado1.setImageResource(dados[dado1 -1])
        b.ivDado2.setImageResource(dados[dado2 -1])
        b.tvTotal.text = (dado1 + dado2).toString()
    }
}