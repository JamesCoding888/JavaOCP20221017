package com.ocp.day13;

import java.util.function.Function;
import java.util.Arrays;
public class FunctionDemo {

	public static void main(String[] args) {
		
		/*
			@FunctionalInterface
			public interface Function<T, R> {
			    // Applies this function to the given argument.
			     
			    // @param t the function argument
			    // @return the function result
			     
			    R apply(T t);
		*/
		Function<String, Integer> functionInStandardSyntax = (String string) -> { return string.split(" ").length; };
		Function<String, Integer> functionInShorthandSyntax = string -> string.split(" ").length;
		Integer lengthFromStandardSyntax = functionInStandardSyntax.apply("Happy Ending 2022");
		Integer lengthFromShorthandSyntax = functionInShorthandSyntax.apply("Happy Ending 2022");
		System.out.println(lengthFromStandardSyntax);
		System.out.println(lengthFromShorthandSyntax);
		
		
		
	}
}
