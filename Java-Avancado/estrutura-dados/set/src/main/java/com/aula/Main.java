package com.aula;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
    
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("BMW"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Onix"));
        hashSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("BMW"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Onix"));
        treeSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(treeSetCarros);
    
    }
}
