package com.ocp.day9_2.polymorphism_1;
// Super-class of Lion.class
public class Cat extends Feet {
    String nameOfAnimal = "Cat";
    public void animalSound() {
        System.out.println("meow ~~ meow ~~~~");
    }
    
    public String getName() {
        return nameOfAnimal;
    }
}
