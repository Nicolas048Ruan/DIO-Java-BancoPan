package com.aulas;

import java.time.LocalDateTime;

// import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Para qndo n quer usar Assertions. td hr
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;



public class AssertionsTest {
    
    @Test
    public void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundaLancamento = {10, 20, 30, 40, 50};

        // Verifica se cada parâmetro é igual ao outro
        assertArrayEquals(primeiroLancamento, segundaLancamento);

        // Verifica se não são iguais
        // Assertions.assertNotEquals(primeiroLancamento, segundaLancamento);
    }

    @Test
    public void validarSeObjetoNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa); // Valida se está nula

        pessoa = new Pessoa("Lukas", LocalDateTime.now());
        assertNotNull(pessoa); // Valida se não está nula
    }

    @Test
    public void validarNumsDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor, outroValor); // Valida se são iguais

        outroValor = 8.0;
        assertNotEquals(valor, outroValor); // Valida se não são iguais
    }
}
