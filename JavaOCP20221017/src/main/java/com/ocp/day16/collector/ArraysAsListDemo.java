package com.ocp.day16.collector;
/*
	Introduction to API - Arrays.asList:
	
	The `Arrays.asList()` method in Java is used to convert an array into a fixed-size List object. 
	This method is part of the `java.util.Arrays` class.
	
	Key characteristics of Arrays.asList():
	
	1) The list returned by `Arrays.asList()` is backed by the original array, meaning changes to the list will 
	   reflect in the array, and vice versa.
	
	2) The size of the list is fixed, so you cannot add or remove elements. Attempting to do so by calling 
	   `add()`, `remove()`, or `clear()` will throw an `UnsupportedOperationException`.
	
	3) You *can* modify individual elements within the list, and the changes will propagate to the original array.
	
	4) For a fully unmodifiable list, you can use alternatives like `Collections.unmodifiableList()`, 
	   `List.copyOf()`, or `ImmutableList.copyOf()`.
	
	Usage Considerations:
	- The `Arrays.asList()` method offers a convenient way to work with array-based data using List operations.
	- It's useful when you need a fixed-size, modifiable list view of an array but be cautious about 
	  the limitations around resizing.
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraysAsListDemo {
	public static void main(String[] args) {

		String[] string1 = {".NET", ".java", ".jar"};
		String[] string2 = {".NET", ".java", ".jar"};

		/* Coming the statement of Arrays.asList below, it's from Oracle's document.
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
		List<String> list = Arrays.asList(string1);
		/*
		 	HereinAfter, object of stringList is an independently copy of the array (i.e., this object of stringList will NOT affect the original array). 
		 	Developer can proceed all capabilities of a regular ArrayList (e.g., method of add or remove).
		*/
		List<String> stringList = new ArrayList<>(Arrays.asList(string2));
	
		
		// print out the elements of list - [.NET, .java, .jar]
		System.out.println(list); 
		// print out the elements of stringList - [.NET, .java, .jar]
		System.out.println(stringList); 
		
		// Return the object that represents the runtime class of this object 
		// i.e., class java.util.Arrays$ArrayList 		
		System.out.println(list.getClass());  
		// Return the object that represents the runtime class of this object
		// i.e., class java.util.ArrayList
		System.out.println(stringList.getClass());  
		

		// Since an object of list returned an ArrayList with only wrapped an existing array, 
		// and also API of Arrays.asList does NOT implement the method of add, remove or clear.
		// If developer invoke the method of them, the JVM will throw an Exception in thread "main" java.lang.UnsupportedOperationException
		/*
			list.add("add");
			list.remove(0);		
			list.clear();
		*/
		
		// Because object of stringList including all capabilities of ArrayList, then invoking the method of add and remove are successful
		stringList.add("Microsoft Power BI");
		stringList.remove(2); // the element of ".jar" being removed
		
		/*		   
           public interface List<E> extends Collection<E> {
           		
           	// Replaces the element at the specified position in this list with the
            // specified element (optional operation).
        	E set(int index, E element);
           		
           }          
		*/
		list.set(0, "python");		
		stringList.set(0, "python");
		
		// list: [python, .java, .jar]
		System.out.println("list: " + list);
		// stringList: [python, .java, .jar, Microsoft Power BI]
		System.out.println("stringList: " + stringList);
		// To be noticed here, the elements itself in original array (i.e., list) were MODIFIED
		for(String valueOfString1 : string1) {
			System.out.printf("%s ", valueOfString1);	
		}
		System.out.println();
		// To be noticed here, the elements itself in original array (i.e., stringList) were NOT MODIFIED
		for(String valueOfString2 : string2) {
			System.out.printf("%s ", valueOfString2);	
		} 
		System.out.println();
		
		
		// The element of ".NET" is NOT existence 
		// false
		System.out.println("list.contains(\".NET\"): " + list.contains(".NET")); 
		// false
		System.out.println("stringList.contains(\".NET\"): " +  stringList.contains(".NET"));
		
	}
}

/*
	Console:
			[.NET, .java, .jar]
			[.NET, .java, .jar]
			class java.util.Arrays$ArrayList
			class java.util.ArrayList
			list: [python, .java, .jar]
			stringList: [python, .java, Microsoft Power BI]
			python .java .jar 
			.NET .java .jar 
			list.contains(".NET"): false
			stringList.contains(".NET"): false


*/