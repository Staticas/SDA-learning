package com.company.sdacademy.animals;

import static com.company.sdacademy.animals.Food.*;

public class Main {
    public static void main(String[] args){
        Food[] foods = {Carrots,Meat};

        // foods[2]
        // food
        Pet[] pets = {
                new Dog("Charlie", Sex.Male, Food.Meat),
                new Dog("Betty", Sex.Female, Food.Meat),
                new Dog("Spark"),
                new Cat("Love",Sex.Female, Food.Meat),
                new Rabbit("Fluffy", Sex.Female, Carrots)
        };
        for(Pet pet : pets){
            System.out.println("Hello, my name is " + pet.getName());
            if(pet instanceof Dog){
                ((Dog)pet).bark();
            } else if (pet instanceof Cat){
                ((Cat)pet).meow();
            } else if (pet instanceof Rabbit){
                ((Rabbit)pet).raises();
            } else {
                System.out.println("I don't know what's wrong");
            }
        }

        for(Food food : foods){
            for(Pet pet : pets){
                if(pet.sniff(food)){
                    System.out.printf(
                            "%s (class: %s) ate %s\n",
                            pet.getName(),
                            pet.getClass().getSimpleName(),
                            food
                            );
                }
            }
        }

    }
}
