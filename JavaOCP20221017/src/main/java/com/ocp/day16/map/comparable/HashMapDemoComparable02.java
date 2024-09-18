package com.ocp.day16.map.comparable;
/* 
	Introduction to this lesson:
	
	The given code is a Java program that demonstrates the usage of HashMap and stream operations 
	to filter and collect objects based on certain conditions.
	
	1) Interface Entry<K, V>:
	
	   interface Entry<K, V> {
	       
	       * Returns the key corresponding to this entry.
	       *
	       * @return the key corresponding to this entry
	       * @throws IllegalStateException implementations may, but are not
	       *         required to, throw this exception if the entry has been
	       *         removed from the backing map.
	       
	          K getKey();
	       
	       * Returns the value corresponding to this entry. If the mapping
	       * has been removed from the backing map (by the iterator's
	       * {@code remove} operation), the results of this call are undefined.
	       *
	       * @return the value corresponding to this entry
	       * @throws IllegalStateException implementations may, but are not
	       *         required to, throw this exception if the entry has been
	       *         removed from the backing map.
	       
	          V getValue();
	   }
	
	2) To recap the Java 1.8 - Stream API of ".filter", refer to day3.
	
	3) API of "<R> Stream<R> map(Function<? super T, ? extends R> mapper)":
	
	   public interface Stream<T> extends BaseStream<T, Stream<T>> {
	   
	       * Returns a stream consisting of the results of applying the given
	       * function to the elements of this stream.
	       *
	       * <p>This is an <a href="package-summary.html#StreamOps">intermediate
	       * operation</a>.
	       *
	       * @param <R> The element type of the new stream
	       * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
	       *               <a href="package-summary.html#Statelessness">stateless</a>
	       *               function to apply to each element
	       * @return the new stream
	       
	          <R> Stream<R> map(Function<? super T, ? extends R> mapper);
	   }
	
	4) API of "Collector<T, ?, List<T>> toList()":
	
	   public final class Collectors {
	   
	       * Returns a {@code Collector} that accumulates the input elements into a
	       * new {@code List}. There are no guarantees on the type, mutability,
	       * serializability, or thread-safety of the {@code List} returned; if more
	       * control over the returned {@code List} is required, use {@link #toCollection(Supplier)}.
	       *
	       * @param <T> the type of the input elements
	       * @return a {@code Collector} which collects all the input elements into a
	       * {@code List}, in encounter order
	       
	          public static <T> Collector<T, ?, List<T>> toList() {
	          
	             return new CollectorImpl<>(
	                    ArrayList::new, 
	                    List::add,
	                    (left, right) -> { left.addAll(right); return left; },
	                    CH_ID
	             );
	          }
	   }
*/
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map.Entry;
import java.util.function.Function;


public class HashMapDemoComparable02 {
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
		
		System.out.println("******************** Practice 1 ********************");
		// Collect the objects of Exam which "score >= 60" into object of arrayListForQualifiedExam01
		List<Exam> arrayListForQualifiedExam01 = new ArrayList<>();
		for(Entry<Student, Exam> entry : hashMap.entrySet()) {
			System.out.printf("(1) [Key : Value] = [%s : %s] \n", entry.getKey(), entry.getValue());
			if(entry.getValue().getScore() >= 60) {
				System.out.printf("(2) [Key : Value] = [%s : %s] \n", entry.getKey(), entry.getValue());
				arrayListForQualifiedExam01.add(entry.getValue());
			}
		}
		System.out.println("arrayListForQualifiedExam01: " + arrayListForQualifiedExam01);
	
		System.out.println("******************** Practice 2 ********************");
		// Collect the objects of Exam which "score >= 60" into object of arrayListForQualifiedStudent		
		Set<Entry<Student, Exam>> set01 = hashMap.entrySet();
		List<Student> arrayListForQualifiedStudent = 		
				set01.stream()
				     .filter((Map.Entry<Student, Exam> entry) -> entry.getValue().getScore() >= 60)
				     .map(Entry::getKey)
				     .collect(Collectors.toList());
		System.out.println("arrayListForQualifiedStudent: " + arrayListForQualifiedStudent);
		
		System.out.println("******************** Practice 3 ********************");		
		// Collect the objects of Exam which "score >= 60" into object of arrayListForQualifiedExam02
	    List<Exam> arrayListForQualifiedExam02 = 
	    		hashMap.entrySet()
			           .stream()
				       .filter(entry -> entry.getValue().getScore() >= 60)		 
				       .map(Entry::getValue)
					   .collect(Collectors.toList());
	    System.out.println("arrayListForQualifiedExam02: " + arrayListForQualifiedExam02);
	}
}

/*
	Console:
			{Student [id=3, name=David]=Exam [subject=RFIC Design, score=59], Student [id=2, name=James]=Exam [subject=Microwave Engineering, score=88], Student [id=1, name=Betty]=Exam [subject=Mathematics, score=98], Student [id=4, name=Elon]=Exam [subject=Java-1z0-819, score=87]}
			******************** Practice 1 ********************
			(1) [Key : Value] = [Student [id=3, name=David] : Exam [subject=RFIC Design, score=59]] 
			(1) [Key : Value] = [Student [id=2, name=James] : Exam [subject=Microwave Engineering, score=88]] 
			(2) [Key : Value] = [Student [id=2, name=James] : Exam [subject=Microwave Engineering, score=88]] 
			(1) [Key : Value] = [Student [id=1, name=Betty] : Exam [subject=Mathematics, score=98]] 
			(2) [Key : Value] = [Student [id=1, name=Betty] : Exam [subject=Mathematics, score=98]] 
			(1) [Key : Value] = [Student [id=4, name=Elon] : Exam [subject=Java-1z0-819, score=87]] 
			(2) [Key : Value] = [Student [id=4, name=Elon] : Exam [subject=Java-1z0-819, score=87]] 
			arrayListForQualifiedExam01: [Exam [subject=Microwave Engineering, score=88], Exam [subject=Mathematics, score=98], Exam [subject=Java-1z0-819, score=87]]
			******************** Practice 2 ********************
			arrayListForQualifiedStudent: [Student [id=2, name=James], Student [id=1, name=Betty], Student [id=4, name=Elon]]
			******************** Practice 3 ********************
			arrayListForQualifiedExam02: [Exam [subject=Microwave Engineering, score=88], Exam [subject=Mathematics, score=98], Exam [subject=Java-1z0-819, score=87]]


*/