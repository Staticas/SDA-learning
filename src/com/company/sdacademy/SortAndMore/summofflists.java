package com.company.sdacademy.SortAndMore;

public class summofflists {
    public static void main(String args[]) {
        int arr[] = {2, 5, 7};
        // function call
        System.out.println("----SumOffArr----");
        System.out.println(sumOffArr(arr));


    }

// function deffinition
        static int sumOffArr ( int[] arr){
            int sum = 0;
            // i = i+ 1
            // i++
            // ++i
            // i += i
            for (int i = 0; i < arr.length; i++) {
                // sum = sum + arr[i];
                sum += arr[i];


            }
            return sum;
        }

}
