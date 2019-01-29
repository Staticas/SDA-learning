package com.company.sdacademy.animals;

public class Cat extends Pet{
    public Cat(String name, Sex sex, Food food){ // Constructor
        setName(name);
        setSex(sex);
        setFood(food);
    }
    public Cat(String name){ // Constructor
        setName(name);
        setSex(Sex.Unknown);
        setFood(Food.Meat);
    }
    public void meow(){
        System.out.println(getName() + " says meow");
    }

    @Override
    public boolean sniff(Food f) {
        return f == Food.Meat;
    }
}
