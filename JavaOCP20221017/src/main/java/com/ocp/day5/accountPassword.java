package com.ocp.day5;

import java.util.Base64;

public class accountPassword {									   
	public final static String referenceOfpasscodeInByte2Base64ForGit = "";

	public static void main(String[] args) {
		String passcode = "888JamesCoding";
		byte[] byteArr = passcode.getBytes();
		// print the byte[] elements
		System.out.println("String to byte array: " + accountPassword.toString(byteArr));
		byte[] passcodeInByte2Base64 = Base64.getEncoder().encode(byteArr);
		System.out.println(passcodeInByte2Base64);
		
		StringBuilder strB = new StringBuilder();
		for(byte value : passcodeInByte2Base64) {			
			strB.append(value);							
		}
		// 印出 passcodeInByte2Base64 的值
		System.out.println("印出 passcodeInByte2Base64 的值: " + strB.toString());	
		// 注意將初始化的 StringBuilder Object 與 String value 做 equals() 
		// 比對其兩兩之 value 值是否相同，會出現 false 
		// 因為 “Unlikely argument type for equals(): String seems to be unrelated to StringBuilder"
		System.out.println("compare the value for argument type differently: " + strB.equals(referenceOfpasscodeInByte2Base64ForGit));
		System.out.println("compare the value for both argument type similarly: " + strB.toString().equals(referenceOfpasscodeInByte2Base64ForGit));
		
	}
	
	
	public static String toString(byte[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
