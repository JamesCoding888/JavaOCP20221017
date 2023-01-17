package com.ocp.day17.exception;
import java.util.InputMismatchException; 
import java.util.Scanner;
public class ExceptionInputMismatchDemo {
    public static void main(String[] args) {
    	int numerator = 100;
		Integer[] denominator = {10, 0, null};
		Scanner scan = new Scanner(System.in);	
		System.out.print("Please type index of array from denominator: ");    
        // 1) w/ try-catch
//		/*
			try {
	            int index = scan.nextInt();
	            if(index < 0 || index >= denominator.length) {
	                System.out.println("index out of range of array");
	                return;
	            }
	            if(denominator[index] == null) {
	                System.out.println("denominator = null");
	                return;
	            }
	            if(denominator[index] == 0) {
	                System.out.println("denominator = 0");
	                return;
	            }
	            int result = numerator / denominator[index];
	            System.out.println(result);
	          // InputMismatchException -> NoSuchElementException -> RuntimeException
	        } catch (InputMismatchException e) {
	            e.printStackTrace();
	        }  
//      */
		
		// 2) w/o try-catch  
//		/*
	        String string = scan.next(); // transfer to String    
	        // Whether the input string is numeric value or not
	        boolean isNumeric = string.chars().allMatch(Character::isDigit);
	        if(!isNumeric) {
	            System.out.println("Pleas type numeric value");
	            return;
	        }
	        int index = Integer.valueOf(string);
			if (index < 0 || index >= denominator.length) {
				System.out.println("index out of range of array");
				return;
			}
			if (denominator[index] == null) {
				System.out.println("denominator = null");
				return;
			}
			if (denominator[index] == 0) {
				System.out.println("denominator = 0");
				return;
			}
			int result = numerator / denominator[index];
			System.out.println(result);  
//		*/  
			
		scan.close();
    }
}


/*
	Console 1):
				Please type index of array from denominator: 0
				10
				
				Please type index of array from denominator: 1
				denominator = 0
	
				Please type index of array from denominator: 2
				denominator = null
				
				Please type index of array from denominator: 3
				index out of range of array
				
				Please type index of array from denominator: .
				java.util.InputMismatchException

	Console 2):
				Please type index of array from denominator: 0
				10
				
				Please type index of array from denominator: 1
				denominator = 0
	
				Please type index of array from denominator: 2
				denominator = null
				
				Please type index of array from denominator: 3
				index out of range of array
	
				Please type index of array from denominator: .
				Pleas type numeric value
	
	
*/