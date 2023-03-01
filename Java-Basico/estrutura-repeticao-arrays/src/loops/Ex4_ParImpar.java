package loops;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidades de números impares. 
 */

import java.util.Scanner;

public class Ex4_ParImpar {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int qtd = input.nextInt();

        int cont = 0, contPar = 0, contImpar = 0;

        do{
            System.out.print("Digite um número: ");
            int num = input.nextInt();

            if (num % 2 == 0){
                contPar++;
            } else{
                contImpar++;
            }

            cont++;
        } while(cont < qtd);

        System.out.println("Ao todo possui " + contPar + " numeros Pares.");
        System.out.println("Ao todo possui " + contImpar + " numeros Impares.");
    }
}
