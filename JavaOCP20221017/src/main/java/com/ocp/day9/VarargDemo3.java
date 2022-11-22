package com.ocp.day9;

import java.util.Arrays;
public class VarargDemo3 {
    public static void add(int a, int ... values) {
        System.out.println("a = " + a);
        System.out.println("values = " + Arrays.toString(values));
    }
    public static void main(String[] args) {
        add(1);
        add(1, 2);
        add(1, 2, 3);
    }
    
}