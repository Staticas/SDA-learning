package com.company.sdacademy.animals;

    public abstract class Pet {
     private String name; // fields
     private Sex sex;
     private Food food;
     private float hungry;

     public void setSex(Sex s){ // method
      sex = s;
     }
     public String getName(){
      return name;
     }
     public Sex getSex(){
      return sex;
     }
     public void setName(String name){
      this.name = name;

     }
     public Food getFood(){
      return food;
     }
     public void setFood(Food f){
      food = f;
     }
     abstract boolean sniff(Food f);
}
