package com.ocp.day3;

public class StringArrayDemo3 {
	public static void main(String[] args) {
		String stringNumber = "100, 90, 80, 71, 59, 60, 45, 30, 0, 12, 18, 66";
		// 請計算及格人數的平均分數
		// 字串轉數字
		// int x = Integer.parseInt("100"); 
		
		String[] scores = stringNumber.split(", ");
		// Java 1.7
		int sum = 0; // 將及格分數加總
		int count = 0; // 將及格的人數加總
		for(String score : scores) {
			int x = Integer.parseInt(score);
			if(x >= 60) {
				sum += x;
				count++;
			}
		}
		double avgPassScore = (double)sum / count;
		System.out.printf("及格人數的平均分數: %.2f\n", avgPassScore);
		
	}	
}

/*
 * Console:
 * 及格人數的平均分數: 77.83
 */


