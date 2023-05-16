package com.ocp.day15.efficiency;
/*
 	The code we provided compares the performance of two approaches: 
 	
 		Reusing the same List object and creating a new List object in each iteration of the loop. 
 	
 		The code measures the time it takes to add 1,000,000 strings to the list for each approach and calculates the average duration over 100 iterations.
 	

 	When reusing the same List object:

		The list is cleared before each iteration using list.clear().
		The memory allocated for the list remains the same throughout the loop.
	
	When creating a new List object in each iteration:

		A new List object is created for each iteration.
		The memory allocated for the previous List object is released and garbage collected.
	
	In terms of performance, creating a new List object in each iteration may provide better memory management as the memory is released and garbage collected after each iteration. 
	However, this approach incurs the overhead of creating a new List object repeatedly.

	To accurately determine which approach is faster, it is recommended to perform benchmarking and testing in your specific environment and use case. 
	The actual performance may vary depending on factors such as JVM implementation, memory management, and hardware.

*/

import java.util.ArrayList; 
import java.util.List;
public class ListEfficiency {
	public static void main(String[] args) {
		// reusing the same List object
		List<String> list = new ArrayList<>();
		double sum = 0.0;		
        // Execute the loop 100 times
		for (int t = 0; t < 100; t++) {
			// creating a new List object in each iteration
//			List<String> list = new ArrayList<>();
			long start = System.nanoTime();	
			// Perform 1,000,000 data operations
			for (int n = 1; n <= 1000000; n++) {
				list.add("1");
			}
			/*
				It suggests avoiding converting the measured duration to seconds (10^-9 conversion) immediately after capturing the stop time 
				because the stop variable might not hold the exact stop time anymore due to potential optimizations or other factors.
			*/
			long stop = System.nanoTime();
			/*
			 	By converting the duration to seconds right after capturing the stop time, any subsequent operations or calculations may introduce additional overhead and inaccuracies. 
			*/
			double duration = (stop - start) * Math.pow(10, -9);
			sum += duration;
		}
		
		System.out.printf("Average duration of 100 times: %f ", sum / 100.0);
	}
}

/*
	Console 1) - Reusing the same List object:
			Average duration of 100 times: 0.019897 
	
	Console 2) - Creating a new List object: 			
			Average duration of 100 times: 0.016871 
			
		
	Summary:	
		
		From these results, it appears that creating a new List object in each iteration is slightly faster than reusing the same List object. The time difference is approximately 0.003026 seconds.

		In terms of performance, using more memory space by creating new List objects seems to provide better efficiency. 
		
		As we mentioned, considering the current affordability of SSDs, investing in memory usage to optimize performance might be a viable solution.

		It's important to note that the actual performance may vary depending on various factors, such as hardware, JVM implementation, and specific use cases. 
		
		Therefore, it's recommended to perform thorough benchmarking and testing in your specific environment to evaluate the performance implications accurately.
		
*/
