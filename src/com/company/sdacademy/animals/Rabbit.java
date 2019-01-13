package com.company.sdacademy.animals;

public class Rabbit extends Pet{
    public Rabbit(String name, Sex sex, Food food){
        setName(name);
        setSex(sex);
        setFood(food);
    }
    public Rabbit(String name){
        setName(name);
        setSex(Sex.Unknown);
        setFood(Food.Carrots);
    }
    public void raises(){
        System.out.println(getName() + " raises her ears");
    }

    @Override
    boolean sniff(Food f) {
        return f == Food.Carrots;
    }
}
