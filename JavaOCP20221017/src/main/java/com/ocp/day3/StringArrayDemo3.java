package com.ocp.day3;
/*
		This program will give a lecture on how to use "Integer.parseInt" （which is meaning by "Parses the string argument as a signed decimal 
		integer"）to catch the score of students that are over or equal to 60, and turn into calculating their average score.
		
		此程式說明如何運用 "Integer.parseInt" (此 API 將 String 的引數轉成十進制的值)，來去抓取學生分數係大於或等於 60 分的人數，並將這些及格分數另外做總及格平均分
		數的計算 
*/
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


