package com.ocp.day10;

import java.util.ArrayList; 
import java.util.List;

public class PetStore {
    public static void main(String[] args) {
    	// interface <- class
        Animal maltese  = new Dog();
        Animal persian  = new Cat();
        Dog chihuahua = new Dog();
        Cat cat2 = new Cat(); // ???????
        maltese.eat();
        maltese.play();
        persian.eat();
        persian.play();
        
        // Collect all object of animals with ArrayList
        List<Animal> animals = new ArrayList<>();
        animals.add(maltese);
        animals.add(persian);
        
        // Print out the each element (object of animal) of stream, and invoke the method of name()
        animals.stream().forEach(nameOfAnimal -> nameOfAnimal.name());
        
        
        maltese.copyRight();
        chihuahua.copyRight();
        
    }
}