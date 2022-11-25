package com.ocp.day9_2.polymorphism_2;

public class Test01 {
	
	public static void main(String[] args){		
		Employee employee = new Employee();		
		System.out.println("Employee salary: $" + employee.salary);
		System.out.print("Job Description: ");
		employee.jobDescription();
		Manager manager = new Manager();		
		System.out.println("Manager salary: $" + manager.salary);		
		System.out.println("Budget of Manager: $" + manager.budget);
		System.out.print("Job Description: ");
		manager.jobDescription();
		Supervisor supervisor = new Supervisor();
		System.out.println("Supervisor salary: $" + supervisor.salary + " What! Are you sure!!!");
		System.out.println("No worry ~ " + "We supply" + " Stock Option, $" + supervisor.stock_option +  ", for you");
		System.out.print("Job Description: ");
		supervisor.jobDescription();		
		System.out.println(((Manager)((Employee)supervisor)).budget); // Bug here - Exception in thread "main" java.lang.ClassCastException
	}
}


/*
	Console:
			Employee salary: $80000
			Job Description: Programming
			Manager salary: $80000
			Budget of Manager: $100000
			Job Description: Project Manager
			Supervisor salary: $80000 What! Are you sure!!!
			No worry ~ We supply Stock Option, $120000, for you
			Job Description: Business Strategy
			Exception in thread "main" java.lang.ClassCastException: class com.ocp.day9_2.polymorphism_2.Supervisor cannot be cast to class com.ocp.day9_2.polymorphism_2.Manager (com.ocp.day9_2.polymorphism_2.Supervisor and com.ocp.day9_2.polymorphism_2.Manager are in unnamed module of loader 'app')
				at com.ocp.day9_2.polymorphism_2.Test01.main(Test01.java:20)

*/
