package com.ocp.day7_2;
/*
 * Java 1.5 之前版本，不支援 
 * 1) auto-boxing and unboxing
 * 2) Annotation of "@Override"
 */


// Child Class (子類別)
// Inheritance of Parent Class: Person
public class Student extends Person {

	private int score;  // int -> Integer , Suggested to be a type of Boxing


    // Constructors with arguments - name, age and score
	// 有參數建構子
	public Student(String name, int age, int score) {
		super(name, age);   // Invoke the Constructor of Parent class (i.e., Person.class)
		this.score = score; // Initialized the Global variable 
	}

    // Encapsulation of getter method
	public int getScore() {
		return score;
	}

    // Encapsulation of setter method
	public void setScore(int score) {
		this.score = score;
	}


	// Super implementation for "public String toString() { ... }" of Person.class, since Student.class inherits to Person.class
	// 改寫父類別的 "public String toString() { ... }"，因 Student.class 繼承 Person.class
	@Override
	public String toString() {
		return "Student{" + "score = " + score + '}' + super.toString(); // super.toString(): 呼叫父類別的 toString()
	}

}
