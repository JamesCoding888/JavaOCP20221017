package com.ocp.day9_2.polymorphism_2;

/*
		The Test05 class takes an instance of the Employee, Manager, and Supervisor classes as input and calls the printBudget method with each of them as arguments. 
		
		The printBudget method takes an Employee object as an argument and checks whether it is an instance of Manager or Supervisor. 
		
		If it is an instance of Manager, it downcasts the Employee object to Manager and prints out the value of the budget variable from the Manager class. 
		
		If it is an instance of Supervisor, it downcasts the Employee object to Supervisor and prints out the value of the stock_option variable from the Supervisor class.
		
		Overall, the Test05 class is an example of how to check whether an object is an instance of a particular class or subclass, 
		
		and how to downcast an object to a subclass to access its variables or methods. 
*/
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