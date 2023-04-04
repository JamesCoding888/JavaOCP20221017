package com.ocp.day21.io.image.download;
/*
 	This Java program downloads an image from a URL and saves it to a specified location on the local filesystem.
 	
 	
 	
*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
	public static void main(String[] args){
		// The pathOfImageSource variable is a String that represents the URL of the image to be downloaded
		String pathOfImageSource = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg";
		// The pathOfDestination variable is a String that represents the directory where the downloaded image will be saved
		String pathOfDestination = "/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data";
		// The pathOfImageFile variable is a String that represents the filename of the downloaded image
		String pathOfImageFile = "/beauty.jpg";
		try {
			// The program creates a URLConnection object using the openConnection method of the URL object, 
			// which represents a connection to the URL
			URL url = new URL(pathOfImageSource);
			URLConnection connection = url.openConnection();
			// The program uses the getInputStream method of the URLConnection object to get an input stream for reading from the URL
			// The program creates a FileOutputStream object using the pathOfDestination and pathOfImageFile Strings to represent the file that the image will be saved to
			try (InputStream inputStream = connection.getInputStream();
				 FileOutputStream fileOutputStream = new FileOutputStream(pathOfDestination + pathOfImageFile)) {
				// The program reads the image data from the input stream using a buffer and writes it to the output stream
				byte[] buffer = new byte[1];
			    while(inputStream.read(buffer) != -1) {
					fileOutputStream.write(buffer);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} 					 	
	}
}
