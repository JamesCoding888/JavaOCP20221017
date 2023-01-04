package com.ocp.day16.map.comparable;

/* 
	Introduction of this lecture:
		
		1) To recap the previously lecture at package: com.ocp.day15.comparable, 
		   you will learn how to use "Set<Map.Entry<K, V>> entrySet()" to obtain object(s) from Map
		
		2) To review the Java 1.8 - Stream API of mapToInt, at day3, day4 and day5
		
		3) There are different optimized syntaxes at (2) and (3) as following annotations
	
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public class HashMapDemoComparable {
	public static void main(String[] args) {
		// Instantiate objects of Exam
		Exam exam01 = new Exam("Mathematics", 98);
		Exam exam02 = new Exam("Microwave Engineering", 88);
		Exam exam03 = new Exam("RFIC Design", 89);
		Exam exam04 = new Exam("Java-1z0-819", 87);

		// Instantiate objects of Student
		Student student01 = new Student(1, "Betty");
		Student student02 = new Student(2, "James");
		Student student03 = new Student(3, "David");
		Student student04 = new Student(4, "Elon");
		
		// Instantiate an object of HashMap to collect the objects of Key (i.e., Student) and Value (i.e., Exam)
		Map<Student, Exam> hashMap = new HashMap<>();
		hashMap.put(student01, exam01);
		hashMap.put(student02, exam02);
		hashMap.put(student03, exam03);
		hashMap.put(student04, exam04);
		
		System.out.println(hashMap);
		
		// (1) Generally syntax of calculating the total scores of each student as follows
		
		/*
		   public interface Map<K, V> {
		  
	     * Returns a {@link Set} view of the mappings contained in this map.
	     * The set is backed by the map, so changes to the map are
	     * reflected in the set, and vice-versa.  If the map is modified
	     * while an iteration over the set is in progress (except through
	     * the iterator's own {@code remove} operation, or through the
	     * {@code setValue} operation on a map entry returned by the
	     * iterator) the results of the iteration are undefined.  The set
	     * supports element removal, which removes the corresponding
	     * mapping from the map, via the {@code Iterator.remove},
	     * {@code Set.remove}, {@code removeAll}, {@code retainAll} and
	     * {@code clear} operations.  It does not support the
	     * {@code add} or {@code addAll} operations.	     
	     * @return a set view of the mappings contained in this map
	   	 
	   	   		Set<Map.Entry<K, V>> entrySet();
	   	   
	   	   }
	   	   
		 */
		Set<Map.Entry<Student, Exam>> set = hashMap.entrySet();
		Stream<Entry<Student, Exam>> stream = set.stream();
		
		/*
		   public interface Stream<T> extends BaseStream<T, Stream<T>> {
		 	
	     * Returns an {@code IntStream} consisting of the results of applying the
	     * given function to the elements of this stream.
	     *
	     * <p>This is an <a href="package-summary.html#StreamOps">
	     *     intermediate operation</a>.
	     *
	     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
	     *               <a href="package-summary.html#Statelessness">stateless</a>
	     *               function to apply to each element
	     * @return the new stream
	    	
	       		IntStream mapToInt(ToIntFunction<? super T> mapper);
	       		
	       }
	     */
	   
		IntStream intStream = stream.mapToInt((Map.Entry<Student, Exam> entry) -> entry.getValue().getScore());
		int sum1 = intStream.sum();
		System.out.println("sum1: " + sum1);
		
		// (2) Optimized syntax as follows
		int sum2 = hashMap.entrySet()
						  .stream()
						  .mapToInt((Entry<Student, Exam> entry) -> entry.getValue().getScore())
						  .sum();		
		System.out.println("sum2: " + sum2);
				
		// (3) Optimized syntax as follows
		int sum3 = hashMap.entrySet()
						  .stream()
						  .mapToInt(entry -> entry.getValue().getScore())
						  .sum();		
		System.out.println("sum3: " + sum3);		
	}
}

/*
	Console:
			{Student [id=3, name=David]=Exam [subject=RFIC Design, score=89], Student [id=2, name=James]=Exam [subject=Microwave Engineering, score=88], Student [id=1, name=Betty]=Exam [subject=Mathematics, score=98], Student [id=4, name=Elon]=Exam [subject=Java-1z0-819, score=87]}
			sum1: 362
			sum2: 362
			sum3: 362


*/