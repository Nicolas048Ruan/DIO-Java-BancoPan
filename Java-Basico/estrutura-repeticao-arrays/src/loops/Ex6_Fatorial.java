package loops;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!= 120
 */

import java.util.Scanner;

public class Ex6_Fatorial {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int fatorial = input.nextInt();

        int resul = 1;

        System.out.print(fatorial+"!= ");
        for (int i=fatorial; i>=2; i--){
            resul *= i;
        }
        System.out.println(resul);
    }
}
