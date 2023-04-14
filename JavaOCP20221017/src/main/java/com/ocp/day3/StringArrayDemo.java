package com.ocp.day3;
/*
		This program will tell you, 
		1) how to use "String[] java.lang.String.split(String regex)" for collecting the each name into String[]
		2) how to use "Arrays.toString(name_of_stringArray)"
		3) calculation of arrayLength, p.s., name_of_array.length
		4) calculation of stringLength, p.s., name_of_string.length() 
*/
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

/*
	Console: 
	valueOfarrays: [[1, 2, 3], [11, 22, 33]]
	********** arrays[i][k] **********
	arrays[0][0]: 1 arrays[1][0]: 11 arrays[0][1]: 2 arrays[1][1]: 22 arrays[0][2]: 3 arrays[1][2]: 33 
	********** arraysT[i][k] **********
	arraysT[0][0]: 1 arraysT[0][1]: 11 arraysT[1][0]: 2 arraysT[1][1]: 22 arraysT[2][0]: 3 arraysT[2][1]: 33 
	[1]valueOfarraysT: [[1, 11], [2, 22], [3, 33]]
	[2]valueOfarraysT: [[1, 11], [2, 22], [3, 33]]
	[3]valueOfarraysT: [[1, 2, 3], [11, 22, 33]]


*/