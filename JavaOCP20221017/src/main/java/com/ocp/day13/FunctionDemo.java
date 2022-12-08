package com.ocp.day13;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
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
		   @FunctionalInterface
		   public interface BiFunction<T, U, R> {

				// Applies this function to the given arguments.
				     
				// @param t the first function argument
				// @param u the second function argument
				// @return the function result			     
				R apply(T t, U u);			
			}
	    */
		BiFunction<String, Integer, Double> biFunction4Area = (String name, Integer length) -> {
			
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
		
		System.out.println("Area of Square: " + biFunction4Area.apply("Square", 10));
		System.out.println("Circular area: " + biFunction4Area.apply("Circular", 10));

		BiFunction<Double, Double, Double> biFunction4BMI = (Double height, Double weight) -> {
			Double BMI = 0.0;
			BMI =  weight / Math.pow(height / 100, 2);
			return BMI;
		};
		
		BiFunction<Double, Double, Double> biFunction4BMIShorthand = (Double height, Double weight) -> (weight / Math.pow(height / 100, 2));
		
		System.out.println("BMI: " + biFunction4BMI.apply(180.0, 80.0));
		System.out.println("BMI: " + biFunction4BMIShorthand.apply(180.0, 80.0));
		
		
		/*	 		
	 		Since interface of BinaryOperator inherits interface of BiFunction, developer could implement the abstraction method of BiFunction 
	 		even BinaryOperator originally have neither.	
	 		
	 		請讀者留意，BinaryOperator 介面無此抽象方法 "R apply(T t, U u);"，但因 BinaryOperator 繼承 BiFunction 介面，因此覆寫其抽象方法
		*/
		
		BinaryOperator<Double> binaryOperator = (height, weight) -> weight / Math.pow(height / 100, 2);			
		System.out.println("BMI: " + binaryOperator.apply(180.0, 80.0));
		
		
	}
}
