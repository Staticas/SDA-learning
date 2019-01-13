package com.company;

import java.util.Scanner;

public class Loopsy {

    public static void main (String[] args){

       /* int i = 3;
        //Executes minimum 0 times
        while(i>0){
            System.out.println("i'm a loop!");
            i--;
        }
        // Executes minimum 1 time
        do {
            System.out.println("i'm an another loop!");

        }while(2 == 5);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num > 0){
            System.out.println("Yey!");
            System.out.print("Please enter positive number: ");
            num = scanner.nextInt();
        }
        do{
            System.out.println("Yay!");
            System.out.print("Please enter positive number: ");
            num = scanner.nextInt();

        } while(num >0);
        */
       // Countin in for loop.
       int sum =0;
       for(int i =0; i<10; i++){
           sum += 1;
           System.out.println("I'm a for loop!");

       }
       //Enchanced FOR loop
        int[] nums = {1,2,3,4,5};

       for(int n : nums){
           System.out.println(n);
       }

       int number =10;

        for(int i =-5; i<5; i++){
            if ( i ==0){
                continue;
            }
            System.out.println(number/i);
        }


        for(int i =-5; i<5; i++){
            if ( i ==0){
                continue;
            }
            if(i == 2){
                break;
            }

            System.out.println(number/i);
        }


    }

}
