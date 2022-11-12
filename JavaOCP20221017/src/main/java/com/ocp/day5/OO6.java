package com.ocp.day5;

import java.util.Arrays;

public class OO6 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("John", 80),
            new Student("Mary", 40),
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };
        System.out.println(students);
        // for-loop
        for(int i=0, len=students.length ; i<len ; i++) {
            students[i].printStudentData();
        }
        // for-each
        for(Student student : students) {
            student.printStudentData();
        }
        // Java Stream
        Arrays.stream(students)
                .forEach(student -> student.printStudentData());
        // Java Stream + :: (方法參考)
        Arrays.stream(students)
                .forEach(Student::printStudentData);
        
    }
}


/*
 	Console:
		[Lcom.ocp.day5.Student;@1b701da1
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50

*/
