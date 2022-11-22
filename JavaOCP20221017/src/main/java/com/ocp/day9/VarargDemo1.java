package com.ocp.day9;
/*
 	Before Java 5, whenever we wanted to pass an arbitrary number of arguments, 
 	we had to pass all arguments in an array or implement N methods (one for each additional parameter):
 	
 	1) public String format() { ... }

	2) public String format(String value) { ... }

	3) public String format(String val1, String val2) { ... }
	
	==========================================================================================================
	
	After Java 5, Varargs help us avoid writing boilerplate code by introducing the new syntax 
	that can handle an arbitrary number of parameters automatically – using an array under the hood.

 */
public class VarargDemo1 {
	
    // ... Vararg 自動變長參數
    public static int add(int... values) {
        int sum = 0;
        for(int value : values) {
            sum += value;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(add(nums));
        System.out.println(add(1, 2, 3, 4, 5));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1));
        System.out.println(add());
    }
}