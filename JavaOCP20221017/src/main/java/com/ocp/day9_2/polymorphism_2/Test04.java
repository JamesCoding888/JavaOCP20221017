package com.ocp.day9_2.polymorphism_2;

public class Test04 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		// Collect all objects, based on differently positions, with Employee[]
		Employee[] employees = { employee, manager, supervisor };
		// for-each 
		// Print out the value of each employee from invoking their variable(s) by object
		for (Employee emp : employees) {
			
			// Returns the simple name of the each object and salary from each position
			System.out.println(emp.getClass().getSimpleName() + ", Salary: " + emp.salary);
			
			// Print out the Job Description
			emp.jobDescription();
			
			// To confirm if object of emp is inheritance of Manager
			if(emp.getClass().getSimpleName().equals("Manager")) {
				// Since the object of Manager 
				System.out.println("budget: " + ((Manager) emp).budget);
			}
			
			if (emp instanceof Manager) { 
				System.out.println("budget: " + ((Manager) emp).budget);
			}
			
			// To confirm if object of emp is inheritance of Supervisor
			if (emp.getClass().getSimpleName().equals("Supervisor")) {
				System.out.println("stockoption: " + ((Supervisor) emp).stock_option);
			}
			
			if (emp instanceof Supervisor) {
				System.out.println("stockoption: " + ((Supervisor) emp).stock_option);
			}
			
		}

		// Manager[] managers = {manager, supervisor};
	}
}


/*
	Console:
				Employee, Salary: 80000
				Programming
				Manager, Salary: 80000
				Project Manager
				budget: 100000
				budget: 100000
				Supervisor, Salary: 80000
				Business Strategy
				stockoption: 120000
				stockoption: 120000

*/
