package com.ocp.day17.exception.application.data.practicalsample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson; // Ensure gson-2.8.5.jar is included in WEB-INF/lib

public class DataAnalysisException2 {
    public static void main(String[] args) {
        // Path to the stored JSON file in your Eclipse project
        String filePath = "../src/main/java/com/ocp/day17/exception/application/data/practicalsample/AgricultureiRiceFailure"; // Update this path to your actual file location

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read the entire JSON content from the file
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
            }
            String jsonString = jsonBuilder.toString();
            
            // Initialize Gson to parse the JSON content
            Gson gson = new Gson();
            Toxin[] rices = gson.fromJson(jsonString, Toxin[].class);
            System.out.printf("Total records: %d\n", rices.length);
            
            // Filter the data by the specified keyword
            String keyword = "印度一等香米";
            System.out.printf("Results for keyword \"%s\" from the JSON data:\n\n", keyword);
            for (Toxin toxin : rices) {
                if (toxin.品名.contains(keyword)) {
                    System.out.printf("Title: %s\n 編號: %s\n 品名: %s\n "
                                    + "國際條碼: %s\n 廠商名稱: %s\n 廠商地址: %s\n "
                                    + "違反規定: %s\n 行政處分: %s\n 不合格原因: %s\n Log_UpdateTime: %s\n", 
                                       toxin.Title, toxin.編號, toxin.品名, 
                                       toxin.國際條碼, toxin.廠商名稱, toxin.廠商地址, 
                                       toxin.違反規定, toxin.行政處分, toxin.不合格原因, toxin.Log_UpdateTime);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
