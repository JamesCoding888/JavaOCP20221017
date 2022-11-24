package com.ocp.day9_2.polymorphism_2;

public class Manager extends Employee {
	public int budget = 100_000;

	public void jobDescription() {
		System.out.println("Project Manager");
	}
}
