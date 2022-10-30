package com.ocp.day4;
import java.util.Arrays;
public class MultiArrayDemo3 {
	public static void main(String[] args) {
		// 三人的[身高, 體重]如下:
		double[][] arrayOfHeightAndWeight = {
												{160, 50.5}, 
												{170, 70}, 
												{180, 80.4}
											};
		// please calcuation of bmi of each person
		for(double[] array : arrayOfHeightAndWeight) {
			String array2String = Arrays.toString(array);
			System.out.println("array2String: " + array2String);
			double bmi = (double) array[1] / Math.pow(array[0]/100, 2);
			System.out.printf("BMI 計算結果: %.2f\n", bmi);			
		}
	}
}