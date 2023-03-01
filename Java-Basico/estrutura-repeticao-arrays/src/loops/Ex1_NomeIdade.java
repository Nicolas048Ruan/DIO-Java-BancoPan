package loops;

/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando sua idade.
 * (Pare inserindo o valor 0 no campo nome)
 */

import java.util.Scanner;

public class Ex1_NomeIdade {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.print("Nome [0 para parar]: ");
            nome = input.next();

            if (nome.equals("0")){
                break;
            } else{
                System.out.print("Idade: ");
                idade = input.nextInt();
            }
        }
    }
}
