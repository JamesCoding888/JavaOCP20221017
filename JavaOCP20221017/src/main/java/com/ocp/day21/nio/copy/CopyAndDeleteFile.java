package com.ocp.day21.nio.copy;
/*
 	This Java program copies a file from a source path to a destination path and then deletes both the original file and the copied file.

	Note that the specific file paths in this program are system-dependent and may need to be changed to match the file paths on your own system.
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class CopyAndDeleteFile {
	public static void main(String[] args) throws IOException {
		// Create Path objects for the source and destination paths
		Path source = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log3.txt");
		Path destination = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log4.txt");
		// The Files.copy() method is called with the source and destination paths and the StandardCopyOption.REPLACE_EXISTING option, 
		// which replaces the destination file if it already exists.
		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		// Files.delete() method is called with the source path to delete the original file
		Files.delete(source);
		// The Files.deleteIfExists() method is called with the destination path to delete the copied file, 
		// but it is not necessary since the REPLACE_EXISTING option already handles replacing the file if it exists.
		Files.deleteIfExists(destination);
		System.out.println("Copy operation was successful!");
	}
}