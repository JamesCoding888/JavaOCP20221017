package com.ocp.day5;
// 3rd pattern of Object-Oriented 
public class OO3 {
    public static void main(String[] args) {
    	// Create Object from Constructors and also initialize the global variables
        Student s1 = new Student("John", 90);
        Student s2 = new Student("Mary", 80);
        Student s3 = new Student("Helen", 95);
        
        // Print out the each value of object
        System.out.println(s1.name + " " + s1.score);
        System.out.println(s2.name + " " + s2.score);
        System.out.println(s3.name + " " + s3.score);
    }
}


/*
	Console:
			John 90
			Mary 80
			Helen 95

*/