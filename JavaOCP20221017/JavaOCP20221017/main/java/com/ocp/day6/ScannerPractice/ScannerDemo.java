package com.ocp.day6.ScannerPractice;
// This lesson we introduce the API of Scanner of hasNext(T pattern), hasNext() and scan.next().  
// 此課程介紹如何使用 Scanner 的 API - hasNext(T pattern)、hasNext() 和 scan.next()
import java.util.Scanner; 
public class ScannerDemo {
    public static void main(String[] args) {
		// Constructs a new Scanner that produces values scanned 
		// from the specified input stream.
    	Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.print("若想停止程式執行，請輸入 \"Happy_Ending\"，反之請輸入任意值:");
        	if(scan.hasNext("Happy_Ending")) {
        		break; // Break the loop (跳出迴圈)
        	}
            // 將 token 中是否有這 "hello" 字串
            if(scan.hasNext("hello")) {
            	System.out.println("token 中有這 \"hello\" 字串");
            }
            // 將 token 中的資料第一個參數再轉為 String type
            // 參數遇到空格，則不抓，e.g., "123 123"，只抓 "123"
            if (scan.hasNext()) {
                String str1 = scan.next();
                System.out.println("將 token 中的資料再轉為 String type: " + str1);
            }
        }   
        // Closes this scanner
        scan.close();
        // If this scanner is already closed then invoking this method 
        // will have no effect.
        System.out.println("感謝您，歡迎下次再來");
    }
}

/*
 	Console:
 	
 			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:Happy_Ending_
			將 token 中的資料再轉為 String type: Happy_Ending_
			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:~!@#$%^&*()_+}{|":?><
			將 token 中的資料再轉為 String type: ~!@#$%^&*()_+}{|":?><
			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:hello
			token 中有這 "hello" 字串
			將 token 中的資料再轉為 String type: hello
			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:hello_1
			將 token 中的資料再轉為 String type: hello_1
			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:hello 123
			token 中有這 "hello" 字串
			將 token 中的資料再轉為 String type: hello
			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:將 token 中的資料再轉為 String type: 123
			若想停止程式執行，請輸入 "Happy_Ending"，反之請輸入任意值:Happy_Ending
			感謝您，歡迎下次再來


*/
