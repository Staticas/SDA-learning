package com.company.sdacademy;

import com.company.sdacademy.HomeWork.QuickSort;

public class QuickSortAlg {
    public static void main(String args[]) {
        int arr[] = {5,3,4,1,2};
        int n = arr.length;

        QuickSortAlg ob = new QuickSortAlg();
        ob.QuickSort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }



    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public void QuickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            QuickSort(arr, begin, partitionIndex-1);
            QuickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}
