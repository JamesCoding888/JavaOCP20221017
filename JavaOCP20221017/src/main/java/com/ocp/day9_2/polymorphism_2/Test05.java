package com.ocp.day9_2.polymorphism_2;

public class Test05 {
	public static void main(String[] args) {
		
		Employee employee = new Manager();
		
		System.out.println(employee.salary);
		
		if (employee instanceof Manager) {
			System.out.println(((Manager) employee).budget);
		}
		
		if (employee instanceof Supervisor) {
			System.out.println(((Supervisor) employee).stock_option);
		}
	}
}
