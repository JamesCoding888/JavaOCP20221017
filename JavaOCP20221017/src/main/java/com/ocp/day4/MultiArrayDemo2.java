package com.ocp.day4;
/*
		This program creates method of print and getSum util 
		
		此程式建立 print 和 getSum 的工具，當需要用這些工具 (也就是 method)，將可直接調用 
*/
public class MultiArrayDemo2 {
	public static void main(String[] args) {
		int[][] arrayByInt = {{0, 1}, {2, 3}, {4, 5}};
		print(arrayByInt);
		System.out.println("Sum of arrayByIntInValue: " + getSum(arrayByInt));
	}
	
	// print out of value
	private static void print(int[][] arrays) {
		for(int[] array : arrays) {
			for(int value : array) {
				System.out.println(value);
			}
		}
	}
	
	// Calculator: sum of two-array value(s) 
	private static int getSum(int[][] arrays) {
		int sum = 0;
		for(int[] array : arrays) {
			for(int value : array) {
				sum += value;
			}
		}
		return sum;
	}
}

/*
	Console:
			0
			1
			2
			3
			4
			5
			Sum of arrayByIntInValue: 15

*/
