package arrays;

/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa
 */

public class Ex1_OrdemInversa {
    
    public static void main(String[] args) {
        
         int[] vetor = {-6, 15, -5, 8, 50, 4};

         for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
         }
         System.out.println();

         for (int i=(vetor.length - 1); i>=0; i--){
            System.out.print(vetor[i] + " ");
         }
    }
}
