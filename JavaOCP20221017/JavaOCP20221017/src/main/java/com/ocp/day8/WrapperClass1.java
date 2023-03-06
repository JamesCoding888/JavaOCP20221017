package com.ocp.day8;
// This lesson we introduce the Wrapper Class (本節介紹 "包覆類別")

public class WrapperClass1 {
    public static void main(String[] args) {
        // Write a programming in Java - 1.0, 1.1, 1.2, 1.3, and 1.4 (NOT support auto-boxing and unboxing)
    	// Java 1.5 之前版本，不支援 auto-boxing 和 unboxing
    	int x = 100;
    	// 需手動將 int 型別向上轉型 (UpCasting) 為 Integer type
        Integer y = Integer.valueOf(100);
        System.out.println(x);
        // 需手動將 Integer 型別向下轉型 (DownCasting) 為 int type
        System.out.println(y.intValue());
        /*
	         x: int type, y: Integer type
	         different type add-up, shall make sure both of type are SAME
	         Therefore, we shall have y (which is a local variable) downCast to int type 
	         
	         因兩個變數之型別不同，須先將 Wrapper Class 向下轉型為 int 基本型別，
	         方能將兩個基本型別之變數相加
        */
        int z = x + y.intValue();
        System.out.println(z);
        
        // Write a programming by Java 1.5 or above version 
    	// Java 1.5 或以上之版本，支援 auto-boxing 和 unboxing
        // 讓 int 與 Integer 可以更直觀的應用
        int a = 100;
        // The Java compiler will proceed auto-boxing
        // Java 編譯器，將自動將基本類型轉成對應的包覆類別
        Integer b = 100;  // original syntax - "Integer.valueOf(100)"
        // The Java compiler will proceed unboxing 
        // Java 編譯器，將自動將包覆類別轉成對應的基本類型
        int c = a + b;    // original syntax - "a + b.intValue()"
                         
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