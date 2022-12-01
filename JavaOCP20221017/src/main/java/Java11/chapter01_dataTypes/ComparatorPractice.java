package Java11.chapter01_dataTypes;

/*
 
  	Following the programming below, how many does compile successfully? 
  	Please give your answers by upper-case letter.

*/

import java.util.Comparator;
public class ComparatorPractice<T> {  

	// A.
	Comparator<String> c1 = (j, k) -> 0;
	// B.
	Comparator<String> c2 = (String j, String k) -> 0;
	// C.
	Comparator<String> c3 = (Integer j, var k) -> 0;
	// D.
	Comparator<String> c4 = (var j, var k) -> 0;
	// E.
	Comparator<String> c5 = (var j, k) -> 0;
	// F.
	Comparator<String> c6 = (var j, String k) -> 0;
	// G.
	Comparator<Integer> c7 = (Integer j, Integer k) -> 0;
	// H.	
	Comparator<T> c8 = (T j, T k) -> 0;
}









/*
 	Answer: A, B, D, G, H
 	
 	
	本節說明功能型介面 API - Comparator 
	此 API 設計者如下
	 * @author  Josh Bloch
	 * @author  Neal Gafter
	 * @see Comparable
	 * @see java.io.Serializable
	 * @since 1.2
	
	讀者可能疑惑，Comparator 介面類別中有此 equals 函式方法，這樣不就有兩個抽象方法，違背了功能型介面的規則嗎
	
	請參 function interface 英文定義如下 [出處 -> "https://mkyong.com/java8/is-comparator-a-function-interface-but-it-has-two-abstract-methods/"]:
	
		Definition of functional interface 
		Conceptually, a functional interface has exactly one abstract method. 
		
		Since default methods have an implementation, they are not abstract. 
		
		If an interface declares an abstract method overriding one of the public methods of java.lang.Object, 
		that also does not count toward the interface’s abstract method count 
		since any implementation of the interface will have an implementation from java.lang.Object or elsewhere.
		
		
	@FunctionalInterface 
	public interface Comparator<T> {
		  
		  int compare(T o1, T o2); // 等同 public abstract int compare(T o1, T o2);
		  		 		  
		  boolean equals(Object obj); // 等同 public abstract boolean equals(Object obj);
		  
		  ...
	}
	
	
*/
