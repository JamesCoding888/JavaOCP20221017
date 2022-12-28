package com.ocp.day15.comparator;

/*

	What is the result of Case 1?
	
	A.[A Guide to Java Tour:3.0, Beginning with Java:2.0]
	
	B.[Beginning with Java:2.0, A Guide to Java Tour:3.0]
	
	C. A compilation error occurs because the Book class does not override the abstract method compareTo().
	
	D. An Exception is thrown at run time.

	
	What is the result of Case 2?
	
	A.[a:1.0, b:2.0, b:3.0, c:4.0, c:5.0, c:5.0]
	
	B.[a:1.0, b:3.0, b:2.0, c:5.0, c:4.0, c:5.0]
	
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
	
	@Override
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }
	
	public String toString() {
        return name + ":" + price;
    }

}

public class Comparator4Books {
	public static void main(String[] args) {
		// Case 1:
		List<Book> books_1 = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
		// Case 2:
		List<Book> books_2 = Arrays.asList(
									new Book("a", 1), 
									new Book("b", 2),
									new Book("b", 3),
									new Book("c", 4),
									new Book("c", 5),
									new Book("c", 5)
							      );								
		Collections.sort(books_1, new Book());
		Collections.sort(books_2, new Book());
		System.out.println("Case 1: " + books_1);
		System.out.println("Case 2: " + books_2);
	}
}

















/*
	
	Console: 

			Case 1: [A Guide to Java Tour:3.0, Beginning with Java:2.0]
			Case 2: [a:1.0, b:2.0, b:3.0, c:4.0, c:5.0, c:5.0]

		
*/