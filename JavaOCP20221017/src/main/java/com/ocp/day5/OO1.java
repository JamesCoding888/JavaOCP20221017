package com.ocp.day5;
// 1st pattern of Object-Oriented
public class OO1 {
	public static void main(String[] args) {
		// Local variables initiated
		String name = "James";
		int score = 100;
		
		String name2 = "David";
		int score2 = 90;
		
		String name3 = "Mary";
		int score3 = 80;	
		
		// Initialize the arguments of Constructors as following
		Student s1 = new Student(name, score);		
		Student s2 = new Student(name2, score2);		
		Student s3 = new Student(name3, score3);
		
		// Print out the each value of object
        System.out.println(s1.name + " " + s1.score);
        System.out.println(s2.name + " " + s2.score);
        System.out.println(s3.name + " " + s3.score);
    
	}	
}
