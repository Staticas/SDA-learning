package com.company.sdacademy.SortAndMore.Factorials;

public class Factorial1 {
    public static void main(String args[]) {
        System.out.println(factorial(6));
       /*
       // 1nd. micro-benching
        int fibRes;
        int input = 10;
        long startTime = System.nanoTime();
        fibRes = fibRecursive(10);
        long endTime = System.nanoTime();
        System.out.println("The fib recursive(" + input + ") call took: " + (endTime - startTime) + " ns");

*/


        // 2nd. micro-benching
        long startTime, endTime;
        int fibRes;
        for(int input = 1; input < 15; input++){
            startTime = System.nanoTime();
            fibRes = fibRecursive(input);
            endTime = System.nanoTime();
            System.out.println("The fibRecursive(" + input + ") call took: " + (endTime - startTime) + "ns");
        }
    }

    static int factorial(int in){
        int fact = 1;
        for(int i = 1; i <= in; i++){
            // fact = fact * i;
            fact *= i;
        }
        return fact;
    }
    static int fibRecursive(int in){
        int fib = in;

        // stoping condition
        if(in == 0)
            return 0;

        if(in <= 1)
            return 1;

        // logic
        fib = fibRecursive(in - 1) + fibRecursive(in - 2);
        return fib;
    }
}
