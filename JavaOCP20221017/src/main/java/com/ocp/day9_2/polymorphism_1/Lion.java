package com.ocp.day9_2.polymorphism_1;

public class Lion extends Cat {
    String nameOfAnimal = "Tiger";
    public void animalSound() {
        System.out.println("roar~~ roar~~~~");
    }
    public String getName() {
        return nameOfAnimal;
    }
}
