package com.guilhermedelecrode.gridzone.ui.view

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.guilhermedelecrode.gridzone.R

class DetalhesPilotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_piloto)

        val nome = intent.getStringExtra("NOME")
        val sigla = intent.getStringExtra("SIGLA")
        val equipe = intent.getStringExtra("EQUIPE")
        val numero = intent.getIntExtra("NUMERO", -1)

        Log.i("DetalhesPilotoActivity", "Dados do Piloto: $nome, $sigla, $equipe, $numero")

        findViewById<TextView>(R.id.nome_piloto_detalhe_piloto_activity).text = nome
        //findViewById<TextView>(R.id.textViewSigla).text = sigla
        findViewById<TextView>(R.id.equipe_piloto_detalhe_piloto_activity).text = equipe
        findViewById<TextView>(R.id.numero_piloto_detalhe_piloto_activity).text = numero.toString()
    }
}
