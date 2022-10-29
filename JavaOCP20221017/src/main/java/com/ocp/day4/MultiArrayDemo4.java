package com.ocp.day4;

import java.util.Arrays;

public class MultiArrayDemo4 {
	public static void main(String[] args) {
		// 有三組[身高, 體重]的資料如下:
		double[][] x = { { 170.0, 185.0, 165.5 }, // 身高
				{ 60.0, 75.5, 43.5 } // 體重
		};
		// 請個別計算出這三組的bmi值(小數點一位) = ?
		System.out.println(Arrays.deepToString(x));
		/*
		 * [170.0, 185.0, 165.5] [60.0 , 75.5 , 43.5] --------------------- 0 1 2
		 */
		if (x != null && x.length == 2 && x[0].length == x[1].length) {
			for (int i = 0; i < x[0].length; i++) {
				System.out.println(x[0][i]);
				System.out.println(x[1][i]);
				double h = x[0][i];
				double w = x[1][i];
				double bmi = w / Math.pow(h / 100, 2);
				System.out.printf("bmi: %.1f\n", bmi);
			}
		}

	}
}
