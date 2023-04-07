package com.ocp.day21.nio.copy;

/*
 	This Java program demonstrates four different options to copying a file from a URL to a local destination file, and measures the elapsed time for each option. 
 	
 		1) The program first defines a URL string url pointing to an image file, and creates a URI object uri from the url string. 
 	
 		2) The program also specifies the path to the destination file where the image will be saved using a Path object destination.
	
		3) The program performs four different options to copying the image file to the destination file:
	
		   For each option, the program records the start and end times of the copying process using System.nanoTime(), and calculates the elapsed time in milliseconds. 
			
		   The program then prints the elapsed time for each option.

				Option 1:
				 	
				 	Use a BufferedInputStream to copy the file in a single thread.
				
				Option 2:
					
					Use a BufferedInputStream, but with a larger buffer size than option 1.
				
				Option 3:
				 	
				 	Use multiple threads to copy the file. The program uses an ExecutorService to create a thread pool with four threads, 
				 	
				 	and submits a DownloadTask to the thread pool, which downloads the file and returns the Path of the downloaded file. 
				 	
				 	The program then retrieves the downloaded Path from the Future object returned by the submit method.
				 			 	
				 	
				 	DownloadTask class:
				
						The program also defines a nested class DownloadTask, which implements the Callable interface, 
						
						and is used for option 3 to download the file using a separate thread. 
						
						The DownloadTask takes a URI object and a Path object as its constructor arguments, and downloads the file using a BufferedInputStream, 
						
						and saves the file to the specified destination file. The DownloadTask returns the Path of the downloaded file.
				
				Option 4:
				 	
				 	Cache the downloaded file, so that if the destination file already exists, the file is not downloaded again.
		
*/

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CopyFileEnhancedEfficiency {
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		// The program first defines a URL string url pointing to the image file  
        String url = "https://images.all-free-download.com/images/graphicwebp/cherry_blossom_schlossgarten_landscape_215065.webp";
        // creates a URI object uri from the URL string.
        URI uri = URI.create(url);
        // Specify the path to the destination file where the image will be saved using a Path object dest.
        Path destination = Paths.get("/Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/Cherry blossom5.jpg");
        // Record the start time
        long startTime4One = System.nanoTime();
		// Option 1: Use a BufferedInputStream
//		/*
	        BufferedInputStream bufferedInputStream4Option1 = new BufferedInputStream(uri.toURL().openStream());
			Files.copy(bufferedInputStream4Option1, destination, StandardCopyOption.REPLACE_EXISTING);
			bufferedInputStream4Option1.close();
//		*/
        // Record the end time
        long endTime4One = System.nanoTime();
        // Record the start time
        long startTime4Two = System.nanoTime();
		// Option 2: Use a larger buffer
//		/*
	        BufferedInputStream bufferedInputStream4Option2 = new BufferedInputStream(uri.toURL().openStream(), 16384);
			Files.copy(bufferedInputStream4Option2, destination, StandardCopyOption.REPLACE_EXISTING);
			bufferedInputStream4Option2.close();
//		*/
        // Record the end time
        long endTime4Two = System.nanoTime();
        // Record the start time
        long startTime4Three = System.nanoTime();
		// Option 3: Use multiple threads
//        /*
			ExecutorService executor = Executors.newFixedThreadPool(4);
			Future<Path> future = executor.submit(new DownloadTask(uri, destination));
			Path downloadedFile = future.get();
			executor.shutdown();
			System.out.println("Downloaded file to: " + downloadedFile.toString());
//		*/
        // Record the end time
        long endTime4Three = System.nanoTime();
        // Record the start time
        long startTime4Four = System.nanoTime();
		// Option 4: Cache the downloaded file
//		/*
         	if (!Files.exists(destination)) {
		 	BufferedInputStream bufferedInputStream4Option4 = new BufferedInputStream(uri.toURL().openStream());
		 	Files.copy(bufferedInputStream4Option4, destination, StandardCopyOption.REPLACE_EXISTING);
		 	bufferedInputStream4Option4.close();
		 }
//		*/
        // Record the end time
        long endTime4Four = System.nanoTime();
        System.out.println("Copied the image file to the destination!");
		
        // Calculate the elapsed time in milliseconds
        long elapsedTime4One = (endTime4One - startTime4One) / 1000000;
        long elapsedTime4Two = (endTime4Two - startTime4Two) / 1000000;
        long elapsedTime4Three = (endTime4Three - startTime4Three) / 1000000;
        long elapsedTime4Four = (endTime4Four - startTime4Four) / 1000000;
        
        // Print the elapsed time
        System.out.println("Elapsed time for Option #1: " + elapsedTime4One + " ms");
        System.out.println("Elapsed time for Option #2: " + elapsedTime4Two + " ms");
        System.out.println("Elapsed time for Option #3: " + elapsedTime4Three + " ms");
        System.out.println("Elapsed time for Option #4: " + elapsedTime4Four + " ms");
	}

	// Callable task for downloading a file
	private static class DownloadTask implements Callable<Path> {
		private URI uri;
		private Path dest;

		public DownloadTask(URI uri, Path dest) {
			this.uri = uri;
			this.dest = dest;
		}

		@Override
		public Path call() throws Exception {
			BufferedInputStream in = new BufferedInputStream(uri.toURL().openStream());
			Files.copy(in, dest, StandardCopyOption.REPLACE_EXISTING);
			in.close();
			return dest;
		}
	}
}


/*
 	Console:
			Downloaded file to: /Users/liaojames/git/repository/JavaOCP20221017/src/main/java/com/ocp/day21/io/data/Cherry blossom5.jpg
			Copied the image file to the destination!
			Elapsed time for Option #1: 3116 ms
			Elapsed time for Option #2: 613 ms
			Elapsed time for Option #3: 592 ms
			Elapsed time for Option #4: 1 ms


*/