package com.ocp.day15.comparable;
/*
	The code provided is a Java program that demonstrates the use of a TreeSet to sort and store objects of the Employee class based on their properties.
	
	The Employee class implements the Comparable interface, allowing the objects to be compared and sorted.
	 
*/
import java.util.Set;
import java.util.TreeSet;
public class TreeSetComparable {
	public static void main(String[] args) {	
		// Notice here !!! 
		// The following expression of "SortedOrder.DESCENDING.getValue()" or SortedOrder.ASCENDING.getValue(),
		// will affect the result of sorted order from "public int compareTo(Employee o) { return (age - o.age) * (sort ? 1 : -1); } "
		Employee.setSort(SortedOrder.ASCENDING.getValue());
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
 	
 	Console 1):
				[Employee [name=James, age=20, salary=45000], Employee [name=David, age=35, salary=55000], Employee [name=Tim, age=55, salary=65000]]

	
	Console 2):
 				[Employee [name=James, age=20, salary=45000], Employee [name=David, age=35, salary=55000], Employee [name=Tim, age=55, salary=65000]]

 	Console 3):
				[Employee [name=Tim, age=55, salary=65000], Employee [name=David, age=35, salary=55000], Employee [name=James, age=20, salary=45000]]

	
	Console 4) - based on the expression of "SortedOrder.ASCENDING.getValue()":
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : 1
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : 1
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : 1
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : 1
				[Employee [name=James, age=20, salary=45000], Employee [name=David, age=35, salary=55000], Employee [name=Tim, age=55, salary=65000]]

	===================================================================================================================================================
	

 	Console 1):
				[Employee [name=James, age=20, salary=45000], Employee [name=David, age=35, salary=55000], Employee [name=Tim, age=55, salary=65000]]
				

	
	Console 2):
 				[Employee [name=James, age=20, salary=45000], Employee [name=David, age=35, salary=55000], Employee [name=Tim, age=55, salary=65000]]


 	Console 3):
				[Employee [name=Tim, age=55, salary=65000], Employee [name=David, age=35, salary=55000], Employee [name=James, age=20, salary=45000]]


	Console 4) - based on the expression of "SortedOrder.DESCENDING.getValue()":
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : -1
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : -1
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : -1
				(age - o.age) >= 0 ? true
				If sort = true or false, then 1 (ASCENDING) or -1 (DESCENDING) : -1
				[Employee [name=Tim, age=55, salary=65000], Employee [name=David, age=35, salary=55000], Employee [name=James, age=20, salary=45000]]
				

*/