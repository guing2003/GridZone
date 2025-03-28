package com.guilhermedelecrode.gridzone

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesPilotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_piloto)

        val nome = intent.getStringExtra("NOME")
        val sigla = intent.getStringExtra("SIGLA")
        val equipe = intent.getStringExtra("EQUIPE")
        val numero = intent.getIntExtra("NUMERO", -1)

        Log.i("DetalhesPilotoActivity", "Dados do Piloto: $nome, $sigla, $equipe, $numero")
    }
}
