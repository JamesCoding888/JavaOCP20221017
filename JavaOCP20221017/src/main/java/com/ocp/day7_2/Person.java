package com.ocp.day7_2;
/*
		This is a superclass called "Person" that both the "Student" and "Teacher" classes inherit from. It contains private instance variables for the name and age of a person, as well as public getter and setter methods for these variables.
		
		The constructor of the Person class takes two arguments, a String name and an integer age, and initializes the corresponding instance variables.
		
		The Person class also overrides the default toString() method inherited from the Object class with a custom implementation that returns a string representation of the Person object.
		
		This class also notes that features like auto-boxing and unboxing, as well as the "@Override" annotation, are not supported in versions of Java prior to version 1.5.
		
		Java 1.5 之前版本，不支援 
		1) auto-boxing and unboxing
		2) Annotation of "@Override"
*/


// Super Class (父類別) of Student.class and Teacher.class
public class Person {
	// These Global Variables only could be Visible in SAME Class, due to accessibility in "Private"
	// 全域變數，只可在此 Person class 中，被調用，因為權限是 Private
    private String name;
    private int age;    // int -> Integer , Suggested to be a type of Boxing
    

    // Constructors with arguments - name and age
    // 有參數建構子 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Encapsulation of getter method
    public String getName() {
        return name;
    }

    // Encapsulation of setter method
    public void setName(String name) {
        this.name = name;
    }
    
    // Encapsulation of getter method
    public int getAge() {
        return age;
    }

    // Encapsulation of setter method
    public void setAge(int age) {
        this.age = age;
    }

    /*    
    Override the method of "public String toString() { ... } from Object.class
    with Customization method of public String toString() { ... } from Person.class
    
    Person.class 中，使用客製化的 Public String toString() { ... } 去覆寫 Object.class 中的 "public String toString() { ... }。
    因建立任一的 Class，系統會自動產生無參數建構子，
    其建構子中之默認函數 "super()" 會調用父類別的 public Object() { }，
    意思就是說，任意的 Class 都繼承 Object.class     
    */
    @Override
    public String toString() {
        return "Person{" + "name = " + name + ", age = " + age + '}';
    }
    
}
