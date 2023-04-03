package com.ocp.day21.io.temporary;
/*
 	Continue the previously lesson:  
 	
 		We used tempFile.createNewFile() instead of File.createTempFile(prefix, suffix, directoryOfTemp) is that 
 		
 		it allows us to specify the exact name of the temporary file that we want to create.
 		
 		When we use File.createTempFile(prefix, suffix, directoryOfTemp), a unique file name is generated automatically, 
 		
 		which can be useful in preventing naming conflicts. 
 		
 		However, if we want to create a temporary file with a specific name or a specific naming convention, 
 		
 		we can use tempFile.createNewFile() instead.
 	 	
 	
 	Summary:
 	 	
 	 	We can use File.createTempFile(prefix, suffix, directoryOfTemp) when we need to create a unique temporary file name, 
 	 	
 	 	and tempFile.createNewFile() when we want to specify the exact name of the temporary file we want to create.
 	
*/


import java.io.File;
import java.io.IOException;

public class FixedTemporaryFileCreated {
	public static void main(String[] args) throws InterruptedException {			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		// Define two variables prefix and suffix, which are used to define the name and file extension of the temporary file to be created
		String prefix = "temp";
		String suffix = ".txt";
		// Create a File object for the temporary file using the path and file name
		File fixedFile = new File(pathOfFolder, prefix + suffix);
		try {
			// Create the fixed temporary file using the createNewFile() method of the File class
			boolean success = fixedFile.createNewFile();			
			// Check whether the file exists using the exists() method of the File class and prints a message indicating whether the file was successfully created or not
			if(success) {
				System.out.printf("'%s' created %s%s: %b\n", pathOfFolder, prefix, suffix, fixedFile.exists());	
				System.out.printf("Unique temporary file '%s' created\n", fixedFile.getName());
			}						
			// Delete a temporary file
			// Caller shall call the deleteOnExit() method on the temporary file for deletion when the program exited		
			fixedFile.deleteOnExit(); 
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}	
}