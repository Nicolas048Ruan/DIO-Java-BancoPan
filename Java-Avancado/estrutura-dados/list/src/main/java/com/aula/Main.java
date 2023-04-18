package com.aula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("BWM"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Pegeout"));

        // Retorna boolean se conter ou não o elemento dentro da lista
        System.out.println(listCarros.contains(new Carro("Ford")));

        // Pega no indice desejado
        System.out.println(listCarros.get(2));

        // Mostra o indice q está o elemento desejado
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}
