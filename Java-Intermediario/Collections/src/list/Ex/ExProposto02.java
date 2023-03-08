package list.Ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "Cúmplice" e 5 como "Assassina".
Caso contrário, ele será classificado como "Inocente".
*/

public class ExProposto02 {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<String>();

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? [S/N] ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? [S/N] ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? [S/N] ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? [S/N] ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? [S/N] ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        Iterator<String> iterator = respostas.iterator();
        int count = 0;
        while(iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("s")){
                count++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
