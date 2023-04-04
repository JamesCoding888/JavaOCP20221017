package com.ocp.day21.io.filereader;

/*
 	This program demonstrates how to use the FileReader class in Java to read the contents of a file character by character.  
 	
 	The program prompts the user to choose between two options: displaying all the data in the file on one line or showing each line separately.
 	
*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
	public static void main(String[] args) {
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/lotto.txt";
		Scanner scan = new Scanner(System.in);
		// If the user chooses option 1, the program reads the file character by character and prints each character until the end of the file is reached.
		// If the user chooses option 2, the program reads the file character by character and appends each character to a StringBuilder object.
		System.out.printf("[Enter '1'] - show all the data in the file on one line| [Enter '2'] - show each line separately\n", pathOfFile, pathOfFile);
		int option = scan.nextInt();
		// In the first option: This code block reads a file character by character and prints each character to the console. 
		if(option == 1) {
			// The FileReader object is created by passing in the file path to the constructor.
			try (FileReader fileReader = new FileReader(pathOfFolder + pathOfFile)) {
				// A character buffer of size 1 is created
				char[] buffer = new char[1];
				// The while loop reads each character from the file until the end of the file is reached. 
				// The read() method of FileReader reads the next character from the file into the buffer and returns the number of characters read. 
				// If the end of the file has been reached, it returns -1, which terminates the loop. 
				while (fileReader.read(buffer) != -1) {
					 // Inside the while loop, the character in the buffer is printed to the console using System.out.print(buffer[0])
					 System.out.print(buffer[0]);
				}
			} catch (IOException e) {
					e.printStackTrace();
			}
		}
		/*
			In the second option, the program reads the file character by character and appends each character to a StringBuilder object. 
			The while loop continues until the end of the file is reached, and each character is checked to see if it is a newline, opening square bracket, or closing square bracket. 
			Newlines and opening square brackets are skipped, while closing square brackets are replaced with a comma and a space. The resulting StringBuilder object is then printed to the console.
		*/
		if(option == 2) {
			try (FileReader fileReader = new FileReader(pathOfFolder + pathOfFile)) {
				char[] buffer = new char[1];
				StringBuilder stringBuilder = new StringBuilder();
				while (fileReader.read(buffer) != -1) {	
					// If the character is a newline or opening square bracket, it is skipped. 
					if (buffer[0] == '\n' || buffer[0] == '[') {
						continue;
					}
					// If the character is a closing square bracket, a comma and a space are appended to the StringBuilder object.
					if (buffer[0] == ']') {
						stringBuilder.append(", ");
						continue;
					}
					stringBuilder.append(buffer);
				}
				// StringBuilder object is printed to the console
				System.out.println(stringBuilder);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		scan.close();
	}
}

/*
	Console:
			[Enter '1'] - Show all data of /lotto.txt | [Enter '2'] - Show all data of /lotto.txt in line
			1
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
			
	Console:	
			[Enter '1'] - Show all data of /lotto.txt | [Enter '2'] - Show all data of /lotto.txt in line
			2
			12, 38, 10, 17, 9, 22, 2, 15, 21, 10, 22, 26, 41, 14, 23, 6, 21, 9, 26, 16, 29, 2, 31, 8, 14, 29, 5, 35, 20, 16, 23, 3, 19, 18, 9, 31, 24, 3, 23, 18, 28, 6, 32, 9, 20, 41, 2, 39, 39, 28, 9, 10, 15, 33, 30, 7, 35, 1, 42, 24, 


*/
