package com.ocp.day17.exception.application.data.practiceOfSplitAndDelimiter;
import java.util.Scanner;
public class SplitSample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please type in: "); // How are you
		if (scan.hasNext()) {			
			scan.useDelimiter(" ");
			String str1 = scan.nextLine();
			System.out.println(str1);
			String[] stringInSplit = str1.split("\\u0020"); // Regular Expression for blank
			System.out.println(stringInSplit[0]);
			System.out.println(stringInSplit[1]);
			System.out.println(stringInSplit[2]);
		}
	}
}
/*
 Console:	
 			Please type in: How are you
			How are you
			How
			are
			you
*/