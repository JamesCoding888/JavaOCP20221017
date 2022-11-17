package com.ocp.day7;
/*
 * Java 1.5 之前版本，不支援 
 * 1) auto-boxing
 * 2) Annotation of "@Override"
 */

// Super Class (父類別)
public class Person {
	// These Global Variables only could be Visible in SAME Class, due to accessibility in "Private"
	// 全域變數，只能被此 Person class 中，被調用，因為權限是 Private
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