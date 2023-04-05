package com.ocp.day21.nio.read;
/*
	This is a Java program that reads the contents of a text file and prints them to the console.
*/
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadAllBytesDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log3.txt";
        // This path is then used to create a new File object called file.
        File file = new File(filePath);
        // The toPath() method is called on the File object to get a Path object which represents the path of the file.
        Path path = file.toPath();
        // The Files.readAllBytes() method is then used to read all the bytes from the file, 
        // which are stored in a byte array called bytes.
        byte[] bytes = Files.readAllBytes(path);
        // The String constructor is used to create a new string from the byte array bytes, 
        // using the "UTF-8" encoding.
        String string = new String(bytes, "UTF-8");
        System.out.println(string);
    }
}