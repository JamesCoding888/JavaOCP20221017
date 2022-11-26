package com.ocp.day9_2.polymorphism_2;
// Super-class (父類別): Employee 
// Sub-class (子類別): Manager
public class Manager extends Employee {
	// budget for manager
	// 預算金給經理使用
	public int budget = 100_000;

	// Override the method of jobDescription of Employee
	// 改寫 Employee.class 中的 jobDescription 方法
	@Override 
	public void jobDescription() {
		System.out.println("Project Manager");
	}
}
