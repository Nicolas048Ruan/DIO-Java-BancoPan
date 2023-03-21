package com.aulas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    
    @Test
    public void validarExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaContas transferenciaContas = new TransferenciaContas();

        // Assertions.assertDoesNotThrow(() -> transferenciaContas.transfere(contaOrigem,
        //     contaDestino, 20));
    }
}
