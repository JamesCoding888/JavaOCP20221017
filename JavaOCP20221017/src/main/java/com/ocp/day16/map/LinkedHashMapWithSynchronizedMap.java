package com.ocp.day16.map;
/*
	8) LinkedHashMap implementation is NOT synchronized. 
	   If you are trying to access it from multiple threads and at least one of these threads is likely to change it structurally, 
	   then it MUST be externally synchronized.
			   
       Best to do this at creation for synchronization:	   		
			 		
	 		Map m = Collections.synchronizedMap(new LinkedHashMap());

	
	The sample code demonstrating statements 8):
		
		The code demonstration creates a synchronized version of a LinkedHashMap using Collections.synchronizedMap(). 
	
		The code then perform operations (adding elements) on the synchronized map from multiple threads. 
	
		To ensure thread safety, the code synchronizes the map using synchronized (synchronizedMap) before accessing or modifying it.
	 
*/
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapWithSynchronizedMap {
    public static void main(String[] args) {
        // Create a synchronized version of LinkedHashMap
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap<>());

        // Perform operations on the synchronized map from multiple threads
        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
            	synchronized (synchronizedMap) {
                    synchronizedMap.put("Key" + i, i);
                    System.out.println(Thread.currentThread().getName() + ": Added Key" + i);
                }
            }
        };

        // Create and start multiple threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        Thread thread5 = new Thread(task);
        Thread thread6 = new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}

/*
 
	Console:
			Thread-0: Added Key0
			Thread-0: Added Key1
			Thread-0: Added Key2
			Thread-0: Added Key3
			Thread-0: Added Key4
			Thread-0: Added Key5
			Thread-0: Added Key6
			Thread-0: Added Key7
			Thread-0: Added Key8
			Thread-0: Added Key9
			Thread-3: Added Key0
			Thread-3: Added Key1
			Thread-3: Added Key2
			Thread-3: Added Key3
			Thread-3: Added Key4
			Thread-3: Added Key5
			Thread-3: Added Key6
			Thread-3: Added Key7
			Thread-3: Added Key8
			Thread-3: Added Key9
			Thread-5: Added Key0
			Thread-5: Added Key1
			Thread-5: Added Key2
			Thread-5: Added Key3
			Thread-5: Added Key4
			Thread-5: Added Key5
			Thread-5: Added Key6
			Thread-5: Added Key7
			Thread-5: Added Key8
			Thread-5: Added Key9
			Thread-4: Added Key0
			Thread-4: Added Key1
			Thread-4: Added Key2
			Thread-4: Added Key3
			Thread-4: Added Key4
			Thread-4: Added Key5
			Thread-4: Added Key6
			Thread-4: Added Key7
			Thread-4: Added Key8
			Thread-4: Added Key9
			Thread-2: Added Key0
			Thread-2: Added Key1
			Thread-2: Added Key2
			Thread-2: Added Key3
			Thread-2: Added Key4
			Thread-2: Added Key5
			Thread-2: Added Key6
			Thread-2: Added Key7
			Thread-2: Added Key8
			Thread-2: Added Key9
			Thread-1: Added Key0
			Thread-1: Added Key1
			Thread-1: Added Key2
			Thread-1: Added Key3
			Thread-1: Added Key4
			Thread-1: Added Key5
			Thread-1: Added Key6
			Thread-1: Added Key7
			Thread-1: Added Key8
			Thread-1: Added Key9


*/