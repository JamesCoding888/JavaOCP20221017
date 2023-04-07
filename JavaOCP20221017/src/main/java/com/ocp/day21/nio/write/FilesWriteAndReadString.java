package com.ocp.day21.nio.write;

/*
 	This Java program demonstrates how to use the java.nio.file.Files class to write a string to a file and then read the same file.
	
	The java.nio.file.Files class in Java 11, introduced the new writeString and readString methods for writing and reading a string to/from a file, respectively.
	
	Both methods throw an IOException if an error occurs while accessing the file.
	
		1) The writeString method creates a new file at the specified path using the Files.createFile(path) method, and then writes the provided string to the file using the CharSequence argument. 
		
		   The StandardOpenOption.WRITE option is used to open the file for writing.
	
		2) The readString method reads the contents of the file at the specified path as a string and returns the result.


*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesWriteAndReadString {
    public static void main(String[] args) throws IOException {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/Files_writeString.txt";
        Path path = Paths.get(pathOfFolder + pathOfFile);
        // write
        String charSequenceString = "Java 11 - Path java.nio.file.Files.writeString(Path path, CharSequence csq, OpenOption... options) throws IOException"; 
        /*
	         The Files.writeString method is used to create a new file with the specified path and filename, 
	         and to write the provided string to this file.
	         
	         The StandardOpenOption.WRITE option is used to indicate that the file should be opened for writing.
	         
	         Note:
	          	
	          	If the file already exists at the specified path, the createFile method will throw a FileAlreadyExistsException. 
	         	In this case, you can either delete the file before running the program again or use a different filename.
        */        
        Files.writeString(Files.createFile(path), charSequenceString, StandardOpenOption.WRITE);
        System.out.println("\'" + charSequenceString + "\'" + " wrote into " + path.toAbsolutePath());
        // The Files.readString method is then used to read the contents of the file at the specified path. 
        String string = Files.readString(path);
        System.out.println("Read: " + string);
    }
}

/*
	Console:
			'Java 11 - Path java.nio.file.Files.writeString(Path path, CharSequence csq, OpenOption... options) throws IOException' wrote into /Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/Files_writeString.txt
			Read: Java 11 - Path java.nio.file.Files.writeString(Path path, CharSequence csq, OpenOption... options) throws IOException
			

*/