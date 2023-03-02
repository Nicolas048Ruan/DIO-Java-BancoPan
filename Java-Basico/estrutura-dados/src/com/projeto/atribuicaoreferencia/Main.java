package com.projeto.atribuicaoreferencia;
 
public class Main {
    
    public static void main(String[] args) {
        
        int intA = 1;
        // Neste caso, se eu vir a mudar o valor d intA no futuro, o intB não muda junto
        int intB = intA; 

        System.out.println("intA=" + intA + " intB=" + intB); // output -> intA=1 | intB=1
        intA = 2; // Mudei o valor de A
        System.out.println("intA=" + intA + " intB=" + intB);// output -> intA=2 | intB=1

        // Usando objetos, se eu mudar um vai mudar todos que estão relacionados a ele
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        
        System.out.println("objA=" + objA + " objB=" + objB); // output -> objA=1 | objB=1
        objA.setNum(2); // Mudei o valor de A
        System.out.println("objA=" + objA + " objB=" + objB); // output -> objA=2 | objB=2

    }
}
