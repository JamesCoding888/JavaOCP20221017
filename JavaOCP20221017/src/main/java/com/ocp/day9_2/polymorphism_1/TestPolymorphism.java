package com.ocp.day9_2.polymorphism_1;

public class TestPolymorphism {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Cat tiger = new Lion();
		cat.animalSound();
		tiger.animalSound();
		System.out.println(cat.nameOfAnimal);
		System.out.println(tiger.nameOfAnimal);
		System.out.println(cat.getName());
		System.out.println(tiger.getName());
	}
}
