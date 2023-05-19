package com.ocp.day16.efficiency;
/* 
	The provided code is a Java program that measures the efficiency of different collection and map data structures. 
	
	It performs various data operations on each data structure and measures the time taken for those operations. 
	
	The program then calculates the average duration of the operations for each data structure and prints the results in ascending order of efficiency.
*/
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.stream.Collectors;


public class EfficiencyLab4CollectionAndMap {
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
		double treeMap = getTreeMap();
		double hashMap = getHashMap();
		double linkedHashMap = getLinkedHashMap();
		double enumMap = getEnumMap();
		
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
		      TreeSet : 0.0035730497
		      TreeMap : 0.0042675821
		      EnumMap : 0.0045806866
		LinkedHashMap : 0.0072916025
		      HashMap : 0.0077751162
		LinkedHashSet : 0.0078673433
		   LinkedList : 0.0135191670
		        Queue : 0.0149989025
		         List : 0.0168805846
		PriorityDeque : 0.0172132559
		        Deque : 0.0192887154
		        Stack : 0.0205759593
		       Vector : 0.0211428813


*/