package com.aulas;

import java.util.logging.Logger;

public class BancoDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou Conexao"); // Para aparecer a mensagem na tela
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou Conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        // Insere pessoa no DB
        LOGGER.info("Inseriu Dados");

    }

    public static void removeDados(Pessoa pessoa) {
        // Insere pessoa no DB
        LOGGER.info("Removeu Dados");

    }
}
