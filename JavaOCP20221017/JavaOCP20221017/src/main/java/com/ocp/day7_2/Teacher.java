package com.ocp.day7_2;
/*
 * Java 1.5 之前版本，不支援 
 * 1) auto-boxing and unboxing
 * 2) Annotation of "@Override"
 */


// Child Class (子類別)
// Inheritance of Parent Class: Person
public class Teacher extends Person {
	
	private int salary;  // int -> Integer , Suggested to be a type of Boxing

    // Constructors with arguments - name and salary
	// 有參數建構子
	public Teacher(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}

	// Encapsulation of getter method
	public int getSalary() {
		return salary;
	}

    // Encapsulation of setter method
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Super implementation for "public String toString() { ... }" of Person.class, since Teacher.class inherits to Person.class
	// 覆寫父類別的 "public String toString() { ... }"，因 Teacher.class 繼承 Person.class
	@Override
	public String toString() {
		return "Teacher{" + "salary = " + salary + '}' + super.toString();  // super.toString(): 呼叫父類別的 toString()
	}
}
