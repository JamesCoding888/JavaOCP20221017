package com.ocp.day6.ScannerException;
import java.util.Scanner;

/*
 	This programming is a demo of IllegalStateException. 
 	Because the Scanner in method of getAge() was closed, then caused NO Scanner could be used in the method of getName(). 
 	Then, you will get IllegalStateException.
 	
 	此程式碼模擬如何得到 IllegalStateException。
 	當 getAge method 中，將 Scanner closed 後，再執行 getName method 時，因 Scanner 已經關閉了，
 	導致在執行 getName method 時，無 Scanner 可用，因此跳出 IllegalStateException
*/
public class ScannerIllegalStateException {
	 
	public static void main(String[] args) {
		
		 
		// Regarding type of final, please go to study the "IntroductionOfFinal.java" from package: com.ocp.day6.ScannerException
		// 關於 final 變數之用法，請參 IntroductionOfFinal.java (在 package: com.ocp.day6.ScannerException)
		final Scanner scanner = new Scanner(System.in); // Created Scanner for getAge() and getName() method
		System.out.println(getAge(scanner));
		System.out.println(getName(scanner));
	}

	public static Integer getAge(final Scanner scanner) {
		System.out.print("What's your age?");
		if (scanner.hasNext()) {
			String age = scanner.next();
			scanner.close(); // Scanner closed
			int numberAge = Integer.parseInt(age);
			return numberAge;
		}
		scanner.close(); // Scanner closed
		return null;

	}

	public static String getName(final Scanner scanner) {
		System.out.print("What's your name?");
		if (scanner.hasNext()) {
			String name = scanner.next();
			return name;
		}
		return null;
	}
}


/*
 	Console:
 			What's your age?14
			14
			Exception in thread "main" What's your name?java.lang.IllegalStateException: Scanner closed
				at java.base/java.util.Scanner.ensureOpen(Scanner.java:1150)
				at java.base/java.util.Scanner.hasNext(Scanner.java:1439)
				at com.ocp.day6.ScannerPractice.ScannerIllegalStateException.getName(ScannerIllegalStateException.java:29)
				at com.ocp.day6.ScannerPractice.ScannerIllegalStateException.main(ScannerIllegalStateException.java:11)

*/