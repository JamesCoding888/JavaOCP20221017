package com.ocp.day4;
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
	
