package com.ocp.day2.bar;


public class Apple {
    // Visibility: public
	public static void a1() {
        System.out.println("a1()");
    }
    // Visibility: default
    static void a2() {
        System.out.println("a2()");
    }
    // Visibility: private
    private static void a3() {
        System.out.println("a3()");
        a1();
        a2();
    }
}
