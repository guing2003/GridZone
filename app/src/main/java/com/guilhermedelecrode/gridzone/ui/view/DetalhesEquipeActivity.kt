package com.guilhermedelecrode.gridzone.ui.view

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.guilhermedelecrode.gridzone.R

class DetalhesEquipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes_equipe)

        val nome = intent.getStringExtra("NOME")
        val motor = intent.getStringExtra("MOTOR")

        Log.i("DetalhesPilotoActivity", "Dados do Piloto: $nome, $motor")

        findViewById<TextView>(R.id.nome_equipe_detalhes_equipe_activity).text = nome
        findViewById<TextView>(R.id.motor_equipe_detalhe_equipe_activity).text = motor
    }
}