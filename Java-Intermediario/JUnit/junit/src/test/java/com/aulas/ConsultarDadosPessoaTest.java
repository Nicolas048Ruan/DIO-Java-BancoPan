package com.aulas;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ConsultarDadosPessoaTest {
    
    @BeforeAll // Antes de tudo
    public static void configurarConexao() {
        BancoDados.iniciarConexao();
    }

    @BeforeEach // Toda vez antes de alguma coisa
    public void insereDadosParaTeste() {
        BancoDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach // Toda vez depois de alguma coisa
    public void removeDadosDoTeste() {
        BancoDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    public void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @BeforeAll // Antes de tudo
    public static void finalizarConexao() {
        BancoDados.finalizarConexao();
     }
}
