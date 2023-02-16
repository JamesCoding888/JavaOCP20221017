package com.ocp.day17.exception.runtimeexception;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ExceptionDenominatorDemo {
	public static void main(String[] args) {
		int numerator = 100;
		Integer[] denominator = {10, 0, null};
		Scanner scan = new Scanner(System.in);	
		System.out.print("Please type index of array from denominator: ");
		try{
			int index = scan.nextInt();  // type 0, 1, 2, 3 or ,
			int result = numerator / denominator[index];
			System.out.println(result);
		  // java.lang.ArithmeticException	
		} catch(ArithmeticException e) {		
			System.out.println("I'm in ArithmeticException");
			e.printStackTrace();		
		  // java.lang.NullPointerException
		} catch(NullPointerException e) {	
			System.out.println("I'm in NullPointerException");
			e.printStackTrace();		
		  // java.lang.ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException e) {	
			System.out.println("I'm in ArrayIndexOutOfBoundsException");
			e.printStackTrace();		
	      // java.lang.IndexOutOfBoundsException
		} catch(IndexOutOfBoundsException e) {	
			System.out.println("I'm in IndexOutOfBoundsException");
			e.printStackTrace();	
		  // java.lang.InputMismatchException
		} catch(InputMismatchException e) {	
			System.out.println("I'm in InputMismatchException");
			e.printStackTrace();	
		  // java.lang.NoSuchElementException
		} catch(RuntimeException e) {
			System.out.println("I'm in RuntimeException");
			e.printStackTrace();
		  // java.lang.Exception
		} catch(Exception e) {	
			System.out.println("I'm in Exception");
			e.printStackTrace();
		  // java.lang.Throwable
		} catch(Throwable e) {
			System.out.println("I'm in Throwable");
			e.printStackTrace();
		}
		scan.close();	
	}
}

/*
	Console:
			Please type index of array from denominator: 0
			10
	
	
	Console:
			Please type index of array from denominator: 1
			I'm in ArithmeticException
			java.lang.ArithmeticException: / by zero
				at com.ocp.day17.exception.ExceptionDenominatorDemo.main(ExceptionDenominatorDemo.java:11)


	Console:
			Please type index of array from denominator: 2
			I'm in NullPointerException
			java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "denominator[index]" is null
				at com.ocp.day17.exception.ExceptionDenominatorDemo.main(ExceptionDenominatorDemo.java:11)

	Console:
			Please type index of array from denominator: 3
			I'm in ArrayIndexOutOfBoundsException
			java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
				at com.ocp.day17.exception.ExceptionDenominatorDemo.main(ExceptionDenominatorDemo.java:11)


	Console:
			Please type index of array from denominator: ,
			I'm in InputMismatchException
			java.util.InputMismatchException

*/