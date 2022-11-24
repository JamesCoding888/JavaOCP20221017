package com.ocp.day9_2.polymorphism_1;

public class Horse extends Feet{
	String nameOfAnimal = "Horse";

	public void animalSound() {
		System.out.println("neigh~~ neigh~~~~");
	}

	public String getName() {
		return nameOfAnimal;
	}
}
