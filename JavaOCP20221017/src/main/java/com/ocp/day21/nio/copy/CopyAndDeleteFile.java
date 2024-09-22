package com.ocp.day21.nio.copy;
/*
 * This Java program demonstrates copying a file from a source path to a destination path
 * and then deleting both the original file and the copied file.
 *
 * Important: 
 * - The file paths used in this program are specific to your file system.
 * - Modify the paths to match the actual locations on your system before running the program.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyAndDeleteFile {
    public static void main(String[] args) throws IOException {
        // Define the source and destination file paths
        Path source = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log4.txt");
        Path destination = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/log5.txt");

        // Copy the file from source to destination, replacing the destination file if it already exists
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

        // Delete the original file at the source path
        Files.delete(source);

        // Delete the copied file at the destination path if it exists
        Files.deleteIfExists(destination);

        // Inform the user that the copy operation was successful
        System.out.println("Copy operation was successful!");
    }
}
