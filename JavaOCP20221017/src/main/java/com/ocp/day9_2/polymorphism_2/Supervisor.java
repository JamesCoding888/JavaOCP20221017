package com.ocp.day9_2.polymorphism_2;
// Super-class (父類別): Employee 
// Sub-class (子類別): Supervisor
public class Supervisor extends Employee {
	public int stock_option = 120_000;

	@Override
	public void jobDescription() {
		System.out.println("Business Strategy");
	}
}
