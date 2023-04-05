package com.ocp.day21.nio.path;

/*
 	This Java program reads and manipulates paths using the java.nio.file.Path and java.nio.file.Paths classes.
 	
 	The main difference between the two code snippets is the way the file path is constructed. 
 	
 	The first code snippet uses a relative file path while the second code snippet uses an absolute file path.
		
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		String root = "Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
 	
 	Overall, this program is useful for understanding how to work with paths in Java and how to use the Path and Paths classes.
*/

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathReader {
	public static void main(String[] args) {
        
		// Set the root directory path as a string variable "root"
		// Console 1: absolute path
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Console 2: relative path
//		String root = "Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/log2.txt";
		// Create a Path object from the filePath using the Paths.get() method
		Path path = Paths.get(pathOfFolder + pathOfFile);
		// getFileName(): Returns the file name at the end of the path
		System.out.println("getFileName: " + path.getFileName());
		// getParent(): Returns the parent directory of the file
		System.out.println("getParent: " + path.getParent());
        // getRoot(): Returns the root component of the path
		System.out.println("getRoot: " + path.getRoot());
        // getNameCount(): Returns the number of elements in the path
		System.out.println("getNameCount: " + path.getNameCount());
        // subpath(0, 2): Returns a subpath consisting of the first two elements of the path
		System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        // isAbsolute(): Returns true if the path is absolute, false otherwise
		System.out.println("isAbsolute: " + path.isAbsolute());
        // toAbsolutePath(): Returns an absolute path
		System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        // toUri(): Returns a URI representation of the path
		System.out.println("toUri: " + path.toUri());
    }
}

/*
	Console 1:
		 	getFileName: log2.txt
			getParent: /Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data
			getRoot: /
			getNameCount: 14
			subpath(0, 2): Users/liaojames
			isAbsolute: true
			toAbsolutePath: /Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log2.txt
			toUri: file:///Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log2.txt

	Console 2:
			getFileName: log2.txt
			getParent: Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data
			getRoot: null
			getNameCount: 14
			subpath(0, 2): Users/liaojames
			isAbsolute: false
			toAbsolutePath: /Users/liaojames/git/repository/JavaOCP20221017/src/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log2.txt
			toUri: file:///Users/liaojames/git/repository/JavaOCP20221017/src/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log2.txt

	
*/