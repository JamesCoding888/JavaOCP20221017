package com.ocp.day16.map.comparable;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoComparable {

	public static void main(String[] args) {
		
		Exam exam01 = new Exam("Mathematics", 98);
		Exam exam02 = new Exam("Microwave Engineering", 88);
		Exam exam03 = new Exam("RFIC Design", 89);
		Exam exam04 = new Exam("Java-1z0-819", 87);
		
		Student student01 = new Student(1, "Betty");
		Student student02 = new Student(2, "James");
		Student student03 = new Student(3, "David");
		Student student04 = new Student(4, "Elon");
		
		Map<Student, Exam> hashMap = new HashMap<>();
		hashMap.put(student01, exam01);
		hashMap.put(student02, exam02);
		hashMap.put(student03, exam03);
		hashMap.put(student04, exam04);
		
		System.out.println(hashMap);
	}
}
