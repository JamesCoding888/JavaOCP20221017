package com.ocp.day9_2.polymorphism_2;
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
