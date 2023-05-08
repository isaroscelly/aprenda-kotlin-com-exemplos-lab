package com.dio.desafio.core

import com.dio.desafio.domain.ConteudoEducacional
import com.dio.desafio.domain.Usuario
import com.dio.desafio.enums.Nivel

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    private val alunosMatriculados = mutableListOf<Usuario>()

    fun matricularAluno(usuario: Usuario) {
        alunosMatriculados.add(usuario)
    }

    fun desmatricularAluno(usuario: Usuario) {
        alunosMatriculados.remove(usuario)
    }

    fun listarAlunosMatriculados(): List<Usuario> {
        return alunosMatriculados.toList()
    }
}