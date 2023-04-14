package com.ocp.day3;
/*
		In this code, two String objects are created: string1 and string2. string1 is created using the new keyword, which creates a new object on the heap, while string2 is created using a string literal, which is stored in the string pool.

		The == operator compares the references of the two objects, and since string1 and string2 refer to different objects, the result of string1 == string2 is false.
		
		The equals() method compares the contents of the two strings, so string1.equals(string2) returns true because both strings contain the same characters.
		
		The intern() method is used to put a String object into the string pool, and it returns a reference to the string pool object. In the code above, string1.intern() returns a reference to the string "Java" in the string pool, which is the same as string2. 
		
		Therefore, string1.intern() == string2 returns true.
		
		It's worth noting that while using intern() can be useful in certain situations, it can also have negative performance implications, so it should be used judiciously.
*/
public class StringDemo2 {

	public static void main(String[] args) {
		String string1 = new String("Java");
		String string2 = "Java";	
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		// name_of_string.intern() -> 放到 String pool 中
		System.out.println(string1.intern() == string2); // Please read the following description of intern() below
	}
}


/*
 	 
 	
     * Returns a canonical representation for the string object.
     * <p>
     * A pool of strings, initially empty, is maintained privately by the
     * class {@code String}.
     * <p>
     * When the intern method is invoked, if the pool already contains a
     * string equal to this {@code String} object as determined by
     * the {@link #equals(Object)} method, then the string from the pool is
     * returned. Otherwise, this {@code String} object is added to the
     * pool and a reference to this {@code String} object is returned.
     * <p>
     * It follows that for any two strings {@code s} and {@code t},
     * {@code s.intern() == t.intern()} is {@code true}
     * if and only if {@code s.equals(t)} is {@code true}.
     * <p>
     * All literal strings and string-valued constant expressions are
     * interned. String literals are defined in section {@jls 3.10.5} of the
     * <cite>The Java Language Specification</cite>.
     *
     * @return  a string that has the same contents as this string, but is
     *          guaranteed to be from a pool of unique strings.
     
   
	public native String intern();

*/

/*
	Console:
		false
		true
		true
*/