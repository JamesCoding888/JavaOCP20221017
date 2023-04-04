package com.ocp.day21.io.image.rendering;

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
    	
    	// Load the input image from file
        RenderedOp inputImage = JAI.create("fileload", "fill out the absolutely path of 'dog.png'");
        System.out.println(inputImage);
        
        BufferedImage image = inputImage.getAsBufferedImage();
        System.out.println(image);
        
        // Display the image
        displayImage(image);
    
        // Resize the image using bilinear interpolation
        RenderedOp resizedImage = JAI.create("scale",
                inputImage, 0.5f, 0.5f, 0.0f, 0.0f,
                Interpolation.getInstance(Interpolation.INTERP_BILINEAR));

        // Convert the image to BufferedImage
        BufferedImage outputImage = resizedImage.getAsBufferedImage();
        System.out.println(outputImage);
        
        // Save the result to a new file
        File outputFile = new File("/Users/JavaOCP20221017/src/main/java/com/ocp/day21/renderedop/image/output.png");
        ImageIO.write(outputImage, "png", outputFile);
        displayImage(outputImage);     
    }
	
    private static void displayImage(BufferedImage image) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setVisible(true);
    }
}
