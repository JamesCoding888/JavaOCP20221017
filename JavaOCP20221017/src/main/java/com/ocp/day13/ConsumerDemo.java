package com.ocp.day13;
/*
	
	The code we provided demonstrates the use of various functional interfaces in Java 8 and later versions.
	
	These functional interfaces are part of the Java 1.8 functional programming features and can be used in scenarios where you need to pass behavior as arguments to methods or lambda expressions. 
	
	They provide a way to define reusable code blocks and enhance code readability and maintainability.
	
	=================================================================================================================================================================================================
	Key Differences:
		1) BiConsumer allows for two arbitrary types as inputs (T, U), while ObjIntConsumer fixes the second input to be an int, which can improve performance by avoiding autoboxing of integers.
		2) You'd use ObjIntConsumer in scenarios where the second input is always a primitive int to avoid the overhead of boxing/unboxing.
*/
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

/*
	 Console:
	 	Consumer - My name is David
		Consumer - Sum of all elements: 310
		Consumer - Sum of all elements (Shorthand): 310
		BiConsumer - My name is David, Age: 18
		ObjIntConsumer - My name is David, Age: 18
*/
