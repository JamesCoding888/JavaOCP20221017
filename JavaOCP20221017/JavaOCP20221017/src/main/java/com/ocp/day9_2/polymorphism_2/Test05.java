package com.ocp.day9_2.polymorphism_2;

public class Test05 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		
		System.out.println("Employee Salary: " + employee.salary);
		
		printBudget(employee); // no action after invoking printBudget(Employee employee) method
		printBudget(manager);
		printBudget(supervisor);
	}

	public static void printBudget(Employee employee) {
				
		// To confirm if the object is an instance of the specified type (i.e., Manager)
		if (employee instanceof Manager) {
			System.out.println(employee.getClass());
			System.out.println("The object of employee is downcasted from Employee.class to Manager.class, for getting the value of variable from budget in Manager.class: " + ((Manager) employee).budget);
		}  

		// To confirm if the object is an instance of the specified type (i.e., Supervisor)
		if (employee instanceof Supervisor) {
			System.out.println(employee.getClass());
			System.out.println("The object of employee is downcasted from Employee.class to Supervisor.class, for getting the value of variable from stock_option in Supervisor.class: " + ((Supervisor) employee).stock_option);
		}			
	}
}

/*
	Console:
				Employee Salary: 80000
				class com.ocp.day9_2.polymorphism_2.Manager
				The object of employee is downcasted from Employee.class to Manager.class, for getting the value of variable from budget in Manager.class: 100000
				class com.ocp.day9_2.polymorphism_2.Supervisor
				The object of employee is downcasted from Employee.class to Supervisor.class, for getting the value of variable from stock_option in Supervisor.class: 120000



*/