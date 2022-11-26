package com.ocp.day10;
/*	
    What is abstract?
	1) Abstraction can be achieved with either abstract classes or interfaces
	2) The abstract keyword is a non-access modifier, used for classes and methods:
	3) Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
	4) Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).	
*/

// class of AbstractAnimal implements InterfaceAnimal 
public abstract class AbstractAnimal implements InterfaceAnimal  {

	/*
	   Eventually there is a default constructor in abstract class, but 
	   to access the abstract class, abstract class must be inherited from another class	   
	*/ 
	public AbstractAnimal() {
		super();
	}
	
	// Override the abstract method of eat
	// 覆寫介面的抽象方法 eat
	@Override
	public void eat() {
		System.out.println("Eat beef");		
	}
}
