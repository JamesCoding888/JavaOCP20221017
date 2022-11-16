package com.ocp.day6.ScannerPractice;
// Of this practice, you will learn how to use "break" and "return" 
// during the process of running programming
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
			if (scan.hasNext("Happy_Ending")) {
				break;
			}
			System.out.println("程式碼尚未停止執行，因 break 只是跳出迴圈，請繼續...");
			scan.next();
		}
		
		while (scan.hasNext()) {
			scan.next();
			System.out.print("[3]若想停止程式執行，請輸入 \"Happy_Ending\":");
			if (scan.hasNext("Happy_Ending")) {
				System.out.println("程式執行停止");
				return;
			}
			System.out.println("此程式碼不會執行，因為因 return 導致停止程式");
			scan.next();
		}
		System.out.println("此程式碼不會執行，因為 return 導致停止程式");
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
