package com.ocp.day4;
import java.util.Arrays;
public class MultiArrayDemo4 {
	public static void main(String[] args) {
		// Please calculation of bmi for each person
		double[][] arrayOfHeightAndWeight = {
												{160, 170, 180}, // height
												{50.5, 70, 80.4} // weight
											};
		// API - deepToString 
		System.out.println(Arrays.deepToString(arrayOfHeightAndWeight));
		if(arrayOfHeightAndWeight != null && 
		   arrayOfHeightAndWeight.length == 2 &&
		   arrayOfHeightAndWeight[0].length == arrayOfHeightAndWeight[1].length) {
			for(int i=0; i < arrayOfHeightAndWeight[0].length; i++) {
					double valueOfHeight = arrayOfHeightAndWeight[0][i];
					double valueOfWeight = arrayOfHeightAndWeight[1][i];
					double bmi = (double) valueOfWeight / Math.pow(valueOfHeight/100, 2);
					System.out.printf("BMI 計算結果: %.2f\n", bmi);	
			}	
		}	
	}		
}
/*
 * ======================================================================
 * 作業
 * for(double[] array : arrayOfHeightAndWeight) { for(double value : array) {
 * 
 * double[] arrayOfHeight = arrayOfHeightAndWeight[0]; double[] arrayOfWeight =
 * arrayOfHeightAndWeight[1];
 * 
 * double bmi = (double) array[0] / Math.pow(array[1]/100, 2);
 * System.out.printf("BMI 計算結果: %.2f\n", bmi); }
 * 
 * }
 */
