package com.company.sdacademy.SortAndMore.Factorials;

public class FactorialRecursion {
    static int factorial(int n){
        if (n == 1) // stoping condition
            return n;
        else // logic part
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        int number=5;  //It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
