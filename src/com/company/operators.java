package com.company;

public class operators {
    public static void main(String[]args){
        int a = 5;
         a += 5; // a= a+5
        a -= 3;

        a *=2;
        a /=3;
        float b = (float)14/3;
        float c = 14/3; // incorrect answer

        boolean cond1 = a >b;
        boolean cond2 = a>=b;
        boolean cond3 = a != b;
        boolean cond4 = a == b;



        boolean even = 15 %2 ==0;
        int bin1 = 0b1001;
        int bin2 = 0b1000;
        //1000 this is the result
        int bin3 = bin1 & bin2;

        int bin11 = 0b1010010;
        int bin12 = 0b1010001;
        //1010000 this is the result
        int bin13 = bin11 & bin12;  //binary and
        int bin4 = bin11 | bin12; //binary or
        int bin5 = bin11 ^ bin12; // binary XOR  not and not or
        int bin6 = ~bin11; //makes oposit 1 and 0


        int num = 2;// 0010->0100
        //0010 ->0001
        int result = num <<1;
        ///>> moves 1 to the right
        /// << moves 1 to the left



        int num9;
        if(true){
            num9 = 5;
        }
        else{
            num9 = 6;
        }
        int num8 = 2 > 1 ? 5: 6;
        String str = "abc";
        // a instaneof String
        //if(str String);


        //boolean con8 = (con1 && con2) || cond3) ||
        //(cond4 && !even);
        //String result = "Hello " + "world" + 5

    }
}
