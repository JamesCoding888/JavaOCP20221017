package com.ocp.day1;

public class bmiValue {
	public static void main(String[] args) {
		double h1 = 170;
		double w1 = 60;
		double bmi = w1 / Math.pow(h1/100, 2);
		System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", w1, h1, bmi);
		
		BMIUtil.calcAndPrintBMI(170, 60);
		
	}
	

}
