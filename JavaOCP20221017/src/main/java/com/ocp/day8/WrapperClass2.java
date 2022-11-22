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
        // Calculate total scores by API - Arrays.stream()
    	// 使用 Java 1.2 之 API - Arrays.stream(int[] array)，來計算總分

        int totalScoreInPrimitiveType = Arrays.stream(scoresInPrimitiveType) // 回傳 IntStream type 
        									  // 使用 IntStream 內建 API - sum()，將 IntStream 中的元素加總
        					     			  .sum(); 
        System.out.println(totalScoreInPrimitiveType);
        
        // WrapperClass of Integer (Integer 包覆類別) 
        // Initialize the element of 1-D array
        // 一維陣列元素初始化
        Integer[] scoresInWrapperClass = {100, 90, 80};
        
        
        // There are three differently syntax as following to calculate the totalScore
        // 底下 3 種撰寫方式 - totalScore01、totalScore02 和 totalScore03
        int totalScore01 = Arrays.stream(scoresInWrapperClass)
        						 // 使用內建 API - Stream.mapToInt
                         		 .mapToInt((Integer n) -> n.intValue())        				 
                         		 // 使用 IntStream 內建 API - sum()，將 IntStream 中的元素加總
                                 .sum();
                

        int totalScore02 = Arrays.stream(scoresInWrapperClass)
        						 // 使用內建 API - Stream.mapToInt
        						 .mapToInt(n -> n.intValue())
        						 // 使用 IntStream 內建 API - sum()，將 IntStream 中的元素加總
        						 .sum();
        						 
        int totalScore03 = Arrays.stream(scoresInWrapperClass)    
        						 // 使用內建 API - Stream.mapToInt
        						 .mapToInt(Integer::intValue)				 
        						 // 使用 IntStream 內建 API - sum()，將 IntStream 中的元素加總
        						 .sum();

        int totalScoreAutoUnboxing = Arrays.stream(scoresInWrapperClass) 
        								   // 使用內建 API - Stream.mapToInt
								           .mapToInt(n -> n) // auto-unboxing from Integer to int (自動向下轉型為 int)			 
								           // 使用 IntStream 內建 API - sum()，將 IntStream 中的元素加總
								           .sum();

		System.out.println(totalScore01);
		System.out.println(totalScore02);
		System.out.println(totalScore03);
		System.out.println(totalScoreAutoUnboxing);
		
    }
}

/*
	Console:
			270
			270
			270
			270
			270
*/