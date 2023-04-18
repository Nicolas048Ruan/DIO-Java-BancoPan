package com.aula;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford")); // Add o objeto a pilha
        stackCarros.push(new Carro("BMW"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); // Retira o último da pilha
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); // Te mostra o último da pilha sem retira-lo
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());

    }
}
