package com.ocp.day11_2;

public class EqualsFunction {
	public static void main(String[] args) {
		String string1 = "James";
		String string2 = new String("James");
		
		// string1 和 string2 屬於不同物件
		System.out.println("object of string1 and string2 if Same? " + (string1 == string2));  // false
		
		// 比較物件的 value
		// refer to "https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-"
		System.out.println("value of string1 and string2 if Same? " + (string1.equals(string2)));  // true
		
		/*
		   After comparison of string1 and string2 with .equals() function, and result is equal, then
		   both of hasCode MUST be equal.
		   
		   若 string1 和 string2 經 .equals() 函式比較後，相等，則兩者之 hashCode『必需』相等
		*/		
		System.out.println("hashCode of string1: " + string1.hashCode());
		System.out.println("hashCode of string2: " + string2.hashCode());		
		
		// 大小寫不同
		String string3 = "james";
		String string4 = new String("James");
		
		// 比較 string3 和 string4 的 value (忽略大小寫) 是否相同
		System.out.println("value (ignore uppercase) of string3 and string4 if Same? " + (string3.equalsIgnoreCase(string4))); // true
				
		// 比較物件的 value
		System.out.println("value of string3 and string4 if Same? " + (string3.equals(string4)));  // false
		
		/*
		   ================================================================================================================
		   After comparison of string3 and string4 with .equals() function, and result is unequal, then
		   both of hasCode are usually different. However, there is a very low possibility to get a SAME hashCode. 
		   If so, we call this scenario is "Hash Collision". 
		   
		   Finally, the value of hashCode is decided by JVM (Java Virtual Machine).		   
		   Notice here, the execution environment we use - Java-11 [JRE 16.0.1]
		   ================================================================================================================
		   若 string3 和 string4 經 .equals() 函式比較結果為不相等，則兩者之 hashCode 通常不相等
		   但也有可能產生相同的 hashCode，這種稱之為『雜湊碰撞』	
		   
		   最後，決定 hashCode 的值，來至於 JVM 版本，本範例使用的是 Java-11 [JRE 16.0.1]
		   ================================================================================================================
		*/
	
		System.out.println("hashCode of string3: " + (string3.hashCode()));
		System.out.println("hashCode of string4: " + (string4.hashCode()));
		
		
	}
}


/*	 
 	Console:
 			object of string1 and string2 if Same? false
			value of string1 and string2 if Same? true
			hashCode of string1: 71338276
			hashCode of string2: 71338276
			value (ignore uppercase) of string3 and string4 if Same? true
			value of string3 and string4 if Same? false
			hashCode of string3: 100890948
			hashCode of string4: 71338276


*/
