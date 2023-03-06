package com.ocp.day1;

public class CalcBMI {
	public static void main(String[] args) {
		double h1 = 170;
		double w1 = 60;
		double bmi = w1 / Math.pow(h1/100, 2);
		System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", w1, h1, bmi);
		
		BMIUtil.calcAndPrintBMI(170, 60);
		
	}
	
    public static void calcAndPrintBMI(double height, double weight) {
        double bmiValue = weight / Math.pow(height/100, 2);
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", height, weight, bmiValue);
    } 

}

/*
	Console:
		身高: 60.0 體重: 170.0 BMI: 20.76
		身高: 60.0 體重: 170.0 BMI: 20.76

*/
