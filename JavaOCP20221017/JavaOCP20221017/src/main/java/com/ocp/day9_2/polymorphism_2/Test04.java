package com.ocp.day9_2.polymorphism_2;
/*
 
 	The java instanceof operator is used to test whether the object is 
 	an instance of the specified type (class or subclass or interface).

	The instanceof in java is also known as type comparison operator 
	because it compares the instance with type. 
	
	Notice:
		1) It returns either true or false. 
		2) If we apply the instanceof operator with any variable that has null value, 
	   	   it returns false.
	
*/

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
			
			// To confirm if the object is an instance of the specified type (i.e., Manager)
			if(emp.getClass().getSimpleName().equals("Manager")) {
				// Since manager is at the array of object (i.e., Employee[]), 
				// we need to downcast the object of manager from Employee.class to Manager.class, then we could invoke the value of budget   
				System.out.println("budget: " + ((Manager) emp).budget);
			}
			
			if (emp instanceof Manager) { 
				System.out.println("budget: " + ((Manager) emp).budget);
			}
			
			// To confirm if the object is an instance of the specified type (i.e., Supervisor)
			if (emp.getClass().getSimpleName().equals("Supervisor")) {
				// Since supervisor is at the array of object (i.e., Employee[]), 
				// we need to downcast the object of supervisor from Employee.class to Supervisor.class, then we could invoke the value of stock_option
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
