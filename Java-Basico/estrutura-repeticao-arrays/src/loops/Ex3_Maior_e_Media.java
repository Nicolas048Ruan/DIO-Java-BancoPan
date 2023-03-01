package loops;

/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números 
 */

import java.util.Scanner;

public class Ex3_Maior_e_Media {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;
        int cont = 0, soma = 0;
        int maior = Integer.MIN_VALUE;
        double media;

        do{
            System.out.print("Digite um número: ");
            num = input.nextInt();

            soma += num;

            if( num > maior ){ maior = num; }

            cont++;
        } while(cont != 5);

        media = soma / cont;

        System.out.println("Maior número: " + maior);

        System.out.printf("Média: %.1f", media);
    }
}
