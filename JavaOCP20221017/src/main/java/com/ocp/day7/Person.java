package com.ocp.day7;
/*
		This is a Java class called "Person" that defines a superclass. The superclass has two private instance variables called "name" and "age". 
		
		The instance variables can only be accessed within the same class due to their accessibility in "private".
		
		It should be noted that this code was written before Java 1.5 and therefore does not support auto-boxing and the "@Override" annotation.
		
		Java 1.5 之前版本，不支援 
		1) auto-boxing
		2) Annotation of "@Override"
*/

// Super Class (父類別) of Student.class and Teacher.class
public class Person {
	// These Global Variables only could be Visible in SAME Class, due to accessibility in "Private"
	// 全域變數，只可在此 Person class 中，被調用，因為權限是 Private
    private String name;
    private int age; // int -> Integer , Suggested to be a type of Boxing  
    

    
    // ********************************** Encapsulation of getter and setter's method **********************************// 

    
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
    

    // Customization method
    // 自訂方法
    public void job() {
        System.out.println("工作");
    }
    
}