package com.ocp.day5;

public class OO4 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 90);
        Student s2 = new Student("Mary", 80);
        Student s3 = new Student("Helen", 95);
        
        s1.printStudentData();
        s2.printStudentData();
        s3.printStudentData();
        
    }
}


/*
	Console:
			John 90
			Mary 80
			Helen 95

*/