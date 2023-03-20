package com.ocp.day20.closeable;
/*
	"Closeable" is a term used in software development that refers to an interface in Java programming language. 
	
	The Closeable interface defines a single method, close(), that is used to release any resources that were acquired by the object implementing the interface. 
	
	The resources that need to be released could include open files, network connections, or database connections.

	Classes that implement the Closeable interface are designed to be used with a try-with-resources statement,  which ensures that the resources are automatically released 
	
	when the block of code that uses them is exited, either normally or due to an exception being thrown. 
	
	
	
*/
public class MainClose {
	public static void main(String[] args) {		
		// Resource leak: 'closeImpl' is never closed, then caller need to invoke .close()
		/*
			try {		
				CloseImpl closeImpl = new CloseImpl();
				closeImpl.printData();
				closeImpl.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		*/

		// try-with-resources statement was introduced in Java 1.7 as a convenient 
		// and safe way to handle resource management in Java programs
		try (CloseImpl closeImpl = new CloseImpl();) {		
			closeImpl.printData();
			// Don't need to invoke .close() since try-with-resources statement will execute .close(), automatically			
			// closeImpl.close(); 			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
	Console:
			Start Connection
			Acquire data
			java.lang.Exception: exception
			Close Connection
				at com.ocp.day20.closeable.CloseImpl.printData(CloseImpl.java:12)
				at com.ocp.day20.closeable.MainClose.main(MainClose.java:5)
			
*/