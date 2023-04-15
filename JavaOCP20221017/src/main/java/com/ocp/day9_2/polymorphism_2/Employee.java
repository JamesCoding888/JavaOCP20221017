package com.ocp.day9_2.polymorphism_2;
/*
 		This is an example of a Java class named "Employee", 
 		
 		which serves as a superclass (or parent class) for other classes that inherit its properties and methods.
 		
 		Overall, this class provides a basic template that can be used to create more specific classes for different types of employees within the company. 
 		
 		By inheriting from this superclass, these classes will have access to its properties and methods, and can override them or add new ones as needed.
*/

// Super-class (父類別): Employee
public class Employee {

	// Create a basic salary for all positions
	// 建立所有職位之基本薪資
	public int salary = 80_000;
	
	// A global method for all positions
	// 建立一個共用的方法給所有職員使用
	public void jobDescription() {
		System.out.println("Programming");
	}
}
