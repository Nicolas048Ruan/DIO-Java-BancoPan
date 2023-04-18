package com.aula;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("BMW"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Onix"))); // Retorna boolean se conseguir adicionar
        System.out.println(queueCarros);

        // Faz mesma coisa q o add com a diferença de que se n conseguir adicionar esse retorna false, já o add da erro
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        // Mostra o primeiro objeto da fila sem remove-lo, se estiver vazia ele retorna null
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // Remove o primeiro objeto da lista
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());

    }
}
