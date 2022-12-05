package com.ocp.day12.methodClass;

public class LocalVariableInvokedByInnerClass {
	
	private String id; 
	
	public LocalVariableInvokedByInnerClass(String id) {
		
		this.id = id;
		
	}
	
	public String print() {
		
		String number = "1Z0-819";
		
		class ID {
			
			String name = "Java SE"; 
			
			@Override
			public String toString() {
				
				return id + ", " + name + ", " + number;
				
			}		
		}		
		return new ID().toString();
	}
}
