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
        String pathOfImageSource = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg";
        String pathOfDestination = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data";
        String pathOfImageFile = "/beauty.jpg";
        try {
            URL url = new URL(pathOfImageSource);
            URLConnection connection = url.openConnection();
            try (InputStream inputStream = connection.getInputStream();
                 FileOutputStream fileOutputStream = new FileOutputStream(pathOfDestination + pathOfImageFile)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
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