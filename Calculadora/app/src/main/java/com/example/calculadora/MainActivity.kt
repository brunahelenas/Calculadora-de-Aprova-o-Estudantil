package com.example.calculadora

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado = resultado
        val btCalcular = calcular

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2=Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2
            val falta = Integer.parseInt(faltas.text.toString())

            if(media>6 && falta<=10){
                resultado.setText("Aluno Aprovado!" + "\n" + "Media: "+media+ "\n" +"Faltas: " + falta)
                resultado.setTextColor(Color.GREEN)
            }
                else{
                resultado.setText("Aluno Reprovado!" + "\n" + "Media: "+media+ "\n" +"Faltas: " + falta)
                resultado.setTextColor(Color.RED)
                }
                  }


    }
}