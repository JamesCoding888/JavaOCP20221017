package com.ocp.day9_1.Varargs;
// This lesson we design a same name of method but differently arbitrary number of arguments 
// 本節設計相同的方法名稱，但不同的參數

public class VarargDemo2 {
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
