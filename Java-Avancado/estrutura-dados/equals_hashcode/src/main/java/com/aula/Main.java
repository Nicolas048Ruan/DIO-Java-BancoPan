package com.aula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Carro> carroList = new ArrayList<>();

        carroList.add(new Carro("Ford"));
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Onix"));

        System.out.println(carroList.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("BMW");

        System.out.println(carro1.equals(carro2));

    }
}
