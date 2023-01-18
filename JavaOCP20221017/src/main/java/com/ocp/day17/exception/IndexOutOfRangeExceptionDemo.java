package com.ocp.day17.exception;

// IndexOutOfBoundsException extends RuntimeException
class IndexOutOfBoundsExceptionHandler extends IndexOutOfBoundsException {
	
	public IndexOutOfBoundsExceptionHandler() {
		super();
	}
	public IndexOutOfBoundsExceptionHandler(IndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println("The index is out of range of names[]");
	}
}

public class IndexOutOfRangeExceptionDemo {
	public static void main(String[] args) {
		String[] names = { "james", "tim", "tom", "david", "Kathy", "Ketty", "Marry" }; 
		System.out.println(names[0]); // james
		System.out.println(names[6]); // Marry
		/*
			To be noticed here:
				-	Throwing IndexOutOfBoundsException by RuntimeException, is NOT a good programming writer,
					since some of coding won't be executed - e.g., the following statement of "Continue to run..."
				- 	Supposed to do, it's to catch the exception and let the current thread to continue running
					e.g., 
						1. write catch block
						2. write a class of customized exception and extends the IndexOutOfBoundsException 
		*/  
		// Console 1)
		/*
			System.out.println(names[7]);
		*/
		try {
			for(int index = 0 ; index < 8 ; index++) {
				System.out.println(names[index]); 
			}				
		} catch(IndexOutOfBoundsException e) {		
			
			// Console 2)
			/*
				e.printStackTrace();
			*/
			
			// Console 3)
//			/*
				new IndexOutOfBoundsExceptionHandler(e);
//			*/
		}
		System.out.println("Continue to run the following code without terminating the current thread");
	}
}

/*
	Console 1):
				james
				Marry
				Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
					at com.ocp.day17.exception.IndexOutOfRangeExceptionDemo.main(IndexOutOfRangeExceptionDemo.java:25)
	
	Console 2):
				james
				Marry
				james
				tim
				tom
				david
				Kathy
				Ketty
				Marry
				java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
					at com.ocp.day17.exception.IndexOutOfRangeExceptionDemo.main(IndexOutOfRangeExceptionDemo.java:30)
				Continue to run the following code without terminating the current thread
	
	Console 3):
				james
				Marry
				james
				tim
				tom
				david
				Kathy
				Ketty
				Marry
				java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
				The index is out of range of names[]
				Continue to run the following code without terminating the current thread

*/