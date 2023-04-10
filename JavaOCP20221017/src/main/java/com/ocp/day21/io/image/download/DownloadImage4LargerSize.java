package com.ocp.day21.io.image.download;
/*
 	Continue the previously DownloadImage.java:
 	
 		To make the code more efficient for downloading larger files, 
 		
 		you can increase the size of the byte buffer used to read and write the data. 
 		
 		Instead of reading and writing one byte at a time, you can read and write a larger chunk of data at once.
 		
 		In this updated version of the code, we use a buffer of 4096 bytes (4KB) to read and write the data. 
 		
 		This should be more efficient than reading and writing one byte at a time.
 		
 		Additionally, we use the read method of the input stream to read as much data as possible into the buffer, 
 		
 		and we use the write method of the output stream to write the entire buffer to the file.

		This updated code will be more efficient for downloading larger files. 
		
		However, it's still important to note that downloading very large files can take a long time, 
		
		and there may be network limitations or other factors that could impact the download speed.
*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class DownloadImage4LargerSize {
    public static void main(String[] args) {
        // pathOfImageSource is the URL of the image that we want to download
    	String pathOfImageSource = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg";
        // pathOfDestination is the path to the directory where we want to save the downloaded image
    	String pathOfDestination = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data";
        // pathOfImageFile is the name of the file that we want to save the downloaded image as
    	String pathOfImageFile = "/beauty.jpg";
        try {
            // Create a new URL object from the pathOfImageSource string.
        	URL url = new URL(pathOfImageSource);
        	// Open a connection to the URL using the openConnection() method of the URL object
        	// and returns a URLConnection object that we can use to interact with the URL
            URLConnection connection = url.openConnection();
            /*
            	1) Create an InputStream object from the connection using the getInputStream() method of the URLConnection object. 
                   This allows us to read the contents of the URL
             	2) Create a new FileOutputStream object with the specified file path pathOfDestination + pathOfImageFile. 
                   This allows us to write the contents of the URL to a file on the local file system.
            */
            try (InputStream inputStream = connection.getInputStream();
                 FileOutputStream fileOutputStream = new FileOutputStream(pathOfDestination + pathOfImageFile)) {
                // Creates a byte array buffer with a size of 4096 bytes (4KB).
            	// This is the amount of data that we will read and write at a time.
            	byte[] buffer = new byte[4096];
                int bytesRead;
                /*
	                 1) Enters a loop that reads data from the input stream and writes it to the output stream 
	                 	until there is no more data to read.
	                 
	                 2) The loop uses the read() method of the input stream to read data into the buffer. 
	                 	The read() method returns the number of bytes read, which is stored in the bytesRead variable.
	                 
	                 3) The loop uses the write() method of the output stream to write the contents of the buffer to the output file. 
	                    The write() method takes three arguments: the buffer to write, the starting offset within the buffer, and the number of bytes to write (which is equal to bytesRead in this case).
	                 
	                 4) The loop continues until there is no more data to read (which is indicated by inputStream.read() returning -1).
                */
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}