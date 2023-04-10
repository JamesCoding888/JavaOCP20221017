package com.ocp.day21.io.read.bufferedreader;
/*
 	This Java program uses the BufferedReader class to read the contents of a file located at a specific path.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/lottery.txt";
		Path path = Paths.get(pathOfFolder + pathOfFile);
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
			// The contents of the file are then read and printed to the console 
			// using the lines() method of the BufferedReader object and the forEach() method of the Stream interface.
			bufferedReader.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}	
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