package com.guilhermedelecrode.gridzone.data.model

data class Piloto(
    val nome: String,
    val sigla: String,
    val numero: Int,
    val equipe: String,
    //val imagem: String
)

data class PilotoCampeonato(
    val nome: String,
    val equipe: String,
    val pontuacao: Double?
)
