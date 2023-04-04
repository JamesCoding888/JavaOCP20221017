package com.ocp.day21.analysis;

/*
 	This program analyzes lottery numbers by counting the occurrences of each number in the given input data. 
 	
 	The input data is a string that represents a list of numbers separated by commas and spaces. 
 	
 	The program splits the string into an array of individual number strings, creates a linked hash map with keys as the numbers from 1 to 5 and values as 0, 
 	
 	and then iterates through the array to increment the value of each corresponding key in the map.
 	
 	
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class AnalysisLotto {
    public static void main(String[] args) {
        String data = "12, 38, 10, 17, 9, 22, 2, 15, 21, 10, 22, 26, 41, 14, 23, 6, 21, 9, 26, 16, 29, 2, 31, 8, 14, 29, 5, 35, 20, 16, 23, 3, 19, 18, 9, 31, 24, 3, 23, 18, 28, 6, 32, 9, 20, 41, 2, 39, 39, 28, 9, 10, 15, 33, 30, 7, 35, 1, 42, 24";
        String[] array = data.split(", ");        
        System.out.println("Length of array: " + array.length);
        // A LinkedHashMap is created to store the frequency count of each number from 1 to 42. 
        Map<String, Integer> map = new LinkedHashMap<>();
        // The IntStream class is used to iterate from 1 to 42, 
        // and for each iteration, a new key-value pair is added to the map 
        // with the key as the current number (converted to a string) and the value as 0.
        IntStream.rangeClosed(1, 42).forEach(i -> {
        	// i+"" -> convert int to String type
        	map.put(i+"", 0);
        });
        System.out.println(map); 
        // The program loops through the array of numbers and increments the frequency count 
        // for each number in the map using the put() and get() methods.
        for(String key : array) {
            map.put(key, map.get(key) + 1);
        }
        // The program prints out the length of the input array 
        // and the resulting map with the frequency count of each number.
        System.out.println(map);
    }
}

/*
	Console: 
			Length of array: 60
			{1=0, 2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0, 10=0, 11=0, 12=0, 13=0, 14=0, 15=0, 16=0, 17=0, 18=0, 19=0, 20=0, 21=0, 22=0, 23=0, 24=0, 25=0, 26=0, 27=0, 28=0, 29=0, 30=0, 31=0, 32=0, 33=0, 34=0, 35=0, 36=0, 37=0, 38=0, 39=0, 40=0, 41=0, 42=0}
			{1=1, 2=3, 3=2, 4=0, 5=1, 6=2, 7=1, 8=1, 9=5, 10=3, 11=0, 12=1, 13=0, 14=2, 15=2, 16=2, 17=1, 18=2, 19=1, 20=2, 21=2, 22=2, 23=3, 24=2, 25=0, 26=2, 27=0, 28=2, 29=2, 30=1, 31=2, 32=1, 33=1, 34=0, 35=2, 36=0, 37=0, 38=1, 39=2, 40=0, 41=2, 42=1}


*/