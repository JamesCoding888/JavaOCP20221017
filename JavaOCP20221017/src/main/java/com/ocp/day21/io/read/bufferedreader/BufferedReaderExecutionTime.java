package com.ocp.day21.io.read.bufferedreader;

/*
 	
 	This Java program reads data from a text file named "lotto.txt" located in the "data" subdirectory of the directory specified by the variable "root".
 	
 	Both code samples, code sample #1 and code sample #2, achieve the same goal, which is to read the contents of a text file and print it to the console.  
 		
 	However, the efficiency of the code depends on the size of the file being read.
 	
 	Code sample #1:
 		
 		Uses a BufferedReader object to read the file line by line. 
 	
 		This is more efficient than reading the file character by character since the BufferedReader reads a larger chunk of data at a time and 
 		
 		stores it in a buffer for quicker access. 
 	
 		This reduces the number of system calls needed to read the file, resulting in better performance, especially for large files.
 	
 	
 	Code sample #2:
 	
 	 	Reads the file character by character, which is less efficient than reading it line by line. This may result in more system calls, 
 	 	
 	 	which could affect performance negatively, especially for large files.
 	 	
 	 	
 	Summary:
 	
 		1) The code sample #1 is more efficient than code sample #2 for reading large text files.
 		
 		2) This is a good approach to compare the efficiency of different code samples, especially when dealing with large text files. 
 		
 		   However, it is important to note that the elapsed time may vary depending on factors such as the size of the file, 
 		   
 		   the system specifications, and other concurrent processes running on the system. 
 		   
 		   Therefore, it is recommended to test the code samples on different systems and with different file sizes to obtain a more accurate comparison.

		   Overall, this sample code is a good way to compare the efficiency of different code samples for reading large text files.
 		
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExecutionTime {
	public static void main(String[] args) {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable
		// "pathOfFile"
		String pathOfFile = "/lotto.txt";
		// Record the start time
		long startTime4One = System.nanoTime();
		// code sample #1 
		// The program uses a FileReader object to read the file, 
		// and then wraps it in a BufferedReader object for more efficient reading of the file data line by line using the readLine() method.
		try(FileReader fileReader = new FileReader(pathOfFolder + pathOfFile); 
			BufferedReader bufferedReader = new BufferedReader(fileReader)){
			String data = null;
			// Inside the try block, the program uses a while loop to read each line of the file and print it to the console 
			// using the System.out.println() method.
			// The loop continues until it reaches the end of the file, which is indicated by the readLine() method returning null.
			while((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Record the end time
		long endTime4One = System.nanoTime();
		// Calculate the elapsed time in milliseconds
		long elapsedTime4One = (endTime4One - startTime4One) / 1000000;
		// Print the elapsed time
		System.out.println("Elapsed time for code sample #1: " + elapsedTime4One + " ms");
		// Record the start time
		long startTime4Two = System.nanoTime();
		// code sample #2
		try (FileReader fileReader = new FileReader(pathOfFolder + pathOfFile)) {
			char[] buffer = new char[1];
			// The while loop continues until the end of the file is reached, 
			// and each character is printed to the console using 'System.out.print(buffer[0])'.
			while (fileReader.read(buffer) != -1) {
				 System.out.print(buffer[0]);
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		// Record the end time
		long endTime4Two = System.nanoTime();
		// Calculate the elapsed time in milliseconds
        long elapsedTime4Two = (endTime4Two - startTime4Two) / 1000000;
   	    // Print the elapsed time
        System.out.println("Elapsed time for code sample #2: " + elapsedTime4Two + " ms");
	}	
}


/*
	Console:		
			[12, 38, 10, 17, 9, 22]
			[2, 15, 21, 10, 22, 26]
			[41, 14, 23, 6, 21, 9]
			[26, 16, 29, 2, 31, 8]
			[14, 29, 5, 35, 20, 16]
			[23, 3, 19, 18, 9, 31]
			[24, 3, 23, 18, 28, 6]
			[32, 9, 20, 41, 2, 39]
			[39, 28, 9, 10, 15, 33]
			[30, 7, 35, 1, 42, 24]
			Elapsed time for code sample #1: 1 ms
			[12, 38, 10, 17, 9, 22]
			[2, 15, 21, 10, 22, 26]
			[41, 14, 23, 6, 21, 9]
			[26, 16, 29, 2, 31, 8]
			[14, 29, 5, 35, 20, 16]
			[23, 3, 19, 18, 9, 31]
			[24, 3, 23, 18, 28, 6]
			[32, 9, 20, 41, 2, 39]
			[39, 28, 9, 10, 15, 33]
			[30, 7, 35, 1, 42, 24]
			Elapsed time for code sample #2: 10 ms
*/