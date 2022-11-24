package com.ocp.day9_2.polymorphism_1;

public class TestPolymorphism {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Cat lion = new Lion();
		Feet cow = new Cow();
		Feet horse = new Horse();
		System.out.println(((Cow)cow).nameOfAnimal);		
		((Cow)cow).animalSound();
		System.out.println("How many feet of Cow have? " + cow.getFeet() + " feet");
		System.out.println(((Horse)horse).nameOfAnimal);
		((Horse)horse).animalSound();
		System.out.println("How many feet of Horse have? " + horse.getFeet() + " feet");
		System.out.println(cat.nameOfAnimal);
		System.out.println("How many feet of Cat have? " + cat.getFeet() + " feet");
		cat.animalSound();
		System.out.println("Omg! What is a creepy sound from " + lion.nameOfAnimal + "!!!");
		lion.animalSound();
		System.out.println("Let's downCast the object of Cat.class to sub-class (i.e., Lion.class)");
		System.out.println(((Lion)lion).nameOfAnimal);
		lion.animalSound();
		System.out.println("OH~~~ Thanks God to help me out");
	}
}


/*
	Console:
			Cow
			moo~~ moo~~~~
			How many feet of Cow have? 4 feet
			Horse
			neigh~~ neigh~~~~
			How many feet of Horse have? 4 feet
			Cat
			How many feet of Cat have? 4 feet
			meow ~~ meow ~~~~
			Omg! What is a creepy sound from Cat!!!
			roar~~ roar~~~~
			Let's downCast the object of Cat.class to sub-class (i.e., Lion.class)
			Lion
			roar~~ roar~~~~
			OH~~~ Thanks God to help me out
*/
	
