package com.ocp.day9_2.polymorphism_2;

public class Test03 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee supervisor = new Supervisor();

		employee.jobDescription();
		manager.jobDescription();
		supervisor.jobDescription();
	}
}
