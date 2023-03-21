package com.aulas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class) Executa pela ordem q decidimos


// @TestMethodOrder(MethodOrderer.MethodName.class) Executa por ordem alfabética

// @TestMethodOrder(MethodOrderer.Random.class) Executa por ordem aleatória

@TestMethodOrder(MethodOrderer.DisplayName.class) // Coloca um nome, assim ele ordena pelo nome
public class EscolhendoOrdemTest {
    
    // @Order(4) precisa disso com o OrderAnnotation

    @DisplayName("Teste que valida se o usuário foi criado")
    @Test
    public void validaFLuxoA() {
        Assertions.assertTrue(true);
    }

    // @Order(3) precisa disso com o OrderAnnotation

    @DisplayName("B")
    @Test
    public void validaFLuxoB() {
        Assertions.assertTrue(true);        
    }

    // @Order(2) precisa disso com o OrderAnnotation
    
    @DisplayName("C")
    @Test
    public void validaFLuxoC() {
        Assertions.assertTrue(true);
    }

    // @Order(1) precisa disso com o OrderAnnotation

    @DisplayName("D")
    @Test
    public void validaFLuxoD() {
        Assertions.assertTrue(true);        
    }
}
