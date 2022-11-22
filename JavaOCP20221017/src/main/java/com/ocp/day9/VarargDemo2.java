package com.ocp.day9;

public class VarargDemo2 {
    public static void test(int ... values) {
        System.out.println("A");
    }
    
    public static void test(int x, int y) {
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        test(1, 2);
    }
    
}
