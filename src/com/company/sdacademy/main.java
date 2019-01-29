package com.company.sdacademy;

import static com.company.sdacademy.clasification.Destroyer;

public class main {
    public static void main(String[] args){
        Ships[] ship ={

               new Ships("U-96", clasification.Sub),
                new Ships("Saratoga", clasification.Aircarrier),
                new Ships("Ironforge", clasification.Destroyer)};
           for(Ships s : ship){
               s.fire();
           }
           System.out.println("Sub sighted");
    }
}
