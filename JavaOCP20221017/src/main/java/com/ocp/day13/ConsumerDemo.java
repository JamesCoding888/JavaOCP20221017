package com.ocp.day13;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer<String> consumerString = (String string) -> System.out.println("Consumer - My name is " + string);
		
		consumerString.accept("David");
		
		
		Consumer<Integer[]> consumerArray = (Integer[] elements) -> {
			
			int sum = Arrays.stream(elements).mapToInt((Integer element) -> element.intValue()).sum();
			int sumShorthand = Arrays.stream(elements).mapToInt(Integer::intValue).sum();
			System.out.println("Consumer - Sum of all elements: " + sum);
			System.out.println("Consumer - Sum of all elements (Shorthand): " + sumShorthand);
			
		};
		
		consumerArray.accept(new Integer[] {10, 30, 80, 90, 100});
		
		BiConsumer<String, Integer> biConsumer = (String name, Integer age) -> System.out.println("BiConsumer - My name is " + name + ", " + "Age: " + age);
		/*
			@FunctionalInterface
			public interface BiConsumer<T, U> {

		    
		    // Performs this operation on the given arguments.
		    
		    // @param t the first input argument
		    // @param u the second input argument
			void accept(T t, U u);
		*/
		    
		biConsumer.accept("David", 18);
		
		
		ObjIntConsumer<String> objIntConsumer = (String name, int age) -> System.out.println("ObjIntConsumer - My name is " + name + ", " + "Age: " + age);
		/*
			@FunctionalInterface
			public interface ObjIntConsumer<T> {

		    
		    // Performs this operation on the given arguments.
		     
		    // @param t the first input argument
		    // @param value the second input argument
			void accept(T t, int value);
		*/
		 
		objIntConsumer.accept("David", 18);
	}
}
