package com.projeto.No;

public class Main {
    
    public static void main(String[] args) {
        
        /*
         * O conceito de nó e Encadeanmento de nó
         * se da ao fato de poder puxar um objeto
         * por outro objeto
         */


        // Dps que refatorar, basta declarar o tipo dela
        No<String> no1 = new No<>("Conteúdo no1");

        No<String> no2 = new No<>("Conteúdo no2");
        // Dei um nó, como settei o no2 como seguido dps do no1, se pedir o próximo o no2 vai aparecer
        no1.setProximoNo(no2); 

        No<String> no3 = new No<>("Conteúdo no3");
        no2.setProximoNo(no3); // A mesma coisa com os outros

        No<String> no4 = new No<>("Conteúdo no4");
    
        no3.setProximoNo(no4);

        // Ex de como vai ser os setters
        // no1->no2->no3->no4->null

        // Isso é bom pq posso criar uma série de ações de diferentes campos chamndo somende um objeto
        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("--------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
