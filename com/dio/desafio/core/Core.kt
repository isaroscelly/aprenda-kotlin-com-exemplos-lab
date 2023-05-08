package com.dio.desafio.core

import com.dio.desafio.domain.ConteudoEducacional
import com.dio.desafio.domain.Usuario
import com.dio.desafio.enums.Nivel


public class Core {

    companion object {
        @JvmStatic
        fun execute() {
            val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
            val conteudo2 = ConteudoEducacional("Programação orientada a objetos em Kotlin")
            val conteudosFormacao1 = listOf(conteudo1, conteudo2)

            val formacao1 = Formacao("Formação Kotlin", Nivel.INTERMEDIARIO, conteudosFormacao1)

            val usuario1 = Usuario("João", "joao@gmail.com")
            val usuario2 = Usuario("Maria", "maria@gmail.com")

            formacao1.matricularAluno(usuario1)
            formacao1.matricularAluno(usuario2)

            println("Alunos matriculados na formação ${formacao1.nome}:")

            formacao1.listarAlunosMatriculados().forEach {
                println("${it.nome} - ${it.email}")
            }
        }
    }
}