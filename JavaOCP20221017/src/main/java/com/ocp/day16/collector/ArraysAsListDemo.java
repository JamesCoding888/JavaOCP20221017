package com.ocp.day16.collector;



/*
	Introduction of API - Arrays.asList:
	
	The Arrays.asList() method in Java is used to convert an array to a fixed-size List object. 
	This method is part of the java.util.Arrays class.
	
	When you use Arrays.asList() to convert an array to a List, the resulting List is a view of the original array. 
	This means that any modifications made to the List will be reflected in the original array and vice versa. 
	It provides a convenient way to work with arrays using the functionality provided by the List interface.
	
	However, there are a few important points to note:
	
		1) The returned List is of fixed size, which means you cannot add or remove elements from the List. 
		   If you attempt to do so by calling methods like add(), remove(), or clear() on the List, 
		   JVM (Java Virtual Machine) will throw an UnsupportedOperationException.
	
	
		2) Although you cannot change the size of the List, you can modify individual elements of the array through the List view. 
		   Changes made to a single element of the List will be reflected in the original array.
		   
	
	It's important to understand these limitations when using Arrays.asList(), especially if you need to modify the size or structure of the collection.   
       
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