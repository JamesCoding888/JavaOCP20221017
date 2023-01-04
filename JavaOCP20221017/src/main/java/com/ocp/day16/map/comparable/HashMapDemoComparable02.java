package com.ocp.day16.map.comparable;

import java.util.ArrayList;

/* 
	Introduction of this lecture:
		
		1) To recap the previously lecture at package: com.ocp.day15.comparable, 
		   you will learn how to use "Set<Map.Entry<K, V>> entrySet()" to obtain object(s) from Map
		
		2) To review the Java 1.8 - Stream API of "mapToInt", at day3, day4 and day5
		
		3) There are different optimized syntaxes at (2) and (3) as following annotations
	
*/


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public class HashMapDemoComparable02 {
	public static void main(String[] args) {
		// Instantiate objects of Exam
		Exam exam01 = new Exam("Mathematics", 98);
		Exam exam02 = new Exam("Microwave Engineering", 88);
		Exam exam03 = new Exam("RFIC Design", 59);
		Exam exam04 = new Exam("Java-1z0-819", 87);

		// Instantiate objects of Student
		Student student01 = new Student(1, "Betty");
		Student student02 = new Student(2, "James");
		Student student03 = new Student(3, "David");
		Student student04 = new Student(4, "Elon");
		
		// Instantiate an object of HashMap to collect the objects of Key (i.e., Student) and Value (i.e., Exam)
		Map<Student, Exam> hashMap = new HashMap<>();
		hashMap.put(student01, exam01);
		hashMap.put(student02, exam02);
		hashMap.put(student03, exam03);
		hashMap.put(student04, exam04);
		
		System.out.println(hashMap);
		
		System.out.println("******************** Practice 1 ********************");
		// Collect the objects of Exam which "score >= 60" into object of arrayListForQualifiedExam01
		List<Exam> arrayListForQualifiedExam01 = new ArrayList<>();
		for(Entry<Student, Exam> entry : hashMap.entrySet()) {
			System.out.printf("(1) [Key : Value] = [%s : %s] \n", entry.getKey(), entry.getValue());
			if(entry.getValue().getScore() >= 60) {
				System.out.printf("(2) [Key : Value] = [%s : %s] \n", entry.getKey(), entry.getValue());
				arrayListForQualifiedExam01.add(entry.getValue());
			}
		}
		System.out.println("arrayListForQualifiedExam01: " + arrayListForQualifiedExam01);
	
		System.out.println("******************** Practice 2 ********************");
		// Collect the objects of Exam which "score >= 60" into object of arrayListForQualifiedExam02		
		Set<Entry<Student, Exam>> set01 = hashMap.entrySet();
		List<Student> arrayListForQualifiedExam02 = 		
				set01.stream()
				     .filter((Map.Entry<Student, Exam> entry) -> entry.getValue().getScore() >= 60)
				     .map(Entry::getKey)
				     .collect(Collectors.toList());
		System.out.println("arrayListForQualifiedExam02: " + arrayListForQualifiedExam02);
		
		System.out.println("******************** Practice 3 ********************");		
		// Collect the objects of Exam which "score >= 60" into object of arrayListForQualifiedExam03
	    List<Exam> arrayListForQualifiedExam03 = 
	    		hashMap.entrySet()
			           .stream()
				       .filter(entry -> entry.getValue().getScore() >= 60)		 
				       .map(Entry::getValue)
					   .collect(Collectors.toList());
	    System.out.println("arrayListForQualifiedExam03: " + arrayListForQualifiedExam03);
	}
}

/*
	Console:
			{Student [id=3, name=David]=Exam [subject=RFIC Design, score=59], Student [id=2, name=James]=Exam [subject=Microwave Engineering, score=88], Student [id=1, name=Betty]=Exam [subject=Mathematics, score=98], Student [id=4, name=Elon]=Exam [subject=Java-1z0-819, score=87]}
			******************** Practice 1 ********************
			(1) [Key : Value] = [Student [id=3, name=David] : Exam [subject=RFIC Design, score=59]] 
			(1) [Key : Value] = [Student [id=2, name=James] : Exam [subject=Microwave Engineering, score=88]] 
			(2) [Key : Value] = [Student [id=2, name=James] : Exam [subject=Microwave Engineering, score=88]] 
			(1) [Key : Value] = [Student [id=1, name=Betty] : Exam [subject=Mathematics, score=98]] 
			(2) [Key : Value] = [Student [id=1, name=Betty] : Exam [subject=Mathematics, score=98]] 
			(1) [Key : Value] = [Student [id=4, name=Elon] : Exam [subject=Java-1z0-819, score=87]] 
			(2) [Key : Value] = [Student [id=4, name=Elon] : Exam [subject=Java-1z0-819, score=87]] 
			arrayListForQualifiedExam01: [Exam [subject=Microwave Engineering, score=88], Exam [subject=Mathematics, score=98], Exam [subject=Java-1z0-819, score=87]]
			******************** Practice 2 ********************
			arrayListForQualifiedExam02: [Student [id=2, name=James], Student [id=1, name=Betty], Student [id=4, name=Elon]]
			******************** Practice 3 ********************
			arrayListForQualifiedExam03: [Exam [subject=Microwave Engineering, score=88], Exam [subject=Mathematics, score=98], Exam [subject=Java-1z0-819, score=87]]


*/