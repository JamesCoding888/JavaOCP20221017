package com.ocp.day9_2.polymorphism_2;

public class Test05 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		
		System.out.println("Employee Salary: " + employee.salary);
		
		printBudget(employee);
		printBudget(manager);
		printBudget(supervisor);
	}

	public static void printBudget(Employee employee) {
		
		// To confirm if object of "employee" has relationship of inheritance between Manager and Employee
		if (employee instanceof Manager) {
			System.out.println("The object of employee is inherited by Manager: "  + employee.getClass());
			System.out.println("The object of employee is downcasted from Employee.class to Manager.class, for catching the value of variable from budget in Manager.class: " + ((Manager) employee).budget);
		}  

		// To confirm if object of "employee" has relationship of inheritance between Supervisor and Employee
		if (employee instanceof Supervisor) {
			System.out.println("The object of employee is inherited by Supervisor: " + employee.getClass());
			System.out.println(((Supervisor) employee).stock_option);
		}			
	}
}

/*
	Console:
				Employee Salary: 80000
				The object of employee is inherited by Manager: class com.ocp.day9_2.polymorphism_2.Manager
				The object of employee is downcasted from Employee.class to Manager.class, for catching the value of variable from budget in Manager.class: 100000
				The object of employee is inherited by Supervisor: class com.ocp.day9_2.polymorphism_2.Supervisor
				120000


*/