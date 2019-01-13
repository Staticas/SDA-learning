package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] main) {
	Scanner scanner = new Scanner(System.in);
	int width, height; // declaration
        int int_ = 5;     //initialization


	System.out.print( "Emter packege dimension (WxH): ");
   width = scanner.nextInt();
   height = scanner.nextInt();
   System.out.println(String.format("%d x %d" ,width,height));

   // int numbers[] = {1,2,3,4,5,6,7}; // metod too line up the elements
   // int numbers2[] = new int 8;
   // numbers2[9] =10; // will crash
        int numbers[] = {1,2,3,4,5,6,7}; // metod too line up the elements
        int numbers2[] = new int[8];
        numbers2[2] =7;  // chancge set line
        {
            int secretInt = 42;
            System.out.println(secretInt);

        }

        // block mechanics in here
        // operators are +-= and so on
        // left = right
        // operant1 = operant2
        String string = "Helllo " + "world";
        }



}
