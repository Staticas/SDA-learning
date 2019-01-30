package com.company;

import java.util.Scanner;

public class Strings {
    public static void  main(String[] args){
        String str = "hello";
        str += " world";

            // for(int i = 0; i<1000; i++){
           // str += "!";
          //} // allocates a lot of strings= memory
        // strings are immutable
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        String a = "Hello";
        String b = "Hello";
        System.out.println( "Enter a word: ");
        String c = scanner.next();
        // rule : always use equals when comparing
        System.out.println("a = b ? " + (a == b));
        System.out.println("a equals b ? " + (a.equals(b)));

        System.out.println("a = c ?" + (a == c));
        System.out.println("a equals b ? " + (a.equals(c)));
        System.out.println("a equals (ignoring case) c ? " + (a.equalsIgnoreCase(c)));
         String hello = "Hello, Wold!";

         String part1 = hello.substring(0,5);
         String part2 = hello.substring(6); // missing last argument = read to the end
         String concatedStr = part1 + ", " + part2;
         System.out.println(concatedStr);

         String left = "Hello";
         String right = "Hello!";

         int result = left.compareTo(right);

         String sentence = "Hello world! Have a nice day.";


         int idx1 = sentence.indexOf("Have");
         String sub1 = sentence.substring(idx1);
         int idx2 = sentence.lastIndexOf("!");

         String sub2 = sub1.replace("day", "evening");

         StringBuilder sb = new StringBuilder("Hello World");
         //for i in range from 0 to 10
            for(int i = 0; i<10; i++){
             sb.append ("!");
           }
            String finalstring = sb.toString();

    }

}
