package com.ocp.day9_1.Varargs;
/*
		The program above demonstrates method overloading with varargs. 
		
		There are two methods with the same name "test", but one takes an arbitrary number of int arguments and the other takes two int arguments.
		
		本程式設計相同的方法名稱，但不同的參數		
*/

public class VarargsDemo2 {
    public static void test(int ... values) {
        System.out.println("You are in the Varargs method");
    }
    
    public static void test(int x, int y) {
        System.out.println("You are in the general method with two arguments");
    }
    
    public static void main(String[] args) {
        test(1, 2);
        test(1, 2, 3);
    }    
}

/*
 	Console:
 			You are in the general method with two arguments
			You are in the Varargs method
*/
