package com.guilhermedelecrode.gridzone.ui.view

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.guilhermedelecrode.gridzone.R

class DetalhesCorridaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes_corrida)

        val nome = intent.getStringExtra("NOME")
        val data = intent.getStringExtra("DATA")

        Log.i("DetalhesPilotoActivity", "Dados da corrida: $nome, $data")

        findViewById<TextView>(R.id.nome_corrida_detalhes_corrida_activity).text = nome
        findViewById<TextView>(R.id.data_corrida_detalhes_corrida_activity).text = data
    }
}
