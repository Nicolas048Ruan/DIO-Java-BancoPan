package loops;

/*
 * Desenvolva um gerador de tabuada, capaz de
 * gerar a tabuada de qualquer número entre 1 a 10.
 * O usuário deve informar qual número ele deseja ver a tabuada.
 * A saida deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Qual tabuada você deseja? ");
        int tabu = input.nextInt();

        System.out.println("Tabuada de " + tabu + ":");
        for (int i=1; i<=10; i++){
            System.out.println(tabu + " X " + i + " = " + (tabu * i));
        }
    }
}
