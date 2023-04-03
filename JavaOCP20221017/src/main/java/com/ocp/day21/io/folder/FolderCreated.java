package com.ocp.day21.io.folder;

/*
 	The given code is a Java program that creates a new folder in a specific location on the file system  
 
	if it does not already exist.
*/
import java.io.File;
public class FolderCreated {
	
	public static void main(String[] args) {		 			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		/*
		 	Java File class to create and check for the existence of a folder. 
			It is useful when we need to create a new directory in the file system, 
		    such as for storing data files or configuration files for our Java application.
			
			Then, we create a new File object called "folder" using the pathOfFolder string
		*/
		File folder = new File(pathOfFolder);
		// Check if the folder exists using the exists() method of the File class
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Create Folder successfully!");			
		} else {
			System.out.println("Folder already existed!");
		}
	}	
}
