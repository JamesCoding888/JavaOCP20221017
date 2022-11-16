package com.ocp.day6.ScannerPractice;
// This lesson we design a Limiter by Scanner to give a limited number 
// for running the programming of loop
import java.util.Scanner;
public class ScannerLimiter {
	
	// Constructs a new Scanner that produces values scanned
	// from the specified input stream.
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// while-loop starting from n = 1
		int n = 1;
		// 將輸入值，藉由 .nextInt() 轉成 int variable
		System.out.print("請輸入 > 0 的整數值，反之結束程式:");
		int limitedNumber = scan.nextInt();
		if(limitedNumber <= 0) {
			System.out.println("您輸入的值 <= 0，因此結束程式執行");
			return;
		}
		// 判斷 n <= limitedNumber (也就是您輸入的值) 
		while(n <= limitedNumber) {
			System.out.println("Entry [1]");
			// 呼叫 menu method
			menu();
			// n = n + 1;
			++n;
		}
		System.out.printf("n: %d 違反小於等於 limitedNumber: %d，因此結束程式", n, limitedNumber);
		scan.close();
	}
	
	public static void menu() {
		System.out.print("Entry [2] 請輸入任意值:");
		scan.next(); 
	}
}

/*
	Console:
		請輸入 > 0 的整數值，反之結束程式:2
		Entry [1]
		Entry [2] 請輸入任意值:~!@#$%^&*()_+}{|":?><
		Entry [1]
		Entry [2] 請輸入任意值:HelloWorld
		n: 3 違反小於等於 limitedNumber: 2，因此結束程式
*/	
