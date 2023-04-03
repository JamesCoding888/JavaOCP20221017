package com.ocp.day21.io.directory;
/*
 	This Java program checks whether the specified paths represent directories or files 
 	
 	using the isDirectory() and isFile() methods of the File class.
 	
 	Overall, this program demonstrates how to use the isDirectory() and isFile() methods of the File class 
 	
 	to check whether a path represents a directory or a file.
*/
import java.io.File; 
public class Directory {
	
	public static void main(String[] args) {			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/file.txt";

		String directoryCheck = pathOfFolder;
		// Create a File object for the directory specified by pathOfFolder using new File(directoryCheck), 
		// where directoryCheck is set to pathOfFolder.
		File filehCheck = new File(directoryCheck);
		// Use isDirectory() and isFile() to check whether the object is a directory or a file, and prints the results to the console
		System.out.printf("'%s' is directory: %b\n", directoryCheck, filehCheck.isDirectory());
		System.out.printf("'%s' is file: %b\n", directoryCheck, filehCheck.isFile());
		// Create a File object for the file specified by directoryCheck using new File(directoryCheck), 
		// where directoryCheck is set to pathOfFolder + pathOfFile.
		directoryCheck = pathOfFolder + pathOfFile;
		filehCheck = new File(directoryCheck);
		System.out.printf("'%s' is directory: %b\n", directoryCheck, filehCheck.isDirectory());
		System.out.printf("'%s' is file: %b\n", directoryCheck, filehCheck.isFile());
	}	
}