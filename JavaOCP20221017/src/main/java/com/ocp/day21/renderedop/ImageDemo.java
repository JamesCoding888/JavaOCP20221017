package com.ocp.day21.renderedop;

/*
	This Java program demonstrates how to load an image file and display it in a window using Swing. 
	
	It makes use of the JAI (Java Advanced Imaging) library to load the image file, convert it to a BufferedImage, and then display it in a JFrame.


	Note:
			Here are some possible reasons why the JAI.create() method may not be recognized by the current operation registry:
		
			JAI is not installed: The JAI.create() method requires the Java Advanced Imaging API to be installed on your system. If JAI is not installed, the method will not be recognized by the current operation registry. You can download JAI from the Oracle website and follow the installation instructions provided.
		
		 	JAI libraries are not included in the classpath: Even if JAI is installed, the JAI.create() method will not be recognized if the necessary JAI libraries are not included in your project's classpath. Make sure that you have added the JAI libraries to your project's classpath. You can do this by adding the JAR files to your project's build path or by specifying the classpath when running your application.
		
		 	Incorrect operation name or syntax: If you are passing an incorrect operation name or syntax to the JAI.create() method, the method may not be recognized by the current operation registry. Make sure that you are using the correct operation name and syntax for the operation you are trying to perform. You can refer to the Java Advanced Imaging Programmer's Guide for information on the available operations and their syntax.
		
		 	Compatibility issues: There may be compatibility issues between the JAI version you are using and the version of Java or other libraries you are using. Make sure that you are using a compatible version of JAI for your system and project requirements.
		
		 	By checking these potential issues and addressing any problems, you should be able to ensure that the JAI.create() method is recognized by the current operation registry.
		

		 	
		
		 	The message "Could not find mediaLib accelerator wrapper classes. Continuing in pure Java mode." is a warning message that indicates that JAI is not able to use the mediaLib native library for hardware acceleration. mediaLib is a library used by JAI for accelerating certain image processing operations.
		
		 	The warning message itself does not cause any issues with your application, and the JAI operations will still work as expected, but it may result in reduced performance for some image processing operations.
		
		 	If you want to try to enable mediaLib, you can follow these steps:
		
			    1. Download the mediaLib library from the Oracle website (https://www.oracle.com/java/technologies/media-libraries.html) and extract the files to a directory on your system.
			
			    2. Add the mediaLib directory to your system's LD_LIBRARY_PATH environment variable. For example, if you extracted mediaLib to /usr/local/medialib, you can add the following line to your .bashrc file:
			            
			        export LD_LIBRARY_PATH=/usr/local/medialib:$LD_LIBRARY_PATH
			
			    3. Restart your terminal session to make sure the LD_LIBRARY_PATH environment variable is set.
			
			    4. Start your Java application, and the "Could not find mediaLib accelerator wrapper classes" message should not appear anymore.
		
		 	If you are still seeing the warning message after following these steps, it is possible that your system is not compatible with mediaLib, or that there is an issue with the installation or configuration of mediaLib on your system. In this case, you can continue to use JAI in pure Java mode, or try to troubleshoot the issue further.
 
*/

import java.awt.FlowLayout; 
import java.awt.image.BufferedImage;
import java.io.File;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDemo {

    public static void main(String[] args) throws Exception {
        String fileload = "fileload";
        // Load the image file "dog.png" using a File object
        // Note that this program assumes that the image file "dog.png" is located in the same directory as the Java source file 
        // If the image file is located elsewhere, you'll need to modify the code accordingly
        File file = new File("/Users/JavaOCP20221017/src/main/java/com/ocp/day21/renderedop/image/dog.png");
        // Create a RenderedOp object using the JAI.create() method
        // The JAI.create() method is recognized by the current operation registry as long as the necessary JAI libraries are properly installed and included in your project's classpath. 
        // If the method is not recognized, it is likely that there is an issue with the JAI installation or configuration.
        // The second argument (i.e., "file.getAbsolutePath()") to this method is the path to the image file. 
        // The RenderedOp object represents the image in memory and allows us to perform various operations on it.
        RenderedOp image = JAI.create(fileload, file.getAbsolutePath());
        
        // Convert the RenderedOp object to a BufferedImage using the getAsBufferedImage() method. 
        // This is necessary because Swing requires images to be in the form of BufferedImages in order to display them.
        BufferedImage bufferedImage = image.getAsBufferedImage();
        
        // The program calls the displayImage() method to create a new JFrame and add a JLabel containing the image to its content pane. 
        // The JFrame is then displayed on the screen.
        displayImage(bufferedImage);
        
    }
    
    private static void displayImage(BufferedImage image) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        /*
         * if {@code true}, makes the {@code Window} visible,
	     * otherwise hides the {@code Window}.
         */
        frame.setVisible(true);
    }
}