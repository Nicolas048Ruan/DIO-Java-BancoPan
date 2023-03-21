package com.aulas;

public class TransferenciaContas {
    
    public void transfere(Conta origem, Conta destino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
