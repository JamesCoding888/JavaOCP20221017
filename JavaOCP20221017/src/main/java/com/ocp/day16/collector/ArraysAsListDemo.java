package com.ocp.day16.collector;

import java.util.Arrays;
import java.util.List;
public class ArraysAsListDemo {
	public static void main(String[] args) {
		
		
		/*
		   Arrays.asList() is a method in the Java programming language that converts an array to a fixed-size list.
		   It is a part of the java.util.Arrays class and takes an array as its argument and returns a List view of the specified array. 
		   This list is backed by the array, so any changes made to the list will also be reflected in the array and vice versa. The returned list is fixed-size, so it cannot be resized or modified. 
		*/
		/*
	     * Returns a fixed-size list backed by the specified array. Changes made to
	     * the array will be visible in the returned list, and changes made to the
	     * list will be visible in the array. The returned list is
	     * {@link Serializable} and implements {@link RandomAccess}.
	     *
	     * <p>The returned list implements the optional {@code Collection} methods, except
	     * those that would change the size of the returned list. Those methods leave
	     * the list unchanged and throw {@link UnsupportedOperationException}.
	     *
	     * @apiNote
	     * This method acts as bridge between array-based and collection-based
	     * APIs, in combination with {@link Collection#toArray}.
	     *
	     * <p>This method provides a way to wrap an existing array:
	     * <pre>{@code
	     *     Integer[] numbers = ...
	     *     ...
	     *     List<Integer> values = Arrays.asList(numbers);
	     * }</pre>
	     *
	     * <p>This method also provides a convenient way to create a fixed-size
	     * list initialized to contain several elements:
	     * <pre>{@code
	     *     List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
	     * }</pre>
	     *
	     * <p><em>The list returned by this method is modifiable.</em>
	     * To create an unmodifiable list, use
	     * {@link Collections#unmodifiableList Collections.unmodifiableList}
	     * or <a href="List.html#unmodifiable">Unmodifiable Lists</a>.
	     *
	     * @param <T> the class of the objects in the array
	     * @param a the array by which the list will be backed
	     * @return a list view of the specified array
	     * @throws NullPointerException if the specified array is {@code null}
	     
		   @SafeVarargs
		   @SuppressWarnings("varargs")
		   public static <T> List<T> asList(T... a) {
		       return new ArrayList<>(a);
		   }
		   
	    */
		List<String> list = Arrays.asList(".NET", ".java", ".jar");
		System.out.println(list); // [.NET, .java, .jar]
		
		// Exception in thread "main" java.lang.UnsupportedOperationException
		/*
			list.add("add");
			list.remove(0);		
		*/
		System.out.println(list.contains(".NET")); // true
		
		
	}
}
