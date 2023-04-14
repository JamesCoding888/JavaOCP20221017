package com.ocp.day3;
/*
		This program will follow up the previously StringArraydemo.java but updated in Java 1.8
*/
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.function.Function;

public class StringArrayDemo2 {
	public static void main(String[] args) {
		String stringOfName = "Jose, Mary, Jerry, David, Jack";
		System.out.println("stringOfName: " + stringOfName);
		// 利用 split() 來切分字串後，並轉成 String[] 管理
		String[] namesInArray = stringOfName.split(", ");
		System.out.println("namesInArray2String: " + Arrays.toString(namesInArray));
		System.out.println("Length of stringOfName: " + stringOfName.length()); 
		System.out.println("Length of namesInArray: " + namesInArray.length);
		
		// 計算平均名字有幾個字 (取到小數點一位)
		// 請使用 Java 1.8
		// 1. 將 [Jose, Mary, Jerry, David, Jack]
		// 2. 轉 [4, 4, 5, 5, 4]
		// 3. 計算平均
		double avg = Arrays.stream(namesInArray)
						   .mapToInt(namesInArray2String -> namesInArray2String.length()) // 1) Plz following the description below
						   .average() // 2) Plz following the description below
						   .getAsDouble(); //3) Plz following the description below
		System.out.printf("avg = %.1f\n", avg);
	}	
}


/**
	1)
	package java.util.function;    
    
    @FunctionalInterface
	public interface ToIntFunction<T> {
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result   
    	int applyAsInt(T value);
	}
	
	
	2)
	package java.util.stream;
	
	 * @return an {@code OptionalDouble} containing the average element of this
     * stream, or an empty optional if the stream is empty
     *
     	OptionalDouble average();
     
     
     3) 
     package java.util;
     
     * If a value is present, returns the value, otherwise throws
     * {@code NoSuchElementException}.
     *
     * @apiNote
     * The preferred alternative to this method is {@link #orElseThrow()}.
     *
     * @return the value described by this {@code OptionalDouble}
     * @throws NoSuchElementException if no value is present
     
    	public double getAsDouble() {
        	if (!isPresent) {	
            	throw new NoSuchElementException("No value present");
        	}
        	return value;
    	}

 */




/*

	Console:
	stringOfName: Jose, Mary, Jerry, David, Jack
	namesInArray2String: [Jose, Mary, Jerry, David, Jack]
	Length of stringOfName: 30
	Length of namesInArray: 5
	avg = 4.4


*/

