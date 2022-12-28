package com.ocp.day15.comparable;

import java.util.Set;
import java.util.TreeSet;
public class TreeSetComparable {
	public static void main(String[] args) {
		Employee.setSort(SortType.小到大.getValue());
		Employee employee1 = new Employee("James", 20, 45000);
		Employee employee2 = new Employee("David", 35, 55000);
		Employee employee3 = new Employee("Tim", 55, 65000);
		Set<Employee> employees = new TreeSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		System.out.println(employees);
	}
}

/*
	Console:
			[Employee [name=Mary, age=25, salary=48000], Employee [name=John, age=30, salary=45000], Employee [name=Bob, age=40, salary=55000]]

*/