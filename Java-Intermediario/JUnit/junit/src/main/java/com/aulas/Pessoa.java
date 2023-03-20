package com.aulas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    
    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    // Vai receber a idade entre o nascimento e a data atual
    public int getIdade() { return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDateTime.now()); }

    public boolean maiorDeIdade() { return getIdade() >= 18; }
}
