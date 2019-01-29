package com.company.sdacademy;

public class findduplicates {
    public static void main(String args[]) {
        // 1 define test array
        int[] arr = {1, 5, 2, 3, 5};
        //  4 call the function
        findDubs(arr);
    }
    // 2 define the function header
    static void findDubs (int[] arr){
        // 3 implement the algorithm
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicates " + arr[i]);
                }
            }
        }
    }
}
