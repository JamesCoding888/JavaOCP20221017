package com.ocp.day1;

public class BMIUtil {
	public static void calcAndPrintBMI(double height, double weight) {
		double bmiValue = weight/Math.pow(height/100, 2);
		System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", weight, height, bmiValue);
	}
	
	
}
