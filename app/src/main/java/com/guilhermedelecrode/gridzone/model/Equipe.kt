package com.guilhermedelecrode.gridzone.model

data class Equipe(
    val nome: String,
    val motor: String,
    //val imagem: String
)

data class EquipeCampeonato(
    val nome: String,
    val pontuacao: Double?
)

