package com.ocp.day21.io.image.rendering;
/*
 * If you want to accelerate image processing in Java without having to set any environment variables, you can use the Java Advanced Imaging (JAI) API with the JAI Image I/O Tools.
 * 
 * The JAI Image I/O Tools provide support for hardware acceleration through the use of the Java Image I/O framework. This framework allows JAI to use native libraries for image I/O operations, which can improve performance.
 * To use the JAI Image I/O Tools, you need to download the appropriate native libraries for your platform, and add them to your project's classpath. You can download the native libraries from the following links:
 *      
 *      Windows: https://download.java.net/media/jai-imageio/builds/release/1.1/jai_imageio-1_1-lib-windows-i586.tar.gz
 *      macOS: https://download.java.net/media/jai-imageio/builds/release/1.1/jai_imageio-1_1-lib-macosx.tar.gz
 *      Linux: https://download.java.net/media/jai-imageio/builds/release/1.1/jai_imageio-1_1-lib-linux-i586.tar.gz
 * 
 * Once you have downloaded the appropriate native libraries, you can add them to your project's classpath. For example, if you are using Maven, you can add the following dependency to your pom.xml file:
 *   
    <dependency>
        <groupId>javax.media.jai</groupId>
        <artifactId>jai_imageio</artifactId>
        <version>1.1</version>
        <scope>runtime</scope>
    </dependency>
 * 
 * With the JAI Image I/O Tools added to your classpath, JAI will automatically use the native libraries for hardware acceleration if they are available on your system. This can significantly improve performance for certain image processing operations.
 * Here's an example of how to use the JAI Image I/O Tools to load and display an image with hardware acceleration:
 * 
 * In this example, we use the JAI.create() method to load an image from a file ("input.jpg"), and then convert it to a BufferedImage using the getAsBufferedImage() method. We then display the BufferedImage in a window using Swing.
 * By adding the jai_imageio dependency to your project's classpath, JAI will automatically use hardware acceleration if it is available on your system, improving the performance of image loading and processing.
 */
import java.awt.image.BufferedImage;  
import javax.media.jai.Interpolation;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RenderedOpSampleCode2 {

    public static void main(String[] args) {
        // Load the image using JAI
        RenderedOp image = JAI.create("fileload", "fill out the absolutely path of 'dog.png'");
        
        // Convert the image to a BufferedImage for display
        BufferedImage bufferedImage = image.getAsBufferedImage();

        // Display the image
        displayImage(bufferedImage);
		
        // Resize the image using bilinear interpolation
		RenderedOp resizedImage = JAI.create("scale", bufferedImage, 0.5f, 0.5f, 0.0f, 0.0f,
				Interpolation.getInstance(Interpolation.INTERP_BILINEAR));
		
		// Convert the image to BufferedImage
        BufferedImage outputImage = resizedImage.getAsBufferedImage();
        
        // Display the image
        displayImage(outputImage);
    }

    private static void displayImage(BufferedImage image) {
        // Show the image in a window
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}