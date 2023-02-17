package com.ocp.day17.exception.terminate;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
public class ExceptionWithTermination02 {
	public static void main(String[] args) {
		try {
			/*
			 
			   If the path of "helloworld.txt" is Right,
			   then execute the block code of finally, because of NO IOException being caught.
			   
			   If the path of "helloworld.txt" is Wrong, 
			   then execute the block code of catch statement 
			   and also skip the block code of finally, because of System.exit(0).	
			   
			   Note: Please copy the folder of JavaOCP20221017_NIO from package of "com.ocp.day17.exception.terminate" 
			         and paste into your desktop.
			   
			*/

			// Following path is incorrect, please write the correct path of file
			String pathInRightDirection = ".../JavaOCP20221017_NIO/helloworld.txt";  
			String pathInWrongDirection = ".../JavaOCP20221017_NIO/helloworld.txt";
			BufferedReader br = new BufferedReader(new FileReader(pathInRightDirection));
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("Exiting the program");
		}	
	}
}

/*
	
	Console 1 - pathInRightDirection:
		
		Thank you for using java.nio to read the content ~
		Exiting the program
	
	Console 2 - pathInWrongDirection:
		
		java.io.FileNotFoundException: /Users123/liaojames/desktop/helloworld.txt (No such file or directory)

			
*/