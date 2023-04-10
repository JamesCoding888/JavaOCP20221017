package com.ocp.day21.io.image.rendering;
/*
 	This is a Java code that demonstrates how to load, resize and display an image using the Java Advanced Imaging (JAI) library.
 	
 	The code imports several packages such as java.awt, javax.imageio, javax.swing, and javax.media.jai, which are used to load, process, and display images.
 	
 	
*/
import java.awt.FlowLayout;   
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.media.jai.Interpolation;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RenderedOpSampleCode1 {
	public static void main(String[] args) throws IOException {
    	
		// Loads the input image from a file 
		// The JAI.create method is used to create a RenderedOp object representing the input image.
        RenderedOp inputImage = JAI.create("fileload", "fill out the absolutely path of 'dog.png'");
        // Print information about the image. 
        System.out.println(inputImage);
        // Convert the input image to a BufferedImage object using the getAsBufferedImage() method.        
        BufferedImage image = inputImage.getAsBufferedImage();
        System.out.println(image);
        
        // Display the input image using the displayImage method.         
        // This method creates a new JFrame object and adds a JLabel with the input image to the frame.     
        displayImage(image);
    
        // Resizes the input image using bilinear interpolation. 
        // The JAI.create method is used again to create a new RenderedOp object representing the resized image. 
        // The scale operation is used to resize the image with the specified scale factors and interpolation method.
        RenderedOp resizedImage = JAI.create("scale",
                inputImage, 0.5f, 0.5f, 0.0f, 0.0f,
                Interpolation.getInstance(Interpolation.INTERP_BILINEAR));

        // Converts the resized image to a BufferedImage object using the getAsBufferedImage() method.
        BufferedImage outputImage = resizedImage.getAsBufferedImage();
        System.out.println(outputImage);
        // Saves the resized image to a new file with the ImageIO.write method.
        File outputFile = new File("/Users/JavaOCP20221017/src/main/java/com/ocp/day21/renderedop/image/output.png");
        ImageIO.write(outputImage, "png", outputFile);
        // Displays the resized image using the displayImage method.
        displayImage(outputImage);     
    }
	
	// The displayImage method takes a BufferedImage object as input and displays it in a new JFrame object. 	
	// It creates a new JLabel with the input image and adds it to the content pane of the frame. 
	// The frame is then packed and made visible.
    private static void displayImage(BufferedImage image) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setVisible(true);
    }
}
