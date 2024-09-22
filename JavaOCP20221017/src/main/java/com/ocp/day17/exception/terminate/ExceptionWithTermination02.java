package com.ocp.day17.exception.terminate;
import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;

public class ExceptionWithTermination02 {
	public static void main(String[] args) {
		try {
			/*
			 * Scenario 1: Path is correct (pathInRightDirection)
			 * - The program reads the file successfully.
			 * - The finally block will execute after try.
			 * 
			 * Scenario 2: Path is incorrect (pathInWrongDirection)
			 * - An IOException will be thrown.
			 * - The catch block will handle the exception and call System.exit(0).
			 * - Since System.exit(0) terminates the program, the finally block will not execute.
			 * 
			 * Note:
			 * - Ensure that the folder "JavaOCP20221017_NIO" exists at the correct location.
			 * - If needed, copy the folder from the package "com.ocp.day17.exception.terminate"
			 *   and paste it into your desktop or the correct path.
			 */
			
			// Define both correct and incorrect file paths
			String pathInRightDirection = "../src/main/java/com/ocp/day17/exception/terminate/JavaOCP20221017_NIO/helloworld.txt";  
			String pathInWrongDirection = ".../JavaOCP20221017_NIO/helloworld.txt"; // Incorrect path for demonstration

			// Attempt to read from the file
			BufferedReader br = new BufferedReader(new FileReader(pathInRightDirection));
			System.out.println(br.readLine()); // Read and print the first line from the file
			br.close(); // Close the BufferedReader after use
		} catch (IOException e) {
			// Handle any IOException (e.g., file not found, incorrect path)
			e.printStackTrace();
			System.exit(0); // Terminate the program
		} finally {
			// This block runs after try/catch unless System.exit(0) is called
			System.out.println("Exiting the program");
		}	
	}
}


/*
	
	Console 1 - pathInRightDirection:
		
		Thank you for using java.nio to read the content ~
		Exiting the program
	
	Console 2 - pathInWrongDirection:
		
		java.io.FileNotFoundException: .../helloworld.txt (No such file or directory)

			
*/