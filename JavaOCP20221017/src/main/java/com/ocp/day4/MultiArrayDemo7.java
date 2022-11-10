package com.ocp.day4;
import java.util.Arrays;
public class MultiArrayDemo7 {
	public static void main(String[] args) {
		// B 班有 3 個學生[國文, 數學, 英文]的成績如下
		int[][] scores = { { 100, 90, 60 }, { 85, 70, 38 }, { 95, 40, 29 } };
		// 所有成績的加總 = ?
		// 利用 Java stream 來進行分析
		// 1) 總分
		double sum = Arrays.stream(scores)
						   .flatMapToDouble(array -> Arrays.stream(array).asDoubleStream())
						   .sum();
		System.out.printf("總分: %.3f\n", sum);
		// 2) 個人平均分數
		Arrays.stream(scores)
			  .flatMapToDouble(array -> Arrays.stream(array).average().stream())
			  .forEach(personnalAvgScore -> System.out.printf("個人平均分數: %.3f\n", personnalAvgScore));
		// 3) 總平均分數
		// 先將 2-D array 轉 1-D array，請使用 flatMapToDouble
		// 再將個人平均分數印出，請使用 peek
		System.out.print("{");
		double avgOfTotalScoreByflatMapToDouble = 
							     Arrays.stream(scores)								
				   					   .flatMapToDouble(array -> Arrays.stream(array).asDoubleStream())				   						  
				   					   .peek(DoubleStream_of_1D_Array  -> System.out.printf(" %.3f ", DoubleStream_of_1D_Array))
				   					   .average()				   						   
				   					   .getAsDouble();
		System.out.print("}\n");
		System.out.println("Avg_Total_Score: " + avgOfTotalScoreByflatMapToDouble);
		
		// 4) 總平均分數
		// 先將 2-D array 轉 1-D array，請使用 mapToDouble
		// 再將個人平均分數印出，請使用 peek
		System.out.print("{");
		double avgOfTotalScoreBymapToDouble = Arrays.stream(scores)								
				   					   .mapToDouble(array -> Arrays.stream(array).average().getAsDouble())		   						  
				   					   .peek(DoubleStream_of_1D_Array  -> System.out.printf(" %.3f ", DoubleStream_of_1D_Array))
				   					   .average()				   						   
				   					   .getAsDouble();
		System.out.print("}\n");
		System.out.println("Avg_Total_Score: " + avgOfTotalScoreBymapToDouble);
	}
}