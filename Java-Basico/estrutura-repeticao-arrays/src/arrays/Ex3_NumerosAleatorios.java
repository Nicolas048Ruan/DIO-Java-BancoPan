package arrays;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores
 */

 import java.util.Random;

public class Ex3_NumerosAleatorios {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numsAleatorios = new int[20];

        for (int i=0; i<numsAleatorios.length; i++){
            numsAleatorios[i] = random.nextInt(100);
        }

        System.out.println("Aleatórios:");
        for (int num : numsAleatorios){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Sucessores:");
        for (int num : numsAleatorios){
            System.out.print((num + 1) + " ");
        }
        System.out.println();

        System.out.println("Antecessores:");
        for (int num : numsAleatorios){
            System.out.print((num - 1) + " ");
        }
    }
}
