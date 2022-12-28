package com.ocp.day15.comparable;

import java.util.Objects;
public class Employee implements Comparable<Employee> {
	
	private String name;
	private Integer age;
	private Integer salary;

	// sort: True (ASCENDING)
	// sort: False (DESCENDING)
	private static boolean sort = true; 
	
	public Employee(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
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
		return Objects.equals(age, other.age) && 
			   Objects.equals(name, other.name) && 
			   Objects.equals(salary, other.salary);
	}

	@Override
	public int compareTo(Employee o) {
//		/*
			// 1) ASCENDING
			//    The expression (age - o.age) calculates the difference between two ages, 
			//    where "age" is the age of one person and "o.age" is the age of another person.
		          
		          return age - o.age;
//		*/ 
 
		
		/*
			// 2) ASCENDING
			//    The expression (salary - o.salary) calculates the difference between two salaries, 
			//	  where "salary" is the salary of one person and "o.salary" is the salary of another person.
	    		  
	    		  return salary - o.salary;
		*/ 

		
		/*		 
		    // 3) DESCENDING
		    //    The expression (o.age - age) calculates the difference between two ages, 
			//    where "age" is the age of one person and "o.age" is the age of another person.
         
         		  return o.age - age;	
		*/

		
		/*
		    // 4) ASCENDING / DESCENDING
		 	//    The expression (sort ? 1 : -1) is a ternary operator 
		 	//    that evaluates to 1 if "sort" is true and -1 if "sort" is false. 
		 	//    This value is then multiplied by the result of the calculation (age - o.age), 
		 	//    which determines the sign of the final result.
		 	  
		 	//    If "sort" is true, the ages will be sorted in ascending order 
		    //    and the result of the calculation will be positive.
			//    If "sort" is false, the ages will be sorted in descending order 
			//    and the result of the calculation will be negative
				  
				  System.out.println("(age - o.age) >= 0 ? " + ((age - o.age) >= 0));
			   	  System.out.println("If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : " + (sort ? 1 : -1));
				  return (age - o.age) * (sort ? 1 : -1);		
		*/		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
