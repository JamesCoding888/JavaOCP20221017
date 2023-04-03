package com.ocp.day21.io.file;
/*
 	This program uses the Java File class to create and check for the existence of a file.
	
	It is useful when we need to create a new file in the file system, 
	
	such as for storing data or configuration files for our Java application.
*/
import java.io.File;
import java.io.IOException;
public class FileCreated {
	
	public static void main(String[] args) {			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/file.txt";
		/*
		 	Java File class to create and check for the existence of a folder. 
			It is useful when we need to create a new directory in the file system, 
		    such as for storing data files or configuration files for our Java application.
			
			Then, we create a new File object called "folder" using the pathOfFolder string
		*/
		File file = new File(pathOfFolder + pathOfFile);
		// Check if the file exists using the exists() method of the File class
		if(!file.exists()) {
			try {
				boolean check = file.createNewFile();
				System.out.println("Create file: " + check);
			} 
			// If there is an error while creating the file, 
			// the program will catch the IOException and print the stack trace to the console
			catch (IOException e) {
				e.printStackTrace();
			}
						
		} else {
			System.out.println(pathOfFile + " already existed!");
		}
	}	
}
