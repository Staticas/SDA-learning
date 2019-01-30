package com.company;

public class Arrays {
    public static void main(String[] args){
        int[] num1 = {2,4,5,1};

        int[] num2 = new int[5];
        num2[0] = 2;
        num2[1] = 4;
        num2[2] = 5;
        num2[3] = 1;
        int something = num2[2];
        num2[1] = 10;
        // matrix
        int[][] matrix = new int[4][4];
        for(int i = 0; i <4; i++){
            for(int j = 0; j<4; j++){
                matrix[i][j] = i * j;
                // System.out.printf("[%d, %d} = %d, i, j, matrix[i][j]");
                System.out.printf("%d", matrix[i][j] ); // same metod as->
                //System.out.print(String.format("%d ", matrix[i][j])):
            }
            System.out.println();
        }

    }
}
