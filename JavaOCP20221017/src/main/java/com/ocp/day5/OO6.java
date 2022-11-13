package com.ocp.day5;
import java.util.Arrays;
public class OO6 {
    public static void main(String[] args) {
    	// Create 1-D array of Student with Dynamic Memory
    	// 建立一個一維陣列的 Student 物件，且此陣列的記憶體位置
    	// 與 OO5.java 的範例不同的是，可動態增加
        Student[] students = {
            new Student("John", 80),
            new Student("Mary", 40),
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };
        // Print out the memory of 1-D array of students Object
        System.out.println(students);
        
        // Print out the each value of 1-D array of Student by for-loop
        System.out.println("Print out the each value of 1-D array of Student by for-loop");
        for(int i=0, len=students.length ; i<len ; i++) {
            students[i].printStudentData();
        }
        // Print out the each value of 1-D array of Student by for-each
        System.out.println("Print out the each value of 1-D array of Student by for-each");
        for(Student student : students) {
            student.printStudentData();
        }
        
        // Java 1.8 - Stream API, for print out the each value of 1-D array of Student by forEach
        System.out.println("1st-way, for print out the each value of 1-D array of Student by Stream APi");
        Arrays.stream(students)
                .forEach(student -> student.printStudentData());

        // Java 1.8 - Stream API 之 "::" ("::": 方法參考，在此符號，可想成是一個物件將調用 printStudentData 之方法)
        // 2nd way
        System.out.println("2nd-way, for print out the each value of 1-D array of Student by Stream API");
        Arrays.stream(students)
                .forEach(Student::printStudentData);
        
    }
}


/*
 	Console:
		[Lcom.ocp.day5.Student;@1b701da1
		Print out the each value of 1-D array of Student by for-loop
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50
		Print out the each value of 1-D array of Student by for-each
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50
		1st-way, for print out the each value of 1-D array of Student by Stream APi
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50
		2nd-way, for print out the each value of 1-D array of Student by Stream API
		John 80
		Mary 40
		Bobo 90
		Jack 70
		Kita 50


*/
