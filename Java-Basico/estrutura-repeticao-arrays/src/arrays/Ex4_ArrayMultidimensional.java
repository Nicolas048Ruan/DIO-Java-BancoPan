package arrays;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    
    public static void main(String[] args) {
        
        int[][] M = new int[4][4];

        Random random = new Random();

        for (int i=0; i<M.length; i++){

            for (int j=0; j<M[i].length; j++){

                M[i][j] = random.nextInt(9);

            }

        }

        for (int[] i : M){

            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    }
}
