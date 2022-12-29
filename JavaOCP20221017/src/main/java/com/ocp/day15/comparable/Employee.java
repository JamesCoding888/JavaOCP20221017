package com.ocp.day15.comparable;

import java.util.Objects;
public class Employee implements Comparable<Employee> {
	
	private String name;
	private Integer age;
	private Integer salary;

	/*
		The value of the "sort" variable could be used to determine the behavior of a class or its methods. 
		For example, it might be used to determine the order in which a list of items is sorted. 
		If "sort" is true, the items might be sorted in ASCENDING order, and if "sort" is false, 
		they might be sorted in DESCENDING order.
		
		Hereinafter, sample code determined the behavior of sort to be "true", 
		because query the rows from Table of Schema as ascending order
	*/
	private static boolean sort = true; 
	
	public Employee(){
		super();
	}
	
	public Employee(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	
	
	/*
	     // Compares this object with the specified object for order.  Returns a
	     // negative integer, zero, or a positive integer as this object is less
	     // than, equal to, or greater than the specified object.
	     
	     // <p>The implementor must ensure
	     // {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
	     // for all {@code x} and {@code y}.  (This
	     // implies that {@code x.compareTo(y)} must throw an exception iff
	     // {@code y.compareTo(x)} throws an exception.)
	     //
	     // <p>The implementor must also ensure that the relation is transitive:
	     // {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
	     // {@code x.compareTo(z) > 0}.
	     
	     // <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
	     // implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
	     // all {@code z}.
	     
	     // <p>It is strongly recommended, but <i>not</i> strictly required that
	     // {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
	     // class that implements the {@code Comparable} interface and violates
	     // this condition should clearly indicate this fact.  The recommended
	     // language is "Note: this class has a natural ordering that is
	     // inconsistent with equals."
	     
	     // <p>In the foregoing description, the notation
	     // {@code sgn(}<i>expression</i>{@code )} designates the mathematical
	     // <i>signum</i> function, which is defined to return one of {@code -1},
	     // {@code 0}, or {@code 1} according to whether the value of
	     // <i>expression</i> is negative, zero, or positive, respectively.
	     
	     // @param   o the object to be compared.
	     // @return  a negative integer, zero, or a positive integer as this object
	     //          is less than, equal to, or greater than the specified object.
	     
	     //	***************************** Notice Here *****************************
	     // @throws NullPointerException if the specified object is null
	     // @throws ClassCastException if the specified object's type prevents it
	     //         from being compared to this object.
	     //	***************************** Notice Here *****************************
	        
	        public int compareTo(T o);
       
    */
    
	@Override
	public int compareTo(Employee o) {
		/*
			// 1) ASCENDING
			//    The expression (age - o.age) calculates the difference between two ages, 
			//    where "age" is the age of one person and "o.age" is the age of another person.
		          
		          return age - o.age;
		*/ 
 
		
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

		
//		/*
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
//		*/		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
