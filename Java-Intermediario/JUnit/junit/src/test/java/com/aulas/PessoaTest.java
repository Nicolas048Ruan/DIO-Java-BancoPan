package com.aulas;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class PessoaTest {
    
    @Test
    public void calcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

        // Aqui estou mandando a resposta q estou esperando (no caso 23) comparar cm a q vai vir na class Pessoa
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    public void retornaSeMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.maiorDeIdade()); // Para testar se vai retornar true

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.maiorDeIdade()); // Para testar se vai retornar false

    }
}
