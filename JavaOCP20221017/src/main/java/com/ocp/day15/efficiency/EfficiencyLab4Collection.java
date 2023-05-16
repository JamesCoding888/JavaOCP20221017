package com.ocp.day15.efficiency;
/* 
	
	The subject of this code is to compare the efficiency of different collection classes in Java. 
	
	It measures the time taken to perform 1,000,000 data operations (adding elements) on various collection classes and presents the results in ascending order based on the average duration. 
	
	The code aims to provide insights into the performance characteristics of different collection classes, allowing developers to make informed decisions when choosing the appropriate collection class for their specific requirements.
	 
*/
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.stream.Collectors;

public class EfficiencyLab4Collection {
	public static void main(String[] args) {
		double vector = getVector();
		double stack = getStack();
		double treeset = getTreeSet();
		double linkedhashset = getLinkedHashSet();
		double queue = getQueue();
		double deque = getArrayDeque();
		double prioritydeque = getPriorityDeque();
		double array = getList();
		double linkedlist = getLinkedList();

		Map<String, Double> map = new HashMap<>();
		map.put("Vector", vector);
		map.put("Stack", stack);
		map.put("TreeSet", treeset);
		map.put("LinkedHashSet", linkedhashset);
		map.put("Queue", queue);		
		map.put("Deque", deque);
		map.put("PriorityDeque", prioritydeque);
		map.put("List", array);
		map.put("LinkedList", linkedlist);		

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

	public static double getList() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			List<String> elementsForAdd = new ArrayList<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.add("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}

	public static double getLinkedList() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			LinkedList<String> elementsForAdd = new LinkedList<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.add("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}

	public static double getQueue() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			Queue<String> elementsForAdd = new LinkedList<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.offer("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}

	public static double getStack() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			Stack<String> elementsForAdd = new Stack<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.push("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}
	
	public static double getPriorityDeque() {
	    double sum = 0.0;
	    // Execute the loop 100 times
	    for (int t = 0; t < 100; t++) {
	    	PriorityQueue<String> elementsForAdd = new PriorityQueue<>();
	    	long start = System.nanoTime();
	        // Perform 1,000,000 data operations
	        for (int n = 1; n <= 1000000; n++) {
	            elementsForAdd.add("1");
	        }
	        long stop = System.nanoTime();
	        long duration = stop - start;
	        sum += duration;
	    }

	    double averageDuration = sum / 100.0;
	    double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
	    return averageDurationInSeconds;
	}
	
	public static double getArrayDeque() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			Deque<String> elementsForAdd = new ArrayDeque<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.add("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}

	public static double getLinkedHashSet() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			LinkedHashSet<String> elementsForAdd = new LinkedHashSet<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.add("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}

	public static double getVector() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			Vector<String> elementsForAdd = new Vector<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.add("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}

	public static double getTreeSet() {
		double sum = 0.0;
		// Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			TreeSet<String> elementsForAdd = new TreeSet<>();
			long start = System.nanoTime();
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				elementsForAdd.add("1");
			}
			long stop = System.nanoTime();
			long duration = stop - start;
			sum += duration;
		}

		double averageDuration = sum / 100.0;
		double averageDurationInSeconds = averageDuration * Math.pow(10, -9);
		return averageDurationInSeconds;
	}
}


/*

	Console:
 
				      TreeSet : 0.0057239325
				LinkedHashSet : 0.0101092216
				        Queue : 0.0318593487
				   LinkedList : 0.0325428442
				         List : 0.0333915363
				        Deque : 0.0357036196
				        Stack : 0.0367782946
				       Vector : 0.0375725075
				PriorityDeque : 0.0376614041


*/