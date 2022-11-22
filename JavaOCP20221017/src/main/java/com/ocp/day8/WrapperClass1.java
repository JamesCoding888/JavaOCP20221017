package com.ocp.day8;
// This lesson we introduce the Wrapper Class
// 本節介紹基本 "基本資料型別" 和 "包覆類別"

public class WrapperClass1 {
    public static void main(String[] args) {
        // Java 1.5 以前的寫法
        int x = 100;
        Integer y = Integer.valueOf(100);
        System.out.println(x);
        System.out.println(y.intValue());
        int z = x + y.intValue();
        System.out.println(z);
        // Java 1.5 以後引進了 auto-Boxing / unboxing 技術
        // 讓 int 與 Integer 可以更直觀的應用
        int a = 100;
        Integer b = 100; // 背後所代表的語法 Integer.valueOf(100)
                         // auto-boxing
        int c = a + b;   // 背後所代表的語法 a + b.intValue();
                         // auto-unboxing
        System.out.println(c);        
        
        Integer i = null;
    }
}

/*
	Console:
			100
			100
			200
			200

*/