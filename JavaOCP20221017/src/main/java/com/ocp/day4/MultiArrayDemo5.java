package com.ocp.day4;
import java.util.Arrays;

public class MultiArrayDemo5 {
	public static void main(String[] args) {
		int[][] arrays = { { 1, 2, 3 }, { 11, 22, 33 } }; // column: 3 , Row: 2
		// Using "API of Arrays - deepToString" to print out the value of arrays variable
		System.out.println("valueOfarrays: " + Arrays.deepToString(arrays));
		// 將 3x2 陣列反轉為 2x3 陣列 -> [[1, 11], [2, 22], [3, 33]] // column: 2 , Row: 3
		int col = arrays[0].length; // the length of column: 3
		int row = arrays.length; // the length of arrays variable to be row: 2
		int[][] arraysT = new int[col][row]; // change-up the position of column and row to be 2x3
		System.out.println("********** arrays[i][k] **********");
		for (int i = 0; i < col; i++) {
			for (int k = 0; k < row; k++) {
				// ========= arrays[k][i] =========
				// arrays[0][0]: 1 arrays[1][0]: 11 
				// arrays[0][1]: 2 arrays[1][1]: 22 
				// arrays[0][2]: 3 arrays[1][2]: 33 
				System.out.printf("arrays[%d][%d]: %s ", k, i, arrays[k][i]);
				// 反轉
				arraysT[i][k] = arrays[k][i];  				
			}
		}
		System.out.println();
		System.out.println("********** arraysT[i][k] **********");
		for (int i = 0; i < col; i++) {
			for (int k = 0; k < row; k++) {
				System.out.printf("arraysT[%d][%d]: %s ", i, k, arraysT[i][k]);
			}
		}
		System.out.println();
		System.out.println("[1]valueOfarraysT: " + Arrays.deepToString(arraysT));

		int[][] arraysT2 = getT(arrays);
		System.out.println("[2]valueOfarraysT: " + Arrays.deepToString(arraysT2));

		int[][] arraysT3 = getT(arraysT2);
		System.out.println("[3]valueOfarraysT: " + Arrays.deepToString(arraysT3));
	}

	private static int[][] getT(int[][] arrays) {
		int col = arrays[0].length; // 2 
		int row = arrays.length;    // 3
		int[][] arraysT = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int k = 0; k < row; k++) {
				arraysT[i][k] = arrays[k][i];  
			}
		}
		return arraysT;
	}
}
