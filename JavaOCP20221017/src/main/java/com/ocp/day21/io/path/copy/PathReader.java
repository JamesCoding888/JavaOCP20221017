package com.ocp.day21.io.path.copy;
//String filePath = "src/main/java/com/ocp/day25_io/data/lottery.txt";
// String filePath = "C:/src/main/java/com/ocp/day25_io/data/lottery.txt";

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathReader {
	public static void main(String[] args) {
        
		// Set the root directory path as a string variable "root"
		String root = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io";
		// Add the subdirectory "data" to this path using the variable "pathOfFolder"
		String pathOfFolder = root + "/data";
		// Set the path and filename of the file to be created as a string variable "pathOfFile"
		String pathOfFile = "/log2.txt";
		Path path = Paths.get(pathOfFolder + pathOfFile);
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
    }
}
