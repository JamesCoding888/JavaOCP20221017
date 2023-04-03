package com.ocp.day21.io.temporary;
/*
 	
 	Temporary files are often used in programming for a variety of reasons. Some common use cases include: 
 	
	 	1) Storing intermediate results:
	 		
	 			When performing a complex computation, it may be helpful to store intermediate results in a temporary file so that they can be reused later 
	 			
	 			instead of recomputing them from scratch.
	
	 	2) Sharing data between processes:
	 	
	 			Temporary files can be used to share data between different processes or threads running on the same machine. 
	 			
	 			For example, if one process generates data that another process needs to read, it can write the data to a temporary file 
	 			
	 			that the other process can then read from.
	 			
	 	3) Testing and debugging:
	 	
	 			Temporary files can be helpful when testing and debugging code. They can be used to store data that is generated during testing, 
	 			
	 			or to log debug messages that can be later analyzed to find bugs.
	 			
	 	
	 	4) Storing user data:
	 	
	 	 		Temporary files can be used to store user data that is not critical and can be safely deleted after the user is done with it. 
	 	 		
	 	 		For example, an image processing application may use a temporary file to store a user's edited image before saving it to a more permanent location.
	 	 		
 	Overall:
 	 
 	 	1) Temporary files provide a convenient and flexible way to store data that is needed temporarily and can be safely deleted when no longer needed.
 	
 	
 	Q&A:
 		
 		1) When temporary file will be deleted?
 		
 		   i.  Temporary files are typically created in a temporary directory on the file system, and are automatically deleted by the operating system (OS) 
 		   
 		       at some point after they are no longer needed. 
 		   
 		       The exact timing of when temporary files are deleted can depend on the OS and the configuration of the system, 
 		   
 		       but in general, temporary files are deleted as soon as they are no longer being used by any processes.
 		   
 		   ii. When a temporary file is created, the operating system assigns it a unique name and location in the temporary directory, 
 		   
 		       and any processes that need to use the file can access it using its name and location. Once a process has finished using the temporary file, 
 		       
 		       it should delete the file so that it can be cleaned up by the operating system. 
 		       
 		       If a process terminates abnormally or forgets to delete the temporary file, the operating system will eventually delete the file on its own.
 		   
 		   
 		  iii. It's important to note that temporary files should not be relied on for long-term storage of data, as they may be deleted at any time by the operating system. 
 		  
 		       If data needs to be stored for longer periods of time, it should be saved to a more permanent location on the file system, 
 		       
 		       such as a user's home directory or a dedicated data directory for the application.

 		       
 		   iv. Also, temporary files may be deleted during system cleanup processes, such as disk cleanup or on system restart. 
 		   
 		   	   It's important to be aware of this possibility and ensure that any important data is backed up or saved to a more permanent location 
 		   	   
 		   	   before the temporary files are deleted.
 		       
 		       
 	Of this lesson, Java program creates a unique temporary file using the createTempFile() method of the File class.
 	
 	Overall, this program demonstrates how to create a temporary file using the createTempFile() method of the File class, 
 	
 	and how to check whether the file was successfully created and deleted.
 	
*/


import java.io.File;
import java.io.IOException;

public class UniqueTemporaryFileCreated {
	public static void main(String[] args) throws InterruptedException {			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		// Define two variables prefix and suffix, which are used to define the name and file extension of the temporary file to be created
		String prefix = "temp";
		String suffix = ".txt";
		// Create a File object for the directory where the temporary file will be created using new File(pathOfFolder)
		// and assigns it to the variable directoryOfTemp.
		File directoryOfTemp = new File(pathOfFolder);
		try {
			// Create a temporary file, with the prefix "temp" and the file extension ".txt" in the directory specified by directoryOfTemp, 
			// using File.createTempFile(prefix, suffix, directoryOfTemp)
			File tempFile = File.createTempFile(prefix, suffix, directoryOfTemp);			
			// Check whether the file exists using the exists() method of the File class and prints a message indicating whether the file was successfully created or not
			System.out.printf("'%s' created %s%s: %b\n", pathOfFolder, prefix, suffix, tempFile.exists());			
			System.out.printf("Unique temporary file '%s' created\n", tempFile.getName());
			/*
			 	Notice here!!!
			 	When you create a temporary file using the createTempFile() method, the file will NOT be deleted automatically when you close the program or shut down the computer. 
			 	The file will only be deleted automatically if you delete it explicitly using the deleteOnExit() method, 
			 	or if the operating system (OS) cleans up the temporary directory at some point after the file is no longer being used.			 
			*/
			// Delete a temporary file
			// Caller shall call the deleteOnExit() method on the temporary file for deletion when the program exited		
			tempFile.deleteOnExit(); 				
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}	
}