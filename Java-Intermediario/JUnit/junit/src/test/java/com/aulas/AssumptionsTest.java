package com.aulas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    
    @Test
    public void validarSomenteNoUsuarioWillyan() {

        // Só vou executar algo se o usuário for willyan
        // Assumptions.assumeTrue("Willyan".equals(System.getenv("USER")));

        // Só vou executar algo se o usuário não for root
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
