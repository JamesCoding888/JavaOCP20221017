package com.ocp.day21.io.temporary;
/*
 	This Java program creates a temporary file using the createTempFile() method of the File class.
 	
 	Overall, this program demonstrates how to create a temporary file using the createTempFile() method of the File class, 
 	
 	and how to check whether the file was successfully created.
 	
*/


import java.io.File;
import java.io.IOException;

public class TemporaryFileCreated {
	public static void main(String[] args) {			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		// Define two variables prefix and suffix, which are used to define the name and file extension of the temporary file to be created
		String prefix = "temp";
		String suffix = ".txt";
		// Create a File object for the directory where the temporary file will be created using new File(pathOfFolder)
		// and assigns it to the variable directoryOfTemp.
		File directoryOfTemp = new File(pathOfFolder);
		try {
			// Create a temporary file, with the prefix "temp" and the file extension ".txt" in the directory specified by directoryOfTemp, 
			// using File.createTempFile(prefix, suffix, directoryOfTemp)
			File temp = File.createTempFile(prefix, suffix, directoryOfTemp);
			// Check whether the file exists using the exists() method of the File class and prints a message indicating whether the file was successfully created or not
			System.out.printf("'%s' created %s%s: %b\n", pathOfFolder, prefix, suffix, temp.exists());			
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}	
}
