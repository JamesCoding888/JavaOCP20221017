package com.ocp.day6.ScannerException;
/*
 		This sample code could resolve the NoSuchElementException and IllegalStateException 
 		
 		此程式碼解決 NoSuchElementException and IllegalStateException 的問題

	
		When a Scanner is closed, it will close its input source if the source implements the Closeable interface.
		 
		Clearly, if we have reached the end of input, or if the source is closed, 
	  	then we get the NoSuchElementException().
	  	 
	  	Please see the specification of Oracle 1.5 as following:
	  	->	Class 
	  				public final class Scanner implements Iterator<String>, Closeable { ... }
	  	 			
	  	-> throwFor method
					
					private void throwFor() {
						  skipped = false;
						  if ((sourceClosed) && (position == buf.limit()))
						      throw new NoSuchElementException();
						  else
						      throw new InputMismatchException();
						  }
					}
				
*/
 
import java.util.Scanner;
public class ScannerResolvedIllegalStateExceptionNoSuchElementException {
	public static void main(final String[] args) {		
		final Scanner scanner = new Scanner(System.in);
		System.out.println(getAge(scanner));
		System.out.println(getName(scanner));
		scanner.close();
	}

	public static Integer getAge(final Scanner scanner) {
		
		System.out.print("What's your age ?");
		if(scanner.hasNext()) {			
			final String age = scanner.next();
			final int numberAge = Integer.parseInt(age);
			return numberAge;
		}
		return null;
	}

	public static String getName(final Scanner scanner) {	
		System.out.print("What's your name ?");
		if(scanner.hasNext()) {			
			final String name = scanner.next();		
			return name;
		}		
		return null;
	}
}

/*
	Console:
			What's your age ?14
			14
			What's your name ?james
			james


*/
