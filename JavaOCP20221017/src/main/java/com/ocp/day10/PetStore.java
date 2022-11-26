package com.ocp.day10;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog dog2 = new Dog();
        Cat cat2 = new Cat();
        dog.eat();
        dog.play();
        cat.eat();
        cat.play();
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        System.out.println(animals);
        dog.copyRight();
        dog2.copyRight();
        
    }
}