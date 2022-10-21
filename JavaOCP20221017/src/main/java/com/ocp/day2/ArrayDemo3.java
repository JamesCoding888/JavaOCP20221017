package com.ocp.day2;
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 計算個數、總和、平均、最大值、最小值
		int[] scores = {100, 92, 85, 73, 68};	
		System.out.printf("個數: %d\n", scores.length);
		System.out.printf("總和: %d\n", getSum(scores));	
	}
	
	// 設計一個可以針對一維陣列計算總和方法
	public static int getSum(int[] array) {
		int sum=0;
		for(int values : array) {
			sum += values;
		}	
		return sum;
	}
}
