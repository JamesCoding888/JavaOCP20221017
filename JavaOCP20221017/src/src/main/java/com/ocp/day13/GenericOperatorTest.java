package com.ocp.day13;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
public class GenericOperatorTest {
	public static void main(String[] args) {
		// '<>' operator is not allowed for source level below JDK - 1.7
		Set<Object> hashSet = new HashSet<>();
		// '<>' cannot be used with anonymous classes for source level below JDK - 1.9 (or 9.0)
		Supplier<String> supplier = new Supplier<>() {
			@Override
			public String get() {
				return "Lambda Expression - Supplier";
			}
		};		
	}
}
