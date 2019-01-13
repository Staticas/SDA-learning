package com.company.sdacademy.animals;

public class Dog extends Pet{
    public Dog(String name, Sex sex, Food food){
        setName(name);
        setSex(sex);
        setFood(food);
    }
    public Dog(String name){
        setName(name);
        setSex(Sex.Unknown);
        setFood(Food.Meat);
    }
    public void bark(){
        System.out.println(getName() + " says Woof woof");
    }

    @Override //method
    boolean sniff(Food f) {
        if(f == Food.Meat || f == Food.Carrots)
            return true;

        return false;
    }
}
