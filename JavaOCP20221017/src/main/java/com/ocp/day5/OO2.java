package com.ocp.day5;
// 2nd pattern of Object-Oriented 
public class OO2 {
    public static void main(String[] args) {
    	// Create Object from Constructors
        Student s1 = new Student();        
        Student s2 = new Student();
        Student s3 = new Student();
        
        // Initialize the global variables by each Object
        s1.name = "John";
        s1.score = 90;
        s2.name = "Mary";
        s2.score = 80;
        s3.name = "Helen";
        s3.score = 95;
        
		// Print out the each value of object
        System.out.println(s1.name + " " + s1.score);
        System.out.println(s2.name + " " + s2.score);
        System.out.println(s3.name + " " + s3.score);
    }
}


/*
	Console:
			建立 Student 物件
			建立 Student 物件
			建立 Student 物件
			John 90
			Mary 80
			Helen 95


*/
