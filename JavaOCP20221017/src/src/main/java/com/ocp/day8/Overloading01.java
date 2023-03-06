package com.ocp.day8;
/*
	=================================================================
	 	
	Method overloading is a feature of Java in which a class has more than one method of the same name and their parameters are different.
	In other words, we can say that Method overloading is a concept of Java in which we can create multiple methods of the same name in the same class, 
	but type differently or length of parameters differently will decide which method will be invoked.
	
	Java supports method overloading through two mechanisms:
	
	1) By changing the data type of parameters 
	2) By changing the number of parameters
	
	=================================================================

	方法重載是 Java 的一個特性:
	1) 意思是一個類有多個同名方法，但帶入的型別不同 
	2) 參數長度不同，而決定要呼叫哪一個方法
*/


// The following sample code by changing the data type of parameters 
// 此範例講述方法重載 (型別不同)
public class Overloading01 {
	 
	  public static void printPow(double x) {
	        System.out.println("A");
	        System.out.println(Math.pow(x, 2));
	    }
	    public static void printPow(int x) {
	        System.out.println("B");
	        System.out.println(Math.pow(x, 2));
	    }
	    public static void printPow(Integer x) {
	        System.out.println("C");
	        System.out.println(Math.pow(x, 2));
	    }
	    public static void printPow(float x) {
	        System.out.println("D");
	        System.out.println(Math.pow(x, 2));
	    }
	    
	    public static void main(String[] args) {
	    	printPow(Double.valueOf(10));
	    	printPow(10);
	    	printPow(Integer.valueOf(10));
	    	printPow((float) 10);
	    }
}

/*
	Console:
		A
		100.0
		B
		100.0
		C
		100.0
		D
		100.0

*/
