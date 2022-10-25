package com.ocp.day3;
import java.util.Arrays;

public class StringArrayDemo {
	public static void main(String[] args) {
		String stringOfName = "Jose, Mary, Jerry, David, Jack";
		System.out.println("stringOfName: " + stringOfName);
		// 利用 split() 來切分字串後，並轉成 String[] 管理
		String[] namesInArray = stringOfName.split(", ");
		System.out.println("namesInArray: " + Arrays.toString(namesInArray));
		System.out.println("Length of stringOfName: " + stringOfName.length()); 
		System.out.println("Length of namesInArray: " + namesInArray.length);
		
		// 計算平均名字有幾個字 (取到小數點一位)
		int total = 0;
		for(String name : namesInArray) {
			total += name.length();	
			// peek of each length  
			System.out.printf("length of iteration: %d\n", total);
		}
		
		System.out.printf("Total length of name: %d\n", total);
		double avg = (double)total / namesInArray.length;
		System.out.printf("avg = %.1f\n", avg);
	}	
}
