package com.ocp.day21.io.copy;
/*
	This Java program reads the content of a file named "lottery.txt" located in the subdirectory "data" 
	
	and creates a copy of its content in a new file named "lottery_Copy.txt" located in the same directory. 
	
	The program uses FileReader and FileWriter classes to read and write the file content, respectively.
*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContent {
	public static void main(String[] args) {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/lottery.txt";
		// copy original file to new file
		String pathOfCopyFile = "/lottery_Copy.txt";
		//
		try (FileReader fileReader = new FileReader(pathOfFolder + pathOfFile); 
			 FileWriter fileWriter = new FileWriter(pathOfFolder + pathOfCopyFile);) {					
			char[] buffer = new char[1];							
			while(fileReader.read(buffer) != -1) {
				/*					
					Both methods serve the same purpose of writing data to the file.
					However, there is a subtle difference between the two methods.	
					
						fileWriter.write(buffer);
						fileWriter.append(new String(buffer));
					 					
					The write() method writes a portion of an array of characters to the file. 
					The append() method writes the specified character or character sequence to the file. 
					
					In this case, since the buffer is a character array of length 1, using write() or append() 
					will both write the same character to the file.
				*/
				// fileWriter.write(buffer);
				fileWriter.append(new String(buffer));
			}				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}					
	}
}
