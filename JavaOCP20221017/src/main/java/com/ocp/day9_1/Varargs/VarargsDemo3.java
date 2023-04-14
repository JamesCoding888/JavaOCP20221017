package com.ocp.day9_1.Varargs;
/*
	 	This program we design a method with one fixed argument  
	 	but support an arbitrary number of parameters of one type (i.e., int) for another
	 	
	 	本程式設計一個方法，其中一個固定的輸入參數為 int 型別，另外一個則是可變參數
 	
*/

import java.util.Arrays;
public class VarargsDemo3 {
	
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

/*
 
 	Console:
			a = 1
			values = []
			a = 1
			values = [2]
			a = 1
			values = [2, 3]

*/