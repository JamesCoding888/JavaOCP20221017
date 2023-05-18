package com.ocp.day16.map.comparable;


/*
 	Introduction of this lesson: 
 		
 		1) The constructor of the TreeMap class: 
 		
				public class TreeMap<K,V>{
				     
				     * Constructs a new, empty tree map, using the natural ordering of its
				     * keys.  All keys inserted into the map must implement the {@link
				     * Comparable} interface.  Furthermore, all such keys must be
				     * <em>mutually comparable</em>: {@code k1.compareTo(k2)} must not throw
				     * a {@code ClassCastException} for any keys {@code k1} and
				     * {@code k2} in the map.  If the user attempts to put a key into the
				     * map that violates this constraint (for example, the user attempts to
				     * put a string key into a map whose keys are integers), the
				     * {@code put(Object key, Object value)} call will throw a
				     * {@code ClassCastException}.
				
					   public TreeMap() {
					       comparator = null;
					   }
				}
					
					
		   Explanation:
		   
		   		This constructor initializes a new instance of TreeMap with the natural ordering of its keys. 
		   		It sets the comparator field to null, indicating that the natural ordering of the keys will be used for sorting.

				By default, when no explicit Comparator is provided during the construction of a TreeMap object, it uses the natural ordering of the keys. 
				This means that the key objects inserted into the TreeMap must implement the Comparable interface and provide their own implementation of the compareTo method to determine their ordering.

				If you want to specify a custom comparator for sorting the keys in the TreeMap, you can use the constructor that accepts a Comparator parameter. (see sample code of TreeMapDemoComparator class)
		   				
		2) A TreeMap is a Map implementation that maintains its "keys" in ASCENDING order, sorted according to the natural ordering of its keys or according to a Comparator provided at TreeMap creation time. 
		
		
		3) TreeMap sorts its all entries in natural ordering of the keys, by default. 
		   	- For example of entries in type of Integer, the natural order will be ASCENDING order.
		   	- For the entries in type of String, the natural order will be Alphabetical order.
		    	
		4) TreeMap is implemented using a Red-Black tree data structure and provides the NavigableMap interface.
		   
		   
		5) Red-black tree is a data structure that consists of nodes. For the detail information, please see the following link
		   https://www.baeldung.com/cs/red-black-trees
		   
		6) Here is an animation of Red-Black tree for your reference:
		   https://www.cs.usfca.edu/~galles/visualization/RedBlack.html
		
		
		7) If the keys in TreeMap cannot be sorted based on their natural order, 
		   the developer can provide a custom 'Comparator' or make the key objects implement the 'Comparable' interface to define the order.		   		   		   		
		
		8) TreeMap does not allow null keys because the comparison methods used for sorting, such as compareTo() or compare(), would throw a NullPointerException if a null key is used.
		 
		   
		9) Pros 
				- Provides log(n) time cost for the get, put, and remove operations.
				- Offers the advantage of maintaining the elements in a sorted order.
				- TreeMap can save memory (in comparison to HashMap) because it only uses the amount of memory needed to hold its items, unlike a HashMap which uses a contiguous region of memory.
				
		10) Cons
				- Generally performance is slower than HashMap and LinkedHashMap.
				- A tree should maintain its balance to keep its intended performance, which requires a considerable amount of effort, complicating the implementation.
				- Since a TreeMap has more significant locality, we might consider it if we want to access objects that are relatively close to each other according to their natural ordering.

		11) The java.util.TreeMap class was introduced in Java 1.2 version of Java, available in all subsequent versions of the Java Development Kit (JDK), which was released in 1998. 
		    You can see the following link ( https://en.wikipedia.org/wiki/Treemapping ) on Wikipedia that was "Hard disk space usage visualized in TreeSize (see the image of Tree_Map.png)", software first released in 1996.
		   
		
	Refer to the link as follows:
	https://www.baeldung.com/java-treemap-vs-hashmap
	https://www.baeldung.com/java-treemap
		   
		   
*/

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemoComparable {
	public static void main(String[] args) {
		// Instantiate objects of Exam
		Exam exam01 = new Exam("Mathematics", 98);
		Exam exam02 = new Exam("Microwave Engineering", 88);
		Exam exam03 = new Exam("RFIC Design", 59);
		Exam exam04 = new Exam("Java-1z0-819", 87);

		// Instantiate objects of Student
		Student student02 = new Student(2, "James");
		Student student03 = new Student(3, "David");
		Student student04 = new Student(4, "Elon");
		Student student01 = new Student(1, "Betty"); // swap the position with student02
		
		// Instantiate an object of TreeMap to collect the objects of Key (i.e., Student) and Value (i.e., Exam)
		Map<Integer, Exam> treeMap1 = new TreeMap<>();
		treeMap1.put(student01.getId(), exam01);
		treeMap1.put(student02.getId(), exam02);
		treeMap1.put(student03.getId(), exam03);
		treeMap1.put(student04.getId(), exam04);
		// Exception in thread "main" java.lang.NullPointerException
		/*
			treeMap1.put(null, exam04);
		*/

		// A TreeMap is a Map implementation that maintains its "keys" in ASCENDING order
		// print out based on value of id (i.e., id of Student) by ASCENDING order as 1, 2, 3 and 4
		System.out.println(treeMap1);
		
		Map<Exam, String> treeMap2 = new TreeMap<>();
		treeMap2.put(exam01, student01.getName());
		treeMap2.put(exam02, student02.getName());
		treeMap2.put(exam03, student03.getName());
		treeMap2.put(exam04, student04.getName());

		// A TreeMap is a Map implementation that maintains its "keys" in ASCENDING order, sorted according to a Comparator provided at TreeMap creation time
		// print out based on value of score (i.e., score of Exam) by ASCENDING order as 59, 87, 88 and 98
		System.out.println(treeMap2);
	}
}

/*
	Console:
			{1=Exam [subject=Mathematics, score=98], 2=Exam [subject=Microwave Engineering, score=88], 3=Exam [subject=RFIC Design, score=59], 4=Exam [subject=Java-1z0-819, score=87]}
			{Exam [subject=RFIC Design, score=59]=David, Exam [subject=Java-1z0-819, score=87]=Elon, Exam [subject=Microwave Engineering, score=88]=James, Exam [subject=Mathematics, score=98]=Betty}
*/