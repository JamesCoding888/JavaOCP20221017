package com.ocp.day9_2.polymorphism_1;

public class TestPolymorphism {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Cat lion = new Lion();
		
		cat.animalSound();
		lion.animalSound();
		System.out.println(cat.nameOfAnimal);
		System.out.println(lion.nameOfAnimal);
		System.out.println(cat.getName());
		System.out.println(lion.getName());
	}
}
