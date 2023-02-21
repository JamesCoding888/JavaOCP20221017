package com.ocp.day17.exception.application.data;
import java.io.IOException;  
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson; // WEB-INF/lib/gson-2.8.5.jar

public class DataAnalysisException {
	public static void main(String[] args) {
		// Following link in terms of AgricultureiRiceFailure released by "Council of Agriculture Executive Yuan", in Taiwan
		// Also, the content of page from AgricultureiRiceFailure was duplicated into File of AgricultureRiceFailure for reference
		String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		try {
			URL url = new URL(path); // Created an object of URL
			InputStream inputDataFromResource = url.openStream(); // Get the stream data
			Scanner scanner = new Scanner(inputDataFromResource, "utf-8");
			// Initialize the string delimiter
			/*
			 	Regular Expression:
			 	-	\A
			 		Description: The beginning of the input 	
			 	-	Oracle document
			 		https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#bounds
			*/
			String jsonString = scanner.useDelimiter("\\A").next();
			// print out the all content of jsonString
//			System.out.println(jsonString);
			Gson gson = new Gson();
			Toxin[] rices = gson.fromJson(jsonString, Toxin[].class);
			System.out.printf("Total data: %d\n", rices.length);
			// Following keyword - will be caught by toxin.品名.contains(keyword)
			String keyword = "印度一等香米";
			System.out.printf("Following keyword of \"%s\" in jsonString, will be present as follows:\n\n", keyword);
			for (Toxin toxin : rices) {
				if (toxin.品名.contains(keyword)) {
					System.out.printf("Title: %s\n 編號: %s\n 品名: %s\n 國際條碼: %s\n 廠商名稱: %s\n 廠商地址: %s\n 違反規定: %s\n 行政處分: %s\n 不合格原因: %s Log_UpdateTime: %s\n", 
											toxin.Title, toxin.編號, toxin.品名, toxin.國際條碼, toxin.廠商名稱, toxin.廠商地址, toxin.違反規定, toxin.行政處分, toxin.不合格原因, toxin.Log_UpdateTime);
				}
			}
		}
		/*
			  // Notice here, the following syntax for catching more than one exception, is NOT allowable
			  // because "MalformedURLException" is already caught by the alternative "IOException"
			  // Please understanding the following syntax, all of exceptions shall NOT have inheritance  
			  
			  catch (MalformedURLException | IOException e) { 
			  		System.out.println(e); 
			  }
		*/			
		catch (MalformedURLException e) {
			System.out.println(e);
		} catch (IOException e){
			System.out.println(e);
		}			
	}
}