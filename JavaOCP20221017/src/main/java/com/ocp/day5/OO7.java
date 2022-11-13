package com.ocp.day5;
import java.util.Arrays;

public class OO7 {
    public static void main(String[] args) {
    	// Create 1-D array of Student with Dynamic Memory
    	// 建立一個一維陣列的 Student 物件，且此陣列的記憶體位置
    	// 與 OO5.java 的範例不同的是，可動態增加
        Student[] students = {
            new Student("John", 88),
            new Student("Mary", 47),
            new Student("Bobo", 92),
            new Student("Jack", 71),
            new Student("Kita", 53),
        };
        // Java 1.8 Stream API - To calculate the average score of all students by mapToDouble
        // 使用 Java 1.8 Stream API 將全班分數大於等於 60 分之和，做平均在印出
        double averageScore1 = Arrays.stream(students)
        						    .mapToDouble(student -> student.score)
        						    .filter(score -> score >= 60)
        						    .peek(printByPeek -> System.out.printf("%.2f\n", printByPeek))
        						    .average()
        						    .getAsDouble();
        System.out.println("averageScore: " + averageScore1);
        
        // Java 1.8 Stream API - To calculate the average score of all students by mapToInt 
        double averageScore2 =  Arrays.stream(students)
                            .mapToInt(stud -> stud.score) 
                            .filter(score -> score >= 60)
                            .peek(printByPeek -> System.out.printf("%d\n", printByPeek))
                            .average()
                            .getAsDouble();
        System.out.println("averageScore: " + averageScore2);
    }
}

/*
	Console:
			88.00
			92.00
			71.00
			averageScore: 83.66666666666667
			88
			92
			71
			averageScore: 83.66666666666667



*/