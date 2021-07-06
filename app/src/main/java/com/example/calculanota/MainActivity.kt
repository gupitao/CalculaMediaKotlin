package com.example.calculanota

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular:Button = btt_calcular

        val resultado:TextView = textView

        btCalcular.setOnClickListener{
            var texto = ""
            val nota1:Int   = Integer.parseInt(nota_1.text.toString())
            val nota2:Int   = Integer.parseInt(nota_2.text.toString())
            val media:Int   = (nota1 + nota2) / 2
            val faltas:Int  = Integer.parseInt(qtde_faltas.text.toString())

            if(media >= 6 && faltas <=10){
                resultado.setTextColor(Color.GREEN)
               texto = "Aluno foi Aprovado \n Nota Final: $media \n Faltas: $faltas"
            }else{
                resultado.setTextColor(Color.RED)
                texto = "Aluno foi Reprovado \n Nota Final: $media \n Faltas: $faltas"
            }

            resultado.text = texto

        }

    }
}