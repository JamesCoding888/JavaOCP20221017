package com.ocp.day10;

import java.util.ArrayList; 
import java.util.List;

public class PetStore {
    public static void main(String[] args) {
    	// interface <- class
        Animal maltese  = new Dog();             // 馬爾濟斯
        Animal persian  = new Cat(); 			 // 波斯貓
        Dog chihuahua = new Dog();   			 // 吉娃娃
        Cat british_shorthair = new Cat(); 		 // 英國短毛貓
        maltese.eat();
        maltese.play();
        persian.eat();
        persian.play();
        
        // Collect all object of Animals (maltese and persian) with ArrayList
        List<Animal> animals = new ArrayList<>();
        animals.add(maltese);
        animals.add(persian);
                

        // Java 1.8 - Stream.forEach
        // Invoke the method of name() by each element (i.e., object of animal)
        animals.stream().forEach(nameOfAnimal -> nameOfAnimal.name());
        
        
        maltese.copyRight();
        chihuahua.copyRight();
        british_shorthair.copyRight();
    }
}