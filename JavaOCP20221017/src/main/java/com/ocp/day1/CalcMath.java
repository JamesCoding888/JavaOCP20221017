package com.ocp.day1;
/*
		This program is giving three design of methods (eg, calcSum, calcAvg and calcSD) to calculate the add-up score and average score and 
		standard deviation of students 

		此程式建立 calcSum、 calcAvg  calcSD 方法，來計算學生的加總分數、平均分數和標準差
*/
public class CalcMath {
	 public static void main(String[] args) {
	        // 學生成績 100, 95, 80
	        // 計算總分與平均
	        int x = 100, y = 95, z = 80;
	        int sum = x + y + z;
	        double avg = sum / 3.0;
	        double dx = 1/3.0 * (Math.pow(x-avg, 2) + Math.pow(y-avg, 2) + Math.pow(z-avg, 2));
	        double sd = Math.sqrt(dx); // 標準差: Math.sqrt 開根號
	        double cv = sd / avg; // 變異係數
	        System.out.printf("總分: %d, 平均: %.1f 標準差: %.1f, 變異係數: %.3f\n", sum, avg, sd, cv);
	    }
	    // 將方法拆分成 計算總分的方法, 計算平均的方法, 計算標準差的方法, 計算變異係數的方法
	    public static int calcSum(int x, int y, int z) {
	        int sum = x + y + z;
	        return sum; // 回傳總分的結果
	    }
	    // 計算平均的方法
	    public static double calcAvg(int x, int y, int z) {
	        int sum = calcSum(x, y, z);
	        double avg = sum / 3.0;
	        return avg; // 回傳平均的結果
	    }
	    // 計算標準差的方法
	    public static double calcSD(int x, int y, int z) {
	        double avg = calcAvg(x, y, z);
	        double dx = 1/3.0 * (Math.pow(x-avg, 2) + Math.pow(y-avg, 2) + Math.pow(z-avg, 2));
	        double sd = Math.sqrt(dx); // 標準差: Math.sqrt 開根號
	        return sd;
	    }
}


/*
	Console:
		總分: 275, 平均: 91.7 標準差: 8.5, 變異係數: 0.093

*/