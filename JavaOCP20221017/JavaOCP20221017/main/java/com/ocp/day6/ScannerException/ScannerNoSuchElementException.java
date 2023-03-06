package com.ocp.day6.ScannerException;
import java.util.Scanner;

/*
 	This programming is a demo of NoSuchElementException. 

 	Because the Scanner in method of getAge() was closed, then caused NO Scanner could be used in the method of getName(). 
 	Then, you will get NoSuchElementException.
 	
 	此程式碼模擬如何得到 NoSuchElementException。
 	當 getAge method 中，將 Scanner closed 後，再執行 getName method 時，因 Scanner 已經關閉了，
 	導致在執行 getName method 時，無 Scanner 可用，因此跳出 NoSuchElementException
*/

public class ScannerNoSuchElementException {
	public static void main(final String[] args) {		
		System.out.println(getAge());
		System.out.println(getName());
	}

	public static int getAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What's your age?");
		final String age = scanner.next();
		scanner.close();
		final int numberAge = Integer.parseInt(age);
		return numberAge;
	}

	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What's your name?");
		final String name = scanner.next();
		scanner.close();
		return name;
	}
}

/*
	Console:
			What's your age?14
			14
			What's your name?Exception in thread "main" java.util.NoSuchElementException
				at java.base/java.util.Scanner.throwFor(Scanner.java:937)
				at java.base/java.util.Scanner.next(Scanner.java:1478)
				at com.ocp.day6.ScannerPractice.ScannerNoSuchElementException.getName(ScannerNoSuchElementException.java:33)
				at com.ocp.day6.ScannerPractice.ScannerNoSuchElementException.main(ScannerNoSuchElementException.java:18)
*/
