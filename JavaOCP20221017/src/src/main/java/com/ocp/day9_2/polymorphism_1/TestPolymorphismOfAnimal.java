package com.ocp.day9_2.polymorphism_1;

/*
	Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

	Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

	For example, think of a super-class called Cat that has a method called animalSound(). Sub-classes of Animals could be Lion...etc - And they also have their own implementation of an animal sound (the Lion "roar", etc.)
	
	
	The following the structures of Polymorphism are:
	
	
		Super-class:	Cat       Feet     Feet
			 
			 	     	 ^			^        ^
			         	 |			|        |
			 
		Sub-class:	   	Lion	   Cow     Horse
	
	
	
	
*/

public class TestPolymorphismOfAnimal {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Cat lion = new Lion(); // Polymorphism 
		Feet cow = new Cow();  // Polymorphism
		Feet horse = new Horse();
		// Since there is no variable of nameOfAnimal in Feet.class, 
		// we need object of cow being downcasted to Cow.class
		System.out.println(((Cow)cow).nameOfAnimal); 
		// Since there is no method of animalSound() in Feet.class, 
		// we need object of cow being downcasted to Cow.class
		((Cow)cow).animalSound();
		System.out.println("How many feet of Cow have? " + cow.getFeet() + " feet");
		// Since there is no variable of nameOfAnimal in Feet.class, 
		// we need object of horse being downcasted to Horse.class
		System.out.println(((Horse)horse).nameOfAnimal);
		// Since there is no method of animalSound() in Feet.class, 
		// we need object of horse being downcasted to Horse.class
		((Horse)horse).animalSound();
		System.out.println("How many feet of Horse have? " + horse.getFeet() + " feet");
		System.out.println(cat.nameOfAnimal);
		System.out.println("How many feet of Cat have? " + cat.getFeet() + " feet");
		cat.animalSound();
		System.out.println("Omg! What is a creepy sound from " + lion.nameOfAnimal + "!!!");
		// Because the object of lion is from Cat, then you invoke the method of animalSound() that will be "meow".
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
	
