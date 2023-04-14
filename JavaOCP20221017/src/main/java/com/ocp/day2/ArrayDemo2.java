package com.ocp.day2;
/*
		1) This program goes to tell you how to use for-loop and for-Each to print out of value from Array object, and also giving a lecture on 
		   using length of Array object to print out the value of Array object.
		
		   介接如何使用 for-loop 和 for-each 的方式，將陣列中的值印出，另外方式是藉由抓取陣列的長度，將陣列的值印出
		
		2) Also, you will learn the Array API - Arrays.toString(name_of_ArrayObject), under "package java.util;".
		
		   將學到如何使用 Oracle 提供的 API - Arrays.toString(name_of_ArrayObject)，在 package java.util 中
		
		3) Also, you shall understand the modern Java 8 (Version: 1.8) that provides an API - 
		   Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + ", ")), under "package 
		   java.util;".
		
		   介紹 Java 1.8 提供的 API - Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + ", 
		   "))，在 Oracle 中的 package java.util，將陣列中的值印出 
*/
import java.util.Arrays; // 提供一些好用的陣列工具

public class ArrayDemo2 {
	public static void main(String[] args) {
		// 陣列自訂初始資料
		// int[] scores = new int[]{100, 92, 85, 73, 68}; // part 1
		int[] scores = { 100, 92, 85, 73, 68 }; // part 2
		// 直接印出 scores
		System.out.println(scores); // [I@762efe5d
									// [ 一維陣列, I 表示 int, @ 在, 762efe5d 就是物件的16進位雜湊值(hash code)
		// 1. 印出每一個元素內容使用 for-loop
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + ", ");
		}
		System.out.println(); // 換行符號
		// 2. 印出每一個元素內容使用 for-each(for/in)
		for (int score : scores) {
			System.out.print(score + ", ");
		}
		System.out.println(); // 換行符號
		// 3. 印出每一個元素內容使用 for-loop (加強版)
		for (int i = 0, len = scores.length; i < len; i++) {
			System.out.print(scores[i] + ", ");
		}
		System.out.println(); // 換行符號
		// 4. 印出每一個元素內容使用 Arrays 類別所提供的 toString() 方法
		System.out.println(Arrays.toString(scores));
		// 5. 印出每一個元素內容使用 Java 8 Stream 串流
		Arrays.stream(scores).forEach(score -> System.out.print(score + ", "));
		System.out.println(); // 換行符號
		Arrays.stream(scores).forEach(System.out::println);

	}
}
/*
	Console:
		[I@58d25a40
		 100, 92, 85, 73, 68, 
		 100, 92, 85, 73, 68, 
		 100, 92, 85, 73, 68, 
		 [100, 92, 85, 73, 68]
		 100, 92, 85, 73, 68, 
		 100
		 92
		 85
		 73
		 68
*/