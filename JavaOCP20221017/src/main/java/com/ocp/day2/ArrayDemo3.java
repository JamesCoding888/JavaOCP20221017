package com.ocp.day2;
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 計算個數、總和、平均、最大值、最小值
		int[] scores = {100, 92, 85, 73, 68};	
		System.out.printf("個數: %d\n", scores.length);
		System.out.printf("總和: %d\n", getSum(scores));
		System.out.printf("平均: %.1f\n", getAvg(scores));
		System.out.printf("最大值: %d\n", getMax(scores));
		System.out.printf("最小值: %d\n", getMin(scores));
	}
	
	// 設計一個可以針對一維陣列計算總和方法
	public static int getSum(int[] array) {
		int sum = 0;
		for(int values : array) {
			sum += values;
		}	
		return sum;
	}
	
	// 設計一個可以針對一維陣列計算平均方法
	public static double getAvg(int[] array) {
		int sum = getSum(array);	
		double avg = (double)sum / array.length; // 記得要轉型
		return avg;
	}

	// 設計一個可以針對一維陣列計算最大值方法
	public static int getMax(int[] array) {
		// default max value
		int max = 0;
		for(int values : array) {
			if(values > max) {
				max = values;
			}
		}
		return max;
	}
	
	// 設計一個可以針對一維陣列計算最小值方法
	public static int getMin(int[] array) {
		// default min value
		int min = array[0];
		for(int values : array) {
			if(values < min) {
				min = values;
			}
		}
		return min;
	}
}
/*
	Console:
		個數: 5
		總和: 418
		平均: 83.6
		最大值: 100
		最小值: 68
*/
