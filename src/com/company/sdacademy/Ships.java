package com.company.sdacademy;

public class Ships {
    private String name;
    private clasification clasification;

    public Ships(String name, clasification c){
        this.name = name;
        clasification = c;
    }
    public clasification  getClasification(){
        return clasification;
    }
    public String getName(){
        return name;
    }
    public void fire(){
        if(clasification == clasification.Destroyer)
            System.out.println(name + " Drops underwater charges");
        if(clasification == clasification.Aircarrier)
            System.out.println(name + " Launches air crafts");
        if(clasification == clasification.Sub)
            System.out.println("Torpedos from starbord");
    }
}
