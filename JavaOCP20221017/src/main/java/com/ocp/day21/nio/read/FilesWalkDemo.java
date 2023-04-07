package com.ocp.day21.nio.read;

/*
 	This Java program demonstrates how to use the Files.walk() method to recursively traverse a directory tree and process each file in the tree. 
 	
 	The program looks for files with a .txt extension, prints their absolute paths, creation time, and size, and increments a counter to keep track of the number of .txt files processed.
 	
 	Overall, this program provides a simple example of how to use the Files.walk() method to recursively traverse a directory tree and process each file in the tree. 
 	
 	It demonstrates how to filter files based on their extension and how to access their attributes such as creation time and size.
 	
*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FilesWalkDemo {
	// Increments a counter to keep track of the number of .txt files processed
	static int numberOfFileIncrements = 0;

	public static void main(String[] args) {
		// The root directory is the starting point for recursively walking the file tree
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";		
		try {
			/*
				 1) Create a Stream<Path> object named stream that contains all the files and
				 	directories in the specified root directory and its subdirectories
				 
				 2) The Files.walk() method returns a Stream<Path> that lazily walks the file
				 	tree rooted at the specified starting file and includes all the files and
				 	directories in the tree
				 
				 3) The Files.walk() method can be used to recursively traverse a directory tree
				 	and process each file and directory in the tree.
			*/
			Stream<Path> stream = Files.walk(Paths.get(root));
			/*
				Create a Stream<Path> object named stream that contains all the files and directories in the specified root directory and its subdirectories. 
				
				It then uses the forEach() method to process each file and directory in the file tree.
			*/
			stream.forEach(
							// A lambda expression that takes a Path object representing a file or directory in the file tree.	
							(Path subdirectories) -> {
								// Obtain the absolute path of the file or directory.
								Path path = subdirectories.toAbsolutePath();
								/*
								  	Checks if the Path object represents a .txt file
								*/
								if (path.toString().endsWith(".txt")) {
									numberOfFileIncrements++;
									//  Processe the file by printing its absolute path
									System.out.println(path);
									try {
										//  Process the file by printing its creation time
										System.out.println(Files.readAttributes(path, BasicFileAttributes.class).creationTime());
										//  Process the file by printing its size
										System.out.println(Files.readAttributes(path, BasicFileAttributes.class).size());
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
							});
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Number of '.txt' Files Found: " + numberOfFileIncrements);
	}
}
