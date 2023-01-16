package com.ocp.day17.exception;
import java.util.InputMismatchException; 
import java.util.Scanner;
public class ExceptionInputMismatch {
    public static void main(String[] args) {
    	int numerator = 100;
		Integer[] denominator = {10, 0, null};
		Scanner scan = new Scanner(System.in);	
		System.out.print("Please type index of array from denominator: ");    
        // try-catch
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
	        } catch (InputMismatchException e) {
	            e.printStackTrace();
	        }  
//      */
		
		// remove try-catch  
		/*
	        String string = scan.next(); // transfer to String    
	        // Whether the input value is numeric value or not
	        boolean isNumeric = string.chars().allMatch(Character::isDigit);
	        if(!isNumeric) {
	            System.out.println("Pleas type numeric value");
	            return;
	        }
			int index = scan.nextInt();
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
		*/  
		scan.close();
    }
}