package com.ocp.day4;
import java.util.Arrays;

public class MultiArrayDemo5 {
	public static void main(String[] args) {
		int[][] arrays = { { 1, 2, 3 }, { 11, 22, 33 } }; // 2 x 3
		System.out.println(Arrays.deepToString(arrays));
		// 陣列翻轉 [[1, 11], [2, 22], [3, 33]] // 3 x 2
		int col = arrays[0].length; // 3
		int row = arrays.length; // 2
		int[][] arraysT = new int[col][row]; // 3 x 2
		for (int i = 0; i < col; i++) {
			for (int k = 0; k < row; k++) {
				arraysT[i][k] = arrays[k][i];
			}
		}
		System.out.println(Arrays.deepToString(arraysT));

		int[][] arraysT2 = getT(arrays);
		System.out.println(Arrays.deepToString(arraysT2));

		int[][] arraysT3 = getT(arraysT2);
		System.out.println(Arrays.deepToString(arraysT3));
	}

	private static int[][] getT(int[][] arrays) {
		int col = arrays[0].length;
		int row = arrays.length;
		int[][] arraysT = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int k = 0; k < row; k++) {
				arraysT[i][k] = arrays[k][i];
			}
		}
		return arraysT;
	}
}
