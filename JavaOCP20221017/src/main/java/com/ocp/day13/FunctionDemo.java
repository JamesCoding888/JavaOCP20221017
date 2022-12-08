package com.ocp.day13;

import java.util.function.BiFunction;
import java.util.function.Function;
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
		System.out.println("lengthFromStandardSyntax: " + lengthFromStandardSyntax);
		System.out.println("lengthFromShorthandSyntax: " + lengthFromShorthandSyntax);
		
		
		
		/*
		    // Returns a composed function that first applies this function to
		    // its input, and then applies the {@code after} function to the result.
		    // If evaluation of either function throws an exception, it is relayed to
		    // the caller of the composed function.
		    
		    // @param <V> the type of output of the {@code after} function, and of the
		    //           composed function
		    // @param after the function to apply after this function is applied
		    // @return a composed function that first applies this function and then
		    // applies the {@code after} function
		    // @throws NullPointerException if after is null
		    
		    default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
		        Objects.requireNonNull(after);
		        return (T t, U u) -> after.apply(apply(t, u));
		    }
	    */
		BiFunction<String, Integer, Double> biFunction = (String name, Integer length) -> {
			
			double area = 0.0;
			
			switch(name) {				
				case "Square":
					area = Math.pow(length, 2);
					break;
				
				case "Circular":
					// Circular area formula
					area = (Math.PI) * (Math.pow(length, 2));
					break;
			}
			
			return area;
		};
		
		System.out.println("Area of Square: " + biFunction.apply("Square", 10));
		System.out.println("Circular area: " + biFunction.apply("Circular", 10));
		
	}
}
