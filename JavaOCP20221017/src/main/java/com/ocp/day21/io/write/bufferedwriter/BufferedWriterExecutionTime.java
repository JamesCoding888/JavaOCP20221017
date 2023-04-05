package com.ocp.day21.io.write.bufferedwriter;
/*
 	The provided code is an example of using a BufferedWriter to write data to a file. 
 	
 	It creates a BufferedWriter object that wraps around a FileWriter object to write text to a file.
 	
 	In this code, the BufferedWriter object is created by passing a FileWriter object to its constructor. 
 	
 	The FileWriter object is used to specify the file path and to allow for appending data to the file. 
 	
 	The write() method of the BufferedWriter object is used to write the text to the file, 
 	
 	and the close() method is automatically called when the try block is exited.
 	
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExecutionTime {
	public static void main(String[] args) {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable
		// "pathOfFile"
		String pathOfFile = "/log2.txt";
		// Record the start time
		long startTime = System.nanoTime();
		// code sample
		try (FileWriter fileWriter = new FileWriter(pathOfFolder + pathOfFile, true);
			 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write("This is a sample line of text.\n");
			bufferedWriter.write("This is another line of text.\n");
			bufferedWriter.write("And yet another line of text.\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
		// Record the end time
		long endTime = System.nanoTime();
		// Calculate the elapsed time in milliseconds
		long elapsedTime = (endTime - startTime) / 1000000;
		// Print the elapsed time
		System.out.println("Elapsed time: " + elapsedTime + " ms");
	}
}

/*
	Console:
			Done!
			Elapsed time: 1 ms
*/