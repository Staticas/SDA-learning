package com.company.sdacademy.FirstTry;

public class PrintArgs {
    public static void main(String[] a){
        System.out.println("-----\n");

        for(int i=0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("Hello 21019");
        System.out.println("-----\n");

        int sum = 0;
        for(int i=0; i < a.length; i++){
            sum = sum + Integer.parseInt(a[i]);
            System.out.println(sum);
        }


    }

}
