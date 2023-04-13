package com.ocp.day6.ScannerPractice;
/*
 	This is a Java program that uses the Scanner class to read input from the user and control the execution of the program 
 	using loops and conditional statements (i.e., break and return).
	
	'break' : break loop
	'return' : Terminate operation of current method

*/

import java.util.Scanner;
public class ScannerForPractice_Loop_And_If {
	public static void main(String[] args) {
		// Constructs a new Scanner that produces values scanned
		// from the specified input stream.
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("[1]若想停止程式執行，請輸入 \"Happy_Ending\":");
			if (scan.hasNext("Happy_Ending")) {
				break;
			}
		}
		System.out.println("程式碼尚未停止執行，因 break 只是跳出迴圈，請繼續...");
		
		while (scan.hasNext()) {			
			// Finds and returns the next complete token from this scanner.
			// 若 token 中的資料第一個參數仍有值，則抓出並傳回 scanner 中
			scan.next();			
			System.out.print("[2]若想停止程式執行，請輸入 \"Happy_Ending\":");
			/*
			 	Enter "Happy_Ending", the loop is exited using the "break" statement
			*/
			if (scan.hasNext("Happy_Ending")) {
				break;
			}
			System.out.println("程式碼尚未停止執行，因 break 只是跳出迴圈，請繼續...");
			/*
			 	The first call to scan.next(); does not consume the token, which means that the next call to scan.next(); 
			 	will still return the same token. 
			 	
			 	Therefore, we need to call scan.next(); again to consume the token and allow the scanner to move to the next token.
			*/
			scan.next();
		}

		while (scan.hasNext()) {
			// Use twice per iteration to discard the current token and move to the next token
			scan.next();
			System.out.print("[3]若想停止程式執行，請輸入 \"Happy_Ending\":");
			/*
	 			Enters "Happy_Ending", the program prints a message and terminates using the "return" statement, 
	 			which causes the current method (main) to exit.
			*/
			if (scan.hasNext("Happy_Ending")) {
				System.out.println("程式執行停止");
				return; // Terminate operation of current process from this method (在此終止本方法運行)
			}
			System.out.println("此程式碼不會執行，因為因 return 導致終止本方法運行");
			scan.next();
		}
		System.out.println("此程式碼不會執行，因為 return 導致終止本方法運行");
	}
}


/*
	Console:
		[1]若想停止程式執行，請輸入 "Happy_Ending":Happy_Ending
		程式碼尚未停止執行，因 break 只是跳出迴圈，請繼續...
		[2]若想停止程式執行，請輸入 "Happy_Ending":Happy_Ending
		[3]若想停止程式執行，請輸入 "Happy_Ending":Happy_Ending
		程式執行停止

*/
