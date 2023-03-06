package com.ocp.day4;
public class MultiArrayDemo1 {
	public static void main(String[] args) {
		int[][] arrayByInt = new int[3][2];		
		arrayByInt[0][0] = 1;
		arrayByInt[0][1] = 2;
		arrayByInt[1][0] = 3;
		arrayByInt[1][1] = 4;
		arrayByInt[2][0] = 5;
		arrayByInt[2][1] = 6;	
		System.out.printf("Length of arrayByInt: %d\n",  arrayByInt.length);
		System.out.printf("Length of arrayByInt[0]: %d\n",  arrayByInt[0].length);
		System.out.printf("Length of arrayByInt[1]: %d\n",  arrayByInt[1].length);
		System.out.printf("Length of arrayByInt[2]: %d\n",  arrayByInt[2].length);
		
		System.out.println("========= 直接印出 =========");
		System.out.println(arrayByInt[0][0]);
        System.out.println(arrayByInt[0][1]);
        System.out.println(arrayByInt[1][0]);
        System.out.println(arrayByInt[1][1]);
        System.out.println(arrayByInt[2][0]);
        System.out.println(arrayByInt[2][1]);
        
		// for-loop
		System.out.println("========= for-loop =========");
		for(int i = 0; i < arrayByInt.length; i++) {
			for(int j = 0; j < arrayByInt[i].length; j++) {
				System.out.println("value: " + arrayByInt[i][j]);				
			}
		}
		// for-each
		System.out.println("========= for-each =========");
		System.out.println("Memory of arrayByInt: " + arrayByInt);
		for(int[] memoryOfarrayByInt : arrayByInt) {
			for(int valueOfmemoryOfarrayByInt : memoryOfarrayByInt) {
				System.out.printf("memory: %s ; value: %d\n", memoryOfarrayByInt, valueOfmemoryOfarrayByInt);
			}
		}
	}
}

/*
	Console:
			Length of arrayByInt: 3
			Length of arrayByInt[0]: 2
			Length of arrayByInt[1]: 2
			Length of arrayByInt[2]: 2
			========= 直接印出 =========
			1
			2
			3
			4
			5
			6
			========= for-loop =========
			value: 1
			value: 2
			value: 3
			value: 4
			value: 5
			value: 6
			========= for-each =========
			Memory of arrayByInt: [[I@38cccef
			memory: [I@5679c6c6 ; value: 1
			memory: [I@5679c6c6 ; value: 2
			memory: [I@27ddd392 ; value: 3
			memory: [I@27ddd392 ; value: 4
			memory: [I@19e1023e ; value: 5
			memory: [I@19e1023e ; value: 6

*/