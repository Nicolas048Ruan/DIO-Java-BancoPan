package com.projeto.conceito_encadeamento_no;

public class Main {
    
    public static void main(String[] args) {
        
        /*
         * O Conceito e Encadeanmento de nó
         * se da ao fato de poder puxar um objeto
         * por outro objeto
         */
        
        No no1 = new No("Conteúdo no1");

        No no2 = new No("Conteúdo no2");
        // Dei um nó, como settei o no2 como seguido dps do no1, se pedir o próximo o no2 vai aparecer
        no1.setProximoNo(no2); // Referência do no1 aponta pro no2

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3); // no2 aponta pro no3

        No no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4); // no3 aponta pro no4

        // Ex de como vai ser os setters
        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("--------------------------------");

        System.out.println(no1); // no1
        System.out.println(no1.getProximoNo()); // no2
        System.out.println(no1.getProximoNo().getProximoNo()); // no3
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // no4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // null

    }
}
