package com.company.sdacademy.HomeWork;

import java.util.Arrays;

public class MinMaxSort {

    //    minmax sort
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 4, 2, 7, 9, 8, 6};
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int backup = array[i];
                if (array[i + 1] < array[i]) {
                    array[i] = array[i + 1];
                    array[i + 1] = backup;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
