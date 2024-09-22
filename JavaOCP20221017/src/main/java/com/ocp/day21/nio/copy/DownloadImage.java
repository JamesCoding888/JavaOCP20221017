package com.ocp.day21.nio.copy;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DownloadImage {
    public static void main(String[] args) {
        String urlString = "https://images.pexels.com/photos/220769/pexels-photo-220769.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2";
        Path destination = Paths.get("../src/main/java/com/ocp/day21/io/data/largepixel.png");

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();            
            /** 
             * Set a User-Agent to mimic a browser
             * 
             * URI uri = URI.create(url);
        	 * This approach should help you bypass the `403` error if it's related to the User-Agent.
             */
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            try (InputStream inputStream = connection.getInputStream()) {
                Files.copy(inputStream, destination, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image downloaded successfully!");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
