package com.ocp.day21.nio.path;

/*
 	Console:
 			
 			This is a Java program that demonstrates some basic operations on file paths using the java.nio.file.Path class.		 			 
*/
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathReader2 {
	public static void main(String[] args) {      	    
		String path = "/Users/../../repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/lotto.txt";
		// Paths.get(path).normalize(): This line creates a Path object from the specified string path, 
		// normalizes it (removes any redundant parts of the path)
        System.out.println(Paths.get(path).normalize());
        Path path1 = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/");
        Path path2 = Paths.get("src/main/java/com/ocp/day21/io/data/lotto.txt");
        // path1.resolve(path2): This line creates two Path objects, one from an absolute path and one from a relative path, 
        // and then resolves the relative path against the absolute path (i.e., combines them) to create a new absolute path.         
        path1 = path1.resolve(path2);
        System.out.println(path1);
        Path basePath = Paths.get("/JavaOCP20221017");
        Path targePath = Paths.get("/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/lotto.txt"); 
        // These two lines create two Path objects, one representing a "base" directory and one representing a "target" file, 
        // and then show how to create a relative path from the base to the target (using relativize()) 
        // and from the target to the base (by calling relativize() on the target and passing in the base as an argument). 
        Path base2target = basePath.relativize(targePath);
        Path target2base = targePath.relativize(basePath);
        System.out.println(base2target);
        System.out.println(target2base);  
        Path path3 = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/lotto.txt");
        // Check whether path3 starts with the root path
        Path root = Paths.get("/Users");
        // Check whether path3 ends with the file path.
        Path file = Paths.get("lotto.txt"); 
        // These two lines demonstrate how to check whether a path starts or ends with a particular string or Path object.
        // The results (true or false) are printed to the console.
        System.out.println(path3.startsWith(root)); 
        System.out.println(path3.endsWith(file));         
    }
}

/*
	Console: 
			/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/lotto.txt
			/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/lotto.txt
			src/main/java/com/ocp/day21/io/data/lotto.txt
			../../../../../../../../..
			true
			true
*/