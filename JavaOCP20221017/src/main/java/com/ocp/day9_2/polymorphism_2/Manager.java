package com.ocp.day9_2.polymorphism_2;
// Super-class (父類別): Employee 
// Sub-class (子類別): Manager
public class Manager extends Employee {
	public int budget = 100_000;

	@Override
	public void jobDescription() {
		System.out.println("Project Manager");
	}
}
