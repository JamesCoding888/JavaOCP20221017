package com.ocp.day13;

/*
	This program analyzes lottery numbers by counting how many times each number appears in a given dataset.
	
	The input data is a string of numbers, where each number is separated by a comma and a space.
	
	The program works in the following steps:
	1. Splits the input string into an array of individual number strings.
	2. Initializes a LinkedHashMap where the keys are numbers from 1 to 42, and the values are all set to 0, representing the initial count.
	3. Iterates through the array of numbers, incrementing the count for each number in the map.
	
	Finally, it outputs the frequency of each number, showing how many times each one occurred in the dataset.
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.function.IntConsumer;
public class AnalyzeLotteryNumbers {
    public static void main(String[] args) {
        // Input data: a string representing a list of numbers separated by commas and spaces
        String data = "12, 38, 10, 17, 9, 22, 2, 15, 21, 10, 22, 26, 41, 14, 23, 6, 21, 9, 26, 16, 29, 2, 31, 8, 14, 29, 5, 35, 20, 16, 23, 3, 19, 18, 9, 31, 24, 3, 23, 18, 28, 6, 32, 9, 20, 41, 2, 39, 39, 28, 9, 10, 15, 33, 30, 7, 35, 1, 42, 24";
        
        // Split the data into an array of number strings
        String[] array = data.split(", ");
        
        System.out.println("Length of array: " + array.length); // Prints the length of the array
        
        // Create a LinkedHashMap to store the frequency count of each number from 1 to 42
        Map<String, Integer> map = new LinkedHashMap<>();
        
        // Initialize the map with numbers 1 to 42 as keys, each having a value of 0 (no occurrences yet)
        ///*
        IntStream.rangeClosed(1, 42).forEach(i -> {
            map.put(String.valueOf(i), 0); // Convert int to String and insert into map with value 0
        });
        //*/
        // Use an anonymous class instead of a lambda for IntStream.forEach
        /*
        IntStream.rangeClosed(1, 42).forEach(new IntConsumer() {
            @Override
            public void accept(int i) {
                map.put(String.valueOf(i), 0); // Convert int to String and insert into map with value 0
            }
        });
        */
        // Print the initialized map (all numbers have a value of 0)
        System.out.println("Initial map: " + map); 
        
        // Iterate over the array of number strings
        for (String key : array) {
            // Increment the count for each number in the map
            map.put(key, map.get(key) + 1);
        }
        
        // Print the map after counting the occurrences of each number
        System.out.println("Map with frequency counts: " + map);
    }
}


/*
	Console: 
			Length of array: 60
			{1=0, 2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0, 10=0, 11=0, 12=0, 13=0, 14=0, 15=0, 16=0, 17=0, 18=0, 19=0, 20=0, 21=0, 22=0, 23=0, 24=0, 25=0, 26=0, 27=0, 28=0, 29=0, 30=0, 31=0, 32=0, 33=0, 34=0, 35=0, 36=0, 37=0, 38=0, 39=0, 40=0, 41=0, 42=0}
			{1=1, 2=3, 3=2, 4=0, 5=1, 6=2, 7=1, 8=1, 9=5, 10=3, 11=0, 12=1, 13=0, 14=2, 15=2, 16=2, 17=1, 18=2, 19=1, 20=2, 21=2, 22=2, 23=3, 24=2, 25=0, 26=2, 27=0, 28=2, 29=2, 30=1, 31=2, 32=1, 33=1, 34=0, 35=2, 36=0, 37=0, 38=1, 39=2, 40=0, 41=2, 42=1}


*/