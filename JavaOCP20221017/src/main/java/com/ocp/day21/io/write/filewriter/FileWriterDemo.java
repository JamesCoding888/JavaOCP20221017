package com.ocp.day21.io.write.filewriter;
/*
 	This Java program generates a file named "lotto.txt" in the "data" subdirectory of the directory path specified in the "root" variable. 
 	
 	The file contains 10 lines of lottery numbers, with each line having 6 unique numbers between 1 and 42.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class FileWriterDemo {
	public static void main(String[] args) {			
		// Set the root directory path as a string variable "root" 
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder" 
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/lotto.txt";
		/*
			 In Java, the FileWriter constructor accepts two arguments: 
			 	1) 1st argument: The path of the file to be created or opened
			 	2) 2nd argument: 
			 		
			 		true: 			 			
			 			
			 			Indicate that the file should be opened in append mode, 
			 			which means that any content written to the file will be appended to the end of the existing file content,
			 			without overwriting it. 
			 			
			 			If the file does not exist, then a new file will be created with the specified path and name. 
			 	   
			 	    false: 			 			
			 			The file will be opened in overwrite mode. This means that if the file already exists, 
			 			its content will be deleted and replaced by the new content. 
			 			
			 			If the file does not exist, a new file with the specified path and name will be created. 			 	   			 	   
		*/		 
		try(FileWriter fileWriter = new FileWriter(pathOfFolder + pathOfFile, true);){
			/*
			 	This code uses a Java 8 stream to iterate over a range of integers from 1 to 50 (inclusive) using the IntStream.rangeClosed method. 
			 	For each integer in the range, it executes a lambda expression that writes a line to the specified file using a FileWriter object.
			*/
			IntStream.rangeClosed(1, 10).forEach(i -> {				
					try {
						fileWriter.append(getLotto() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}	
			});
		} catch(IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static Set<Integer> getLotto() {
		//	java.util.LinkedHashSet: A class that extends HashSet and maintains the insertion order of elements in a set
        Set<Integer> lotto = new LinkedHashSet<>();
        Random random = new Random();
        while (lotto.size() < 6) {
            lotto.add(random.nextInt(42) + 1);
        }
        return lotto;
    }
}
