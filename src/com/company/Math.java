package com.company;

public class Math {

    static void PrintPretty(int countA, int countB, int startB){
        int b=startB;
        int a=1;
        while (a<countA + 1) {
            while (b < startB + countB) {
                System.out.printf(String.format("%d * %d = %d ", a, b, a * b)).print("\t\t");
                b += 1;
            }
            b=startB;
            System.out.printf("").println();
            a += 1;
            if (a>=10){
                while (b < startB + countB) {
                    System.out.printf(String.format("%d * %d = %d ", a, b, a * b)).print("\t");
                    b += 1;
                }
            }
        }
        System.out.printf("").println();
    }



    public static void main(String[] main) {
        int a = 1;
        int b = 1;


        while (b < 11){
            while (a < 11){
                System.out.printf(String.format("%d * %d = %d", a, b, a * b)).println();
                a += 1;


            }
            //if (a >= 11) {
                 a = 1;
            //}



            b += 1;




        }
        System.out.printf("").println();
        System.out.printf("").println();

        PrintPretty(9, 5, 1);
        PrintPretty(9, 5, 6);


       /* b=1;
        a=1;
        while (a<11) {
            while (b < 6) {
                System.out.printf(String.format("%d * %d = %d ", a, b, a * b)).print("");
                b += 1;
            }
            b=1;
            System.out.printf("").println();
            a += 1;
        }

        a=1;
        b=6;

        System.out.printf("").println();
        System.out.printf("").println();

        while (a<11) {
            while (b < 11) {
                System.out.printf(String.format("%d * %d = %d ", a, b, a * b)).print("");
                b += 1;
            }
            b=6;
            System.out.printf("").println();
            a += 1;
        }
        */

    }

    }

