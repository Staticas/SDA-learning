package com.company.sdacademy.HomeWork;

public class HomeWork {
    public static void main(String[] args) {

        int arr[] = {5,3,4,1,2};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 1, n-1);

        System.out.println("sorted array");
        printArray(arr);


    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
