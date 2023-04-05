package com.ocp.day21.io.write.bufferedwriter;
/*
 	This Java code creates a file named "log.txt" in the directory. 
 	
 	It then writes three lines of text to the file using a BufferedWriter.
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
	public static void main(String[] args) {		
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable
		// "pathOfFile"
		String pathOfFile = "/log.txt";
		// An array of strings named "logs" is created, with three lines of text to be written to the file.
		String[] logs = { "This is a sample line of text.", 
				          "This is another line of text.", 
				          "And yet another line of text." };
		// FileWriter is used to write to the file specified by the "pathOfFolder" and "pathOfFile" variables. 
		// The BufferedWriter is then created using the FileWriter.
		try (FileWriter fileWriter = new FileWriter(pathOfFolder + pathOfFile, true); 
			 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {			
			// A for loop is used to iterate over the "logs" array. 
			for (String log : logs) {
				// For each string in the array, the BufferedWriter writes the string to the file using the "write()" method 				
				// and then adds a new line using the "newLine()" method.
				bufferedWriter.write(log);
				bufferedWriter.newLine(); 
			}
			System.out.println("Done!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
