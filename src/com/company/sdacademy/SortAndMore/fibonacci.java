package com.company.sdacademy.SortAndMore;

public class fibonacci {
    public static void main(String args[]) {
        System.out.println("5 -->" + fibRecursive(5));
    }
    static int fibRecursive(int in){
        int fib = in;

        if (in == 0)
            return 0;


        if (in <= 1)
            return 1;



        fib = fibRecursive(in - 1) + fibRecursive(in - 2);
        return fib;

    }
}
