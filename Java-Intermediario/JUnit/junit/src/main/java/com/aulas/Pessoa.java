package com.aulas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() { return nome; }

    public LocalDate getNascimento() { return nascimento; }

    // Vai receber a idade entre o nascimento e a data atual
    public int getIdade() { return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()); }

    public boolean MaiorDeIdade() { return getIdade() >= 18; }
}
 