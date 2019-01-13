package com.company;

public class ControlFlow {
    public enum Fruit{
        Apple,
        Orange,
        Banana
    }
    public static void main(String[] args){

        Fruit myFruit = Fruit.Banana;

        switch (myFruit){
            case Apple:
                System.out.println("Mmmm... An apple...");
                break;
            case Banana:
                System.out.println("What am i, Monkey?");
                break;


            default:
                System.out.println("I don't know such fruit!");
                break;
        }
    }

}
