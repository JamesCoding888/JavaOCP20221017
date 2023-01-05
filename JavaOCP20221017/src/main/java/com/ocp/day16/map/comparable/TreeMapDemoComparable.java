package com.ocp.day16.map.comparable;


/*
 	Introduction of this lecture:
 		
 		1) API of "TreeMap" 
 		
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
				
		2) A TreeMap is a Map implementation that maintains its keys in ASCENDING order, sorted according to the natural ordering of its keys or according to a Comparator provided at TreeMap creation time. 
		
		3) TreeMap is a Red-Black tree based NavigableMap implementation.
		
		4) If TreeMap objects CANNOT be sorted according to natural order, 
		   then developer can use "Comparator" or "Comparable" to define the order 
		   in which the elements are arranged within the Map		   		   		   		
		
		5) TreeMap does NOT allow a null key, because the compareTo() or the compare() method will throw a NullPointerException if element of Key is null
		 
		   
		6) Pros 
				- Provides log(n) time cost for the get, put and remove operations
				- Offers the advantage of maintaining the elements in a sorted order
				- TreeMap can save memory (in comparison to HashMap) because it only uses the amount of memory needed to hold its items, unlike a HashMap which uses contiguous region of memory
				
		7) Cons
				- Generally performance is Slower than HashMap and LinkedHashMap
				- A tree should maintain its balance in order to keep its intended performance, this requires a considerable amount of effort, hence complicates the implementation
				- Since a TreeMap has a more significant locality, we might consider it if we want to access objects that are relatively close to each other according to their natural ordering

		8) The java.util.TreeMap class was published as part of the 1st version of Java, available in all subsequent versions of the Java Development Kit (JDK), which was released in 1996. 
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
		
		// Instantiate an object of HashMap to collect the objects of Key (i.e., Student) and Value (i.e., Exam)
		Map<Integer, Exam> treeMap1 = new TreeMap<>();
		treeMap1.put(student01.getId(), exam01);
		treeMap1.put(student02.getId(), exam02);
		treeMap1.put(student03.getId(), exam03);
		treeMap1.put(student04.getId(), exam04);
		// Exception in thread "main" java.lang.NullPointerException
		/*
			treeMap1.put(null, exam04);
		*/
		// print out based on numeric value of id by ASCENDING order
		System.out.println(treeMap1);
		
		Map<Exam, String> treeMap2 = new TreeMap<>();
		treeMap2.put(exam01, student01.getName());
		treeMap2.put(exam02, student02.getName());
		treeMap2.put(exam03, student03.getName());
		treeMap2.put(exam04, student04.getName());
		
		// print out the score by ASCENDING order : 59 -> 87 -> 88 -> 98
		System.out.println(treeMap2);
	}
}

/*
	Console:
			{1=Exam [subject=Mathematics, score=98], 2=Exam [subject=Microwave Engineering, score=88], 3=Exam [subject=RFIC Design, score=59], 4=Exam [subject=Java-1z0-819, score=87]}
			{Exam [subject=RFIC Design, score=59]=David, Exam [subject=Java-1z0-819, score=87]=Elon, Exam [subject=Microwave Engineering, score=88]=James, Exam [subject=Mathematics, score=98]=Betty}
*/