package com.ocp.day21.nio.read;
/*
 	This Java program demonstrates how to read and print the lines of a text file using the Files.lines() method.
*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLinesDemo {
	public static void main(String[] args) throws IOException {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/lotto.txt";
		Path path = Paths.get(pathOfFolder + pathOfFile);				
		// Use the Files.lines() method to read the lines of the file as a Stream 
		// and prints them to the console using the forEach() method.
		Files.lines(path).forEach(System.out::println);
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
*/
