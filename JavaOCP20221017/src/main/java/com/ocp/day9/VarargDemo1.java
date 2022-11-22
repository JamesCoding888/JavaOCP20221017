package com.ocp.day9;

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