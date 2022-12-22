package com.ocp.day6.ScannerPractice;
/*
 	Using object of Scanner to filter a string into the specifically member variables  
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerFilter {
	public static List<Object> list4TimingController = new ArrayList<>();
	public static void main(String[] args) {
		// Create an object of Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("(1) If exit program, please type \"exit\". Otherwise, (2) Type in the following sample string as \"ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|\":?>< \":");
		// Array<String> 專門收集字串, e.g., 中文 空格 符號
		List<String> list4CollectingString = new ArrayList<>();		
		// Array<nextDouble) 專門收集小數點數字
		List<Double> list4CollectingDecimal = new ArrayList<>();
		// Array<nextInt> 專門收集整數數字
		List<Integer> list4CollectingInteger = new ArrayList<>();
		
		if(scanner.hasNext("exit")) {
			System.out.println("Exit the current program by terminating the Java Virtual Machine");
			System.exit(0);
		}
		if(scanner.hasNext()) {
			String scannerString01 = scanner.next();
			double scannerDouble = scanner.nextDouble();
			String scannerString02 = scanner.next();
			int scannerInt = scanner.nextInt();
			String scannerString03 = scanner.nextLine();
			
			list4CollectingString.add(scannerString01);
			list4CollectingDecimal.add(scannerDouble);
			list4CollectingString.add(scannerString02);
			list4CollectingInteger.add(scannerInt);
			list4CollectingString.add(scannerString03);
			
			list4TimingController.add(list4CollectingString);
			list4TimingController.add(list4CollectingDecimal);			
			list4TimingController.add(list4CollectingInteger);			

		}
		
		
		System.out.println("list4TimingController[0]: " + list4TimingController.get(0));
		System.out.println("list4TimingController[1]: " + list4TimingController.get(1));
		System.out.println("list4TimingController[2]: " + list4TimingController.get(2));
		
		scanner.close();		
	}
}

/*
	Console 1):
				(1) If exit program, please type "exit". Otherwise, (2) Type in the following sample string as "ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|":?>< ":
				exit
				Exit the current program by terminating the Java Virtual Machine
	
	Console 2):
				(1) If exit program, please type "exit". Otherwise, (2) Type in the following sample string as "ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|":?>< ":
				ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|":?>< 
				list4TimingController[0]: [ScannerSplit, GotYou,  ~!@#$%^&*()_+}{|":?>< ]
				list4TimingController[1]: [888.8]
				list4TimingController[2]: [100]
*/