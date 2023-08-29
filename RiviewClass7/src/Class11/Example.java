package Class11;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[][] matrix ={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}};
        //write a loop to print all elements from this 2D array
        for (int i = 0; i < matrix.length ; i++) {
            // matrix[i].length the size of each 1d array
            for (int j = 0; j <matrix[1].length ; j++) {
                System.out.println(matrix[i][j]);


            }
            System.out.println();

        }


        }

    }




