package com.ocp.day16.map.comparable;


/*
	Introduction to this lesson:
	
	The code provided demonstrates the usage of a HashMap to associate Student objects with 
	their corresponding Exam objects. It then converts the HashMap into a Map that maps 
	student names to their exam scores using Java 8 streams and collectors.
	
	1) API of "public static <T, K, U> Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper, 
	                                                                   Function<? super T, ? extends U> valueMapper)"
	
	   public final class Collectors {
	       
	       * Returns a {@code Collector} that accumulates elements into a
	       * {@code Map} whose keys and values are the result of applying the provided
	       * mapping functions to the input elements.
	       *
	       * <p>If the mapped keys contain duplicates (according to
	       * {@link Object#equals(Object)}), an {@code IllegalStateException} is
	       * thrown when the collection operation is performed.  If the mapped keys
	       * might have duplicates, use {@link #toMap(Function, Function, BinaryOperator)}
	       * instead.
	       *
	       * <p>There are no guarantees on the type, mutability, serializability,
	       * or thread-safety of the {@code Map} returned.
	       *
	       * @apiNote
	       * It is common for either the key or the value to be the input elements.
	       * In this case, the utility method
	       * {@link java.util.function.Function#identity()} may be helpful.
	       * For example, the following produces a {@code Map} mapping
	       * students to their grade point average:
	       * <pre>{@code
	       * Map<Student, Double> studentToGPA
	       *   = students.stream().collect(
	       *     toMap(Function.identity(),
	       *           student -> computeGPA(student)));
	       * }</pre>
	       * And the following produces a {@code Map} mapping a unique identifier to
	       * students:
	       * <pre>{@code
	       * Map<String, Student> studentIdToStudent
	       *   = students.stream().collect(
	       *     toMap(Student::getId,
	       *           Function.identity()));
	       * }</pre>
	       *
	       * @implNote
	       * The returned {@code Collector} is not concurrent.  For parallel stream
	       * pipelines, the {@code combiner} function operates by merging the keys
	       * from one map into another, which can be an expensive operation.  
	       * If it is not required that results are inserted into the {@code Map} 
	       * in encounter order, using {@link #toConcurrentMap(Function, Function)}
	       * may offer better parallel performance.
	       *
	       * @param <T> the type of the input elements
	       * @param <K> the output type of the key mapping function
	       * @param <U> the output type of the value mapping function
	       * @param keyMapper a mapping function to produce keys
	       * @param valueMapper a mapping function to produce values
	       * @return a {@code Collector} which collects elements into a {@code Map}
	       * whose keys and values are the result of applying mapping functions to
	       * the input elements
	       *
	       * @see #toMap(Function, Function, BinaryOperator)
	       * @see #toMap(Function, Function, BinaryOperator, Supplier)
	       * @see #toConcurrentMap(Function, Function)
	       
	       public static <T, K, U>
	       Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> keyMapper,
	                                        Function<? super T, ? extends U> valueMapper) {
	           
	           return new CollectorImpl<>(HashMap::new,
	                                      uniqKeysMapAccumulator(keyMapper, valueMapper),
	                                      uniqKeysMapMerger(),
	                                      CH_ID);
	       }
	   }   
*/
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;
public class HashMapDemoComparable03 {
	public static void main(String[] args) {
		// Instantiate objects of Exam
		Exam exam01 = new Exam("Mathematics", 98);
		Exam exam02 = new Exam("Microwave Engineering", 88);
		Exam exam03 = new Exam("RFIC Design", 59);
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
		
		Map<String, Integer> map = hashMap.entrySet()
										  .stream()
										  .collect(Collectors.toMap(
														 (Entry<Student, Exam> entry) -> entry.getKey().getName(),
											             (Entry<Student, Exam> entry) -> entry.getValue().getScore()
												  ));
		System.out.println(map);
	}
}

/*
	Console:
			{Student [id=3, name=David]=Exam [subject=RFIC Design, score=59], Student [id=2, name=James]=Exam [subject=Microwave Engineering, score=88], Student [id=1, name=Betty]=Exam [subject=Mathematics, score=98], Student [id=4, name=Elon]=Exam [subject=Java-1z0-819, score=87]}
			{James=88, Betty=98, Elon=87, David=59}


*/