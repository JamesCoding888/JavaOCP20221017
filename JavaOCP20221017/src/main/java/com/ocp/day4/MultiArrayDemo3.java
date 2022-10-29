package com.ocp.day4;
import java.util.Arrays;

public class MultiArrayDemo3 {
	public static void main(String[] args) {
		// 甲乙丙三人的[身高, 體重]如下:
		double[][] x = { { 170.0, 60.0 }, // 甲
				{ 185.0, 75.5 }, // 乙
				{ 165.5, 43.5 } // 丙
		};
		// 請個別計算出這三人的bmi值(小數點一位) = ?
		for (double[] array : x) {
			System.out.print(Arrays.toString(array));
			double h = array[0];
			double w = array[1];
			double bmi = w / Math.pow(h / 100, 2);
			System.out.printf(" bmi: %.1f\n", bmi);
		}
	}
}
