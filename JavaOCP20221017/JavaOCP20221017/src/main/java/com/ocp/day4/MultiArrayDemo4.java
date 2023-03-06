package com.ocp.day4;
import java.util.Arrays;
public class MultiArrayDemo4 {
	public static void main(String[] args) {
		// Please calculation of bmi for each person
		double[][] arrayOfHeightAndWeight = {
												{160, 170, 180}, // height
												{50.5, 70, 80.4} // weight
											};
		// API - deepToString 將 arrayOfHeightAndWeight 的 value(s) 印出
		System.out.println(Arrays.deepToString(arrayOfHeightAndWeight));
		
		
		// arrayOfHeightAndWeight 不為 Null
		// arrayOfHeightAndWeight.length 陣列長度為 2
		// arrayOfHeightAndWeight[0].length 在陣列 0 位址的長度，也就是 height 的長度
		// arrayOfHeightAndWeight[1].length 在陣列 1 位址，的長度，也就是 weight 的長度
		if(arrayOfHeightAndWeight != null && 
		   arrayOfHeightAndWeight.length == 2 &&
		   arrayOfHeightAndWeight[0].length == arrayOfHeightAndWeight[1].length) {
		   for(int i = 0 ; i < arrayOfHeightAndWeight[0].length ; i++) {
			   
			   double arrayOfHeight = arrayOfHeightAndWeight[0][i];
			   double arrayOfWeight = arrayOfHeightAndWeight[1][i];
			   double bmi = arrayOfWeight / (double)(Math.pow(arrayOfHeight/100, 2)) ;
			   System.out.printf("BMI[%d]: %s\n", i+1, bmi);
		   }		  
		}					
	}		
}

/*
 	Console: 
		    [[160.0, 170.0, 180.0], [50.5, 70.0, 80.4]]
			BMI[1]: 19.726562499999996
			BMI[2]: 24.221453287197235
			BMI[3]: 24.814814814814817
 */

