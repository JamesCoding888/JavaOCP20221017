package com.ocp.day16.efficiency;
/*
	The provided code measures the efficiency of different map implementations (TreeMap, HashMap, LinkedHashMap, and EnumMap) 
	
	by performing data operations and calculating the average duration for each implementation. 
	
	The map implementations are ranked based on their average duration, with the most efficient implementation at the top.
	
	Of the console, the EnumMap is the fastest in this particular code execution because it is specifically designed to work with enums as keys.

	Here are a few reasons why EnumMap performs well in this scenario:
		
		1) Memory Efficiency: 
		   EnumMap internally uses an array to store the values, where the index corresponds to the ordinal value of the enum constant. Since enum constants have a fixed and sequential range of values, EnumMap can efficiently utilize the memory by allocating an array of the appropriate size.
		
		2) Efficient Lookup: 
		   As the keys are enums, EnumMap takes advantage of the ordinal values of the enum constants to perform quick lookups. The ordinal values provide direct access to the corresponding array index, allowing for constant-time retrieval.
		
		3) Compact Data Structure: 
		   EnumMap is designed to work specifically with enums, which are finite and known at compile-time. This knowledge allows EnumMap to optimize the data structure for efficient storage and retrieval.
		
		4) Type Safety:  
		   EnumMap provides type safety guarantees at compile-time. It enforces that only keys of the specified enum type can be used, preventing accidental key-value associations with incompatible types.
		
	These factors contribute to the efficiency of EnumMap in this code example compared to other map implementations. However, it's important to note that performance can vary depending on the specific use case and the operations performed. It's always recommended to benchmark and test different implementations to determine the best choice for your specific requirements. 
	
*/

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.EnumMap;

public class EfficiencyLab4Map {
    public static void main(String[] args) {
        double treeMap = getTreeMap();
        double hashMap = getHashMap();
        double linkedHashMap = getLinkedHashMap();
        double enumMap = getEnumMap();

		Map<String, Double> map = new HashMap<>();
		map.put("TreeMap", treeMap);
		map.put("HashMap", hashMap);
		map.put("LinkedHashMap", linkedHashMap);
		map.put("EnumMap", enumMap);			
		
		List<Map.Entry<String, Double>> sortedEntries = 
									map.entrySet()
									   .stream()
									   .sorted(Comparator.comparing(Map.Entry::getValue))
									   .collect(Collectors.toList());

		for (Map.Entry<String, Double> entry : sortedEntries) {
			String objectName = entry.getKey();
			double duration = entry.getValue();
			System.out.printf("%13s : %.10f\n", objectName, duration);
		}
    }
    
    public static double getTreeMap() {
        double sum = 0.0;
        
        // Execute the loop 100 times
        for (int t = 0; t < 100; t++) {
            TreeMap<String, Integer> elementsForAdd = new TreeMap<>();
            long start = System.nanoTime();
            
            // Perform 1,000,000 data operations
            for (int n = 1; n <= 1000000; n++) {
                elementsForAdd.put("1", n);
            }
            
            long stop = System.nanoTime();
            long duration = stop - start;
            sum += duration;
        }
        
        double averageDuration = sum / 100.0;
        double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
        return averageDurationInSeconds;
    }
    
    public static double getHashMap() {
        double sum = 0.0;
        
        // Execute the loop 100 times
        for (int t = 0; t < 100; t++) {
            HashMap<String, Integer> elementsForAdd = new HashMap<>();
            long start = System.nanoTime();
            
            // Perform 1,000,000 data operations
            for (int n = 1; n <= 1000000; n++) {
                elementsForAdd.put("1", n);
            }
            
            long stop = System.nanoTime();
            long duration = stop - start;
            sum += duration;
        }
        
        double averageDuration = sum / 100.0;
        double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
        return averageDurationInSeconds;
    }
    
    public static double getLinkedHashMap() {
        double sum = 0.0;
        
        // Execute the loop 100 times
        for (int t = 0; t < 100; t++) {
            LinkedHashMap<String, Integer> elementsForAdd = new LinkedHashMap<>();
            long start = System.nanoTime();
            
            // Perform 1,000,000 data operations
            for (int n = 1; n <= 1000000; n++) {
                elementsForAdd.put("1", n);
            }
            
            long stop = System.nanoTime();
            long duration = stop - start;
            sum += duration;
        }
        
        double averageDuration = sum / 100.0;
        double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
        return averageDurationInSeconds;
    }
    
    public static double getEnumMap() {
        double sum = 0.0;
        
        // Execute the loop 100 times
        for (int t = 0; t < 100; t++) {
            EnumMap<DayOfWeek, Integer> elementsForAdd = new EnumMap<>(DayOfWeek.class);
            long start = System.nanoTime();
            
            // Perform 1,000,000 data operations
            for (int n = 1; n <= 1000000; n++) {
                elementsForAdd.put(DayOfWeek.MONDAY, n);
            }
            
            long stop = System.nanoTime();
            long duration = stop - start;
            sum += duration;
        }
        
        double averageDuration = sum / 100.0;
        double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
        return averageDurationInSeconds;
    }
    
	enum DayOfWeek {		
		MONDAY(1), 
		TUESDAY(2), 
		WEDNESDAY(3), 
		THURSDAY(4), 
		FRIDAY(5), 
		SATURDAY(6), 
		SUNDAY(7);

		private final int value;

		private DayOfWeek(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}
}
/*

	Console:
			EnumMap : 0.0031022946
			TreeMap : 0.0047116058
			LinkedHashMap : 0.0074022708
			HashMap : 0.0074841495

*/