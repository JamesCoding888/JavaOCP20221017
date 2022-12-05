package com.ocp.day12.InnerClass.method;

public class LocalVariableInvokedByInnerClass {
	
	private String id; 
	
	public LocalVariableInvokedByInnerClass(String id) {
		
		this.id = id;
		
	}
	
	public String print() {
		
		/*
		 	==========================================================================================================================
		 	If local variable (i.e., number) expected to be invoked by Inner class, its value MUST be like characteristic as final, 
		 	that is, value SHALL be constant.
			Please read the content of LocalVariableInvokedByInnerClass$1Inner.java, which was generated by decompiler tool, 
			at package: com.ocp.day12.InnerClass.method.decompiler.
			===========================================================================================================================
			若區域變數 (number)，欲被內部類別調用，其區域變數的值，必須具備 final 的特性，也就是說，此區域變數必須是常數。即使區域變數不宣告為 final，
			編譯器將 LocalVariableInvokedByInnerClass.java 轉換成 LocalVariableInvokedByInnerClass.class 時，則會將 final 補上。
			請參 package: com.ocp.day12.InnerClass.method.decompiler 的 LocalVariableInvokedByInnerClass$1Inner.java，
			此產出的 LocalVariableInvokedByInnerClass$1Inner.java 檔，係經由 decompiler 工具，
			將編譯後產出的 LocalVariableInvokedByInnerClass.class 編譯回 LocalVariableInvokedByInnerClass$1Inner.java 檔，如此可驗證上述所提。 
			===========================================================================================================================
		*/
		String number = "1Z0-819";
		
		class Inner {
			
			String name = "Java SE";  // same as "final String name", plz refer to LocalVariableInvokedByInnerClass$1Inner.java
			
			@Override
			public String toString() {
				
				return id + ", " + name + ", " + number;
				
			}		
		}		
		return new Inner().toString();
	}
}
