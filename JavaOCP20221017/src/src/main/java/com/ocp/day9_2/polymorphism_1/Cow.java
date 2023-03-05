package com.ocp.day9_2.polymorphism_1;

public class Cow extends Feet{
	String nameOfAnimal = "Cow";

	public void animalSound() {
		System.out.println("moo~~ moo~~~~");
	}

	public String getName() {
		return nameOfAnimal;
	}
}
