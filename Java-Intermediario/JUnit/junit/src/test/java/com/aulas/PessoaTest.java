package com.aulas;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class PessoaTest {
    
    @Test
    public void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Nicolas", LocalDate.of(2020, 1, 1));

        // Aqui estou mandando a resposta q estou esperando (no caso 2) comparar cm a q vai vir na class Pessoa
        Assertions.assertEquals(3, pessoa.getIdade());

    }
}
 