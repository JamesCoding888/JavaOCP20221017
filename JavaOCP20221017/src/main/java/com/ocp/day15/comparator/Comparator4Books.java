package com.ocp.day15.comparator;

/*

	What is the result of Case 1, based on 1) ASCENDING order of compare method ?
	
	A.[A Guide to Java Tour:3.0, Business for OpenAI:1.0, Beginning with Java:2.0]
	
	B.[A Guide to Java Tour:3.0, Beginning with Java:2.0, Business for OpenAI:1.0]
	
	C. A compilation error occurs because the Book class does not override the abstract method compareTo().
	
	D. An Exception is thrown at run time.

	
	What is the result of Case 2, based on 1) ASCENDING order of compare method ?
	
	A.[a:1.0, b:3.0, b:2.0, c:4.0, c:7.0, c:5.0, c:5.0]
	
	B.[a:1.0, b:3.0, b:2.0, c:4.0, c:5.0, c:5.0, c:7.0]
	
	C. A compilation error occurs because the Book class does not override the abstract method compareTo().
	
	D. An Exception is thrown at run time.
	
	
	
	What is the result of Case 1, based on 2) DESCENDING order of compare method ?
	
	A.[Business for OpenAI:1.0, Beginning with Java:2.0, A Guide to Java Tour:3.0]
	
	B.[A Guide to Java Tour:3.0, Beginning with Java:2.0, Business for OpenAI:1.0]
	
	C. A compilation error occurs because the Book class does not override the abstract method compareTo().
	
	D. An Exception is thrown at run time.

	
	What is the result of Case 2, based on 2) DESCENDING order of compare method ?
	
	A.[a:1.0, b:3.0, b:2.0, c:4.0, c:7.0, c:5.0, c:5.0]
	
	B.[c:4.0, c:7.0, c:5.0, c:5.0, b:3.0, b:2.0, a:1.0]
	
	C. A compilation error occurs because the Book class does not override the abstract method compareTo().
	
	D. An Exception is thrown at run time.
	
	
*/

import java.util.Arrays; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparator<Book>{
	
	private String name;
	private double price;
	
	public Book() {
		super();
	}
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	/*
	 	 
	     // Compares its two arguments for order.  Returns a negative integer,
	     // zero, or a positive integer as the first argument is less than, equal
	     // to, or greater than the second.<p>
	     
	     // The implementor must ensure that {@code sgn(compare(x, y)) ==
	     // -sgn(compare(y, x))} for all {@code x} and {@code y}.  (This
	     // implies that {@code compare(x, y)} must throw an exception if and only
	     // if {@code compare(y, x)} throws an exception.)<p>
	     //
	     // The implementor must also ensure that the relation is transitive:
	     // {@code ((compare(x, y)>0) && (compare(y, z)>0))} implies
	     // {@code compare(x, z)>0}.<p>
	     
	     // Finally, the implementor must ensure that {@code compare(x, y)==0}
	     // implies that {@code sgn(compare(x, z))==sgn(compare(y, z))} for all
	     // {@code z}.<p>
	     
	     // It is generally the case, but <i>not</i> strictly required that
	     // {@code (compare(x, y)==0) == (x.equals(y))}.  Generally speaking,
	     // any comparator that violates this condition should clearly indicate
	     // this fact.  The recommended language is "Note: this comparator
	     // imposes orderings that are inconsistent with equals."<p>
	     
	     // In the foregoing description, the notation
	     // {@code sgn(}<i>expression</i>{@code )} designates the mathematical
	     // <i>signum</i> function, which is defined to return one of {@code -1},
	     // {@code 0}, or {@code 1} according to whether the value of
	     // <i>expression</i> is negative, zero, or positive, respectively.
	     
	     // @param o1 the first object to be compared.
	     // @param o2 the second object to be compared.
	     // @return a negative integer, zero, or a positive integer as the
	     //         first argument is less than, equal to, or greater than the
	     //         second.
	     
	     //	***************************** Notice Here ***************************** 
	     // @throws NullPointerException if an argument is null and this
	     //         comparator does not permit null arguments
	     // @throws ClassCastException if the arguments' types prevent them from
	     //         being compared by this comparator.
	     //	***********************************************************************
	      
	     //	int compare(T o1, T o2);
	      
	*/
	@Override
    public int compare(Book b1, Book b2) {
		//  1) ASCENDING order
//		/*          	
        	return b1.name.compareTo(b2.name);  
//      */

		//  2) DESCENDING order		
        /*  
         	return b2.name.compareTo(b1.name);
        */
    }
	
	public String toString() {
        return name + ":" + price;
    }

}

public class Comparator4Books {
	public static void main(String[] args) {
		// Case 1:
		List<Book> books_1 = Arrays.asList(
									new Book("Beginning with Java", 2),    
									new Book("Business for OpenAI", 1),
									new Book("A Guide to Java Tour", 3)									
								  );
		// Case 2:
		List<Book> books_2 = Arrays.asList(
									new Book("c", 4),
									new Book("a", 1), 
									new Book("b", 3),
									new Book("c", 7),
									new Book("c", 5),
									new Book("b", 2),
									new Book("c", 5)
							      );								
		Collections.sort(books_1, new Book());
		Collections.sort(books_2, new Book());
		System.out.println("Case 1: " + books_1); 
		System.out.println("Case 2: " + books_2);
	}
}

















/*
	
	Console of Case1, based on ASCENDING order: 

			Case 1: [A Guide to Java Tour:3.0, Beginning with Java:2.0, Business for OpenAI:1.0]
			Case 2: [a:1.0, b:3.0, b:2.0, c:4.0, c:7.0, c:5.0, c:5.0]

	Console of Case2, based on DESCENDING order:
			Case 1: [Business for OpenAI:1.0, Beginning with Java:2.0, A Guide to Java Tour:3.0]
			Case 2: [c:4.0, c:7.0, c:5.0, c:5.0, b:3.0, b:2.0, a:1.0]
		
*/