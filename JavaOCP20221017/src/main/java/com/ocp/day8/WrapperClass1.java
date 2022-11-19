package com.ocp.day8;

public class WrapperClass1 {
    public static void main(String[] args) {
        // 要印出 int 的最大值 
        int x = Integer.MAX_VALUE;
        System.out.println(x);
        String a = "100"; // 國文成績
        String b = "90";  // 數學成績
        System.out.println(a + b); // 總分
        // Integer.parseInt(字串) 字串轉數字
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        
        
    }
}