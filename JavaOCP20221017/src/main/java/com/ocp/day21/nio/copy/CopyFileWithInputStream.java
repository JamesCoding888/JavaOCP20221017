package com.ocp.day21.nio.copy;
/*
 	This Java program downloads an image from a URL and saves it to a local file using the Java NIO Files class. 	
 	
*/
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileWithInputStream {
    public static void main(String[] args) throws IOException {
        // The program first defines a URL string url pointing to the image file  
        String url = "https://images.all-free-download.com/images/graphicwebp/cherry_blossom_schlossgarten_landscape_215065.webp";
        // creates a URI object uri from the URL string.
        URI uri = URI.create(url);
        // Specify the path to the destination file where the image will be saved using a Path object dest.
        Path destination = Paths.get("../src/main/java/com/ocp/day21/io/data/Cherry blossom.jpg");
        // Use the Files class copy method to download the image and save it to the destination file
        // The copy method takes three arguments: 
        // 		1) The input stream of the source file
        //		2) the path of the destination file
        // 		3) an option to replace the existing file if it already exists
        Files.copy(uri.toURL().openStream(), destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copied the image file to the destination!");
    }
}