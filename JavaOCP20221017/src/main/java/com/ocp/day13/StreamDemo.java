package com.ocp.day13;
/*
	The code we provided demonstrates the use of Java 1.8 - Stream API to perform operations on an array of strings.
	
	Overall, the code calculates and prints the number of framework names in the frameworks array whose lengths are greater than or equal to 10. 
	
	It also prints the length of each framework name as a side effect using the peek operation.
	 
*/
import java.util.Arrays;
import java.util.stream.IntStream;
public class StreamDemo {
	public static void main(String[] args) {
		
		String[] frameworks = {"Spring", "SpringMVC", "SpringBoot", "SpringCloud", "SpringSecurity"};
		
		IntStream intStream = Arrays.stream(frameworks)
									.mapToInt(framework -> framework.length())
									.peek(System.out::println)        // a peek to print out the length of each element
									.filter((int length) -> length >= 10);  // filter out the length of element >= 10
		
		System.out.println("Length of \"elements >= 10\": " + intStream.count());
	}
}
/*

	 Console:
	 		6
			9
			10
			11
			14
			Length of "elements >= 10": 3
	 
*/
