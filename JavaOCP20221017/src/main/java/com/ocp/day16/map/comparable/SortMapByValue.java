package com.ocp.day16.map.comparable;
import java.util.HashMap;   // For storing unsorted map data
import java.util.LinkedHashMap;  // For storing sorted map entries
import java.util.Map;  // For using the Map interface
import java.util.stream.Collectors;  // For collecting the result of the stream operation

public class SortMapByValue {
    public static void main(String[] args) {
        // Original Map
        Map<Integer, Integer> map = new HashMap<>();  // Create a new HashMap to store unsorted key-value pairs
        map.put(1, 1); map.put(2, 3); map.put(3, 2); map.put(4, 0); map.put(5, 1);
        map.put(6, 2); map.put(7, 1); map.put(8, 1); map.put(9, 5); map.put(10, 3);
        map.put(11, 0); map.put(12, 1); map.put(13, 0); map.put(14, 2); map.put(15, 2);
        map.put(16, 2); map.put(17, 1); map.put(18, 2); map.put(19, 1); map.put(20, 2);
        map.put(21, 2); map.put(22, 2); map.put(23, 3); map.put(24, 2); map.put(25, 0);
        map.put(26, 2); map.put(27, 0); map.put(28, 2); map.put(29, 2); map.put(30, 1);
        map.put(31, 2); map.put(32, 1); map.put(33, 1); map.put(34, 0); map.put(35, 2);
        map.put(36, 0); map.put(37, 0); map.put(38, 1); map.put(39, 2); map.put(40, 0);
        map.put(41, 2); map.put(42, 1);

        // Sorting the map by values in descending order
        // Stream the entrySet of the map and sort it by the values
        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()  // Convert the map's entry set into a stream
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())  // Sort by value in descending order
                .collect(Collectors.toMap(  // Collect the result into a LinkedHashMap to maintain insertion order
                    Map.Entry::getKey,      // Map the original key
                    Map.Entry::getValue,    // Map the original value
                    (e1, e2) -> e1,         // In case of duplicate keys, keep the first one (this is not expected here)
                    LinkedHashMap::new));   // Store the result in a LinkedHashMap to maintain the sorted order

        // Output the sorted map
        System.out.println("Sorted Map: " + sortedMap);  // Print the sorted map
    }
}
