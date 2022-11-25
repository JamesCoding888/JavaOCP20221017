package com.ocp.day9_2.polymorphism_2;

public class Test05 {
	public static void main(String[] args) {
		
		Employee employee = new Manager();
		
		System.out.println("Employee Salary: " + employee.salary);
		
		// To confirm if object of "employee" has relationship of inheritance between Manager and Employee 
		if (employee instanceof Manager) {
			System.out.println("The object of employee is inherited by Manager");
			System.out.println("Downcast the object of employee from Employee.class to Manager.class, for catching the value of variable from budget in Manager.class: " + ((Manager) employee).budget);
		}
		
		// To confirm if object of "employee" has relationship of inheritance between Supervisor and Employee
		if (employee instanceof Supervisor) {
			System.out.println("The object of employee is inherited by Supervisor");
			System.out.println(((Supervisor) employee).stock_option);
		}
	}
}


/*
		Console:
			Employee Salary: 80000
			The object of employee is inherited by Manager
			Downcast the object of employee from Employee.class to Manager.class, for catching the value of variable from budget in Manager.class: 100000
*/