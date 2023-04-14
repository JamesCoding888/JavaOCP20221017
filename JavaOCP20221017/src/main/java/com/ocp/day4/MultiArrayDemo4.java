package com.ocp.day4;
/*
		Following the previously MultiArrayDemo3.java, we modify the order of initialized array, and re-design the for-loop algorithm to 
		generate the each group of BMI. Also, one API of Arrays.deepToString(name_of_array) for your reference
		
		依據先前的 MultiArrayDemo3.java 介紹，我們修改了初始化陣列的順序，並重新設計一個 for-loop 的演算法，將每組的 BMI 參數產出。另外此節介紹了一個內建 API - 
		Arrays.deepToString(name_of_array)，可直接將陣列的值抓出，並由 System.out.println(Arrays.deepToString(name_of_array)) 印出陣列的 value(s)。

		備註: name_of_array 係指陣列的變數名稱 
*/
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

