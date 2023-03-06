package com.ocp.day5;
// 8th pattern of Object-Oriented
import java.util.Arrays;
public class OO8 {
    public static void main(String[] args) {
    	
    	// Create 1-D array of Student with Dynamic Memory
    	// 建立一個一維陣列的 Student 物件，且此陣列的記憶體位置
    	// 與 OO5.java 的範例不同的是，可動態增加
        Student[] student1 = {
            new Student("John", 80),
            new Student("Mary", 40)
        };
        Student[] student2 = {
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };

        // studentsIn2DArray: students in two dimension Array
        Student[][] studentsIn2DArray = {student1, student2}; 
        System.out.println("studentsIn2DArray: " + studentsIn2DArray);

        // Java 1.8 Stream API - To calculate the average score of all students 
        // 使用 Java 1.8 Stream API 將全班分數大於等於 60 分之和，做平均在印出
        double averageScore1 = Arrays.stream(studentsIn2DArray)
        		.flatMap(studentsIn1DArray -> Arrays.stream(studentsIn1DArray))         // studentsIn2DArray -> studentsIn1DArray
        		.mapToInt(objectOfstudentsIn1DArray -> objectOfstudentsIn1DArray.score) // IntStream
        		.filter(scores -> scores >= 60)
        		.peek(System.out::println)
        		.average()
        		.getAsDouble();
        System.out.println("averageScore: " + averageScore1); 
        
        // Let's review the sample code of MultiArrayDemo7.java from day4 as following
        // As you can see "Arrays.stream(studentsIn1DArray).asDoubleStream()" 
        // could transfer the 2-D array of scoresIn2DArray to DoubleStream
        // because the return type from "Arrays.stream(studentsIn1DArray)" is IntStream
        
        // 回顧一下，day4 的 MultiArrayDemo7.java 程式範例如下
        // Arrays.stream(studentsIn1DArray).asDoubleStream() 可直接轉 DoubleStream 
        // 係因 Arrays.streams(studentsIn1DArray) 為 IntStream
        // 才能呼叫其 IntStream 內建的 API
    	int[][] scoresIn2DArray = { { 80, 40 }, { 90, 70, 50 } };
        double averageScore2 = Arrays.stream(scoresIn2DArray)
        		.flatMapToDouble(studentsIn1DArray -> Arrays.stream(studentsIn1DArray).asDoubleStream())
        		.filter(scores -> scores >= 60)
        		.peek(DoubleStream_of_1D_Array  -> System.out.printf("%.2f\n", DoubleStream_of_1D_Array))
				.average()				   						  
				.getAsDouble();
        System.out.println("averageScore: " + averageScore2); 
    }
}

/*
	Console:
			studentsIn2DArray: [[Lcom.ocp.day5.Student;@1b701da1
			80
			90
			70
			averageScore: 80.0
			80.00
			90.00
			70.00
			averageScore: 80.0



*/