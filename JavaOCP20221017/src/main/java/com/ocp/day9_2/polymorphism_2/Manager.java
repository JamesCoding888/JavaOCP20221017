package com.ocp.day9_2.polymorphism_2;
/*
		This is an example of a Java subclass named "Manager" that extends the "Employee" superclass. 
		
		The "Manager" class has its own instance variable named "budget", which is assigned a value of 100,000. 
		
		This variable represents the budget that is allocated for the manager to use in their role.

*/

// Super-class (父類別): Employee 
// Sub-class (子類別): Manager
public class Manager extends Employee {
	// budget for Manager
	// 預算金給經理使用
	public int budget = 100_000;

	// Override the method of jobDescription of Employee
	// 改寫 Employee.class 中的 jobDescription 方法
	@Override 
	public void jobDescription() {
		System.out.println("Project Manager");
	}
}
