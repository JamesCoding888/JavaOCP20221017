package com.ocp.day4;
/*
		Of this program, we give a lecture on converting a 2-D array (Column: 3, Row: 2) to 2-D array (Column: 2, Row: 3). 
		
		此程式介紹一組二維陣列 (列: 3, 行: 2) 的內容，轉換成 2 維陣列 (列: 2, 行: 3)。對於讀者而言，本節為了訓練陣列大小編排的邏輯概念，所設置。但在開發中，建議仍採用 
		Java 1.8 提供的 API 來做設計，因為設計者胥撰寫 for-loop 或 for-each 的迴圈架構，其迴圈的順序對於抓取陣列的位置和內容，至關重要，但對於維護上，並不是一個上
		策，假設開發者過了兩個月後，再回來閱讀程式碼時，將花上許多時間來回顧當時撰寫此程式碼的心路歷程。再者，用迴圈的撰寫方式，邏輯上較不直接 (若與 Java 1.8 的 API 相
		比)
*/
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
