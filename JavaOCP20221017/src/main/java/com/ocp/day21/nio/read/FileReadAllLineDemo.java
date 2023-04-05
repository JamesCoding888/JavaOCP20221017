package com.ocp.day21.nio.read;
/*
 	This Java program reads all the lines from a text file using the Files.readAllLines() method, and then prints each line to the console using a Java 8 stream. 	 

*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadAllLineDemo {
	public static void main(String[] args) throws IOException {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/lotto.txt";
		// The Paths.get() method is used to create a Path object that represents the full path to the file to be read
		Path path = Paths.get(pathOfFolder + pathOfFile);		
		// The Files.readAllLines() method is then called to read all the lines from the file. 
		// This method takes a Path object representing the file to be read as its argument, 		
		// and returns a List object containing all the lines of the file.
		List<String> list = Files.readAllLines(path);
		/*
			Use a Java 8 stream to print each line of the file to the console. 
		 	The list.stream().forEach(System.out::println) code creates a stream from the List object 
		 	containing the lines of the file, and then uses the forEach() method to print each line to the console. 
		 	The System.out::println code is a method reference that specifies the println() method of the System.out object 
		 	as the action to be performed on each element of the stream.
		*/
		list.stream().forEach(System.out::println);		
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