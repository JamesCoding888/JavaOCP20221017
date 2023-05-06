package com.ocp.day13;
/*
	The code we provided demonstrates the usage of the diamond operator (<>) and anonymous classes in Java.
	
	Diamond Operator (<>):
	
		The diamond operator was introduced in Java 7 and is used to infer the type arguments of a generic class instance creation. It allows you to omit the explicit type arguments when the type can be inferred from the context.
		 
*/
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
public class GenericOperatorTest {
	public static void main(String[] args) {
		// Diamond Operator '<>' is not allowed for source level below JDK - 1.7
		Set<Object> hashSet = new HashSet<>();
		// Diamond Operator '<>' cannot be used with anonymous classes for source level below JDK - 1.9 (or 9.0)
		Supplier<String> supplier = new Supplier<>() {
			@Override
			public String get() {
				return "Lambda Expression - Supplier";
			}
		};		
	}
}
