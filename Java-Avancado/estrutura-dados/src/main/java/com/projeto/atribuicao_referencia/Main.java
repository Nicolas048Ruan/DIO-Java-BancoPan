package com.projeto.atribuicao_referencia;

public class Main {
    
    public static void main(String[] args) {
        
        int intA = 1;
        int intB = intA; // Cópia de valor

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);

        // Usando objetos, se eu mudar um vai mudar todos que estão relacionados a ele
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA; // Cópia de referência
        
        System.out.println("objA=" + objA + " objB=" + objB); // output -> objA=1 | objB=1
        objA.setNum(2); // Mudei o valor de A
        System.out.println("objA=" + objA + " objB=" + objB); // output -> objA=2 | objB=2

    }
}
