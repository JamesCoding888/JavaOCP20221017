package com.ocp.day2.bar;


public class Apple {
    public static void a1() {
        System.out.println("a1()");
    }
    static void a2() {
        System.out.println("a2()");
    }
    private static void a3() {
        System.out.println("a3()");
        a1();
        a2();
    }
}
