package arrays;

/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

import java.util.Scanner;

public class Ex2_Consoantes {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int qtdConsoante = 0;

        int cont = 0;

        do{
            System.out.print("Letra: ");
            String letra = input.next();

            if ( 
                !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))
            ){
                consoantes[cont] = letra;
                qtdConsoante++;
            }

            cont++;

        } while(cont < consoantes.length);

        System.out.println("Tem " + qtdConsoante + " consoantes:");
        for (String consoante : consoantes) {
            if (consoante != null){ System.out.print(consoante + " "); }
        }
    }
}
