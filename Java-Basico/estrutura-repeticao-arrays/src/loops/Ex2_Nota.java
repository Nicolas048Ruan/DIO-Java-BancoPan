package loops;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe
 * um valor válido.
 */

import java.util.Scanner;

public class Ex2_Nota {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double nota;

        while(true){
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = input.nextDouble();

            if (nota < 0 || nota > 10){
                System.out.println("Inválido!! Digite Novamente.");
            } else{
                break;
            }
        }

        System.out.println("A nota informada foi " + nota);
    }
}
