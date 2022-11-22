package com.ocp.day8;
// This lesson we introduce the Wrapper Class and Application of Java 1.8 - Stream API
// 本節介紹 "包覆類別" 及 Java 1.8 - Stream API 之應用

import java.util.Arrays;
public class WrapperClass2 {
    public static void main(String[] args) {
        // Primitive type - int (基本型別 int)
    	// Initialize the element of 1-D array 
    	// 一維陣列元素初始化
    	int[] scoresInPrimitiveType = {100, 90, 80};
        // Calculate total scores by Arrays.stream()
    	// 使用 Arrays.stream() 計算總分
        int totalScore01 = Arrays.stream(scoresInPrimitiveType) // IntStream
                        .sum();
        System.out.println(totalScore01);
    	// 一維陣列元素初始化
        Integer[] scoresInWrapperClass = {80, 70, 60};
        // 利用 Arrays.stream() 計算 sum()
        int totalScore02 = Arrays.stream(scoresInWrapperClass)
                         //.mapToInt(n -> n.intValue())
                         //.mapToInt(Integer::intValue)
                         .mapToInt(n -> n) // auto-unboxing
                         .sum();
        System.out.println(totalScore02);
        // boxed() 可以將 int 轉 Integer
    }
}

/*
	Console:
			270
			210
*/