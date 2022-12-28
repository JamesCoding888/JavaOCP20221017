package com.ocp.day15.treeset.comparable;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Integer age;
	private Integer salary;

	// sort: True (small to larger)
	// sort: False (large to small)
	private static boolean sort = true; 
	
	public Employee(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public static boolean isSort() {
		return sort;
	}
	
	public static void setSort(boolean sort) {
		Employee.sort = sort;
	}

	// Standard implementations for overriding the method of "public int hashCode(){ ... }"
	// For more detail of hashCode, please follow up the previously lecture at package: com.ocp.day11_2
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.name);
		hash = 31 * hash + this.age;
		hash = 31 * hash + this.salary;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
