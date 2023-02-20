package com.ocp.day17.exception.application.data;
import java.io.IOException; 
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson; // WEB-INF/lib/gson-2.8.5.jar

public class DataAnalysisException {
	public static void main(String[] args) {
		// 市售米抽檢不合格
		String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		try {
			URL url = new URL(path); // Created an object of URL
			InputStream inputDataFromResource = url.openStream(); // Get the stream data
			Scanner scanner = new Scanner(inputDataFromResource, "utf-8");
			String jsonStr = scanner.useDelimiter("\\A").next();
			// System.out.println(jsonStr);
			Gson gson = new Gson();
			Toxin[] rices = gson.fromJson(jsonStr, Toxin[].class);
			System.out.printf("資料總筆數: %d\n", rices.length);
			String keyword = "冠軍";
			System.out.printf("品名關鍵字: %s 的資料下:\n", keyword);
			for (Toxin toxin : rices) {
				if (toxin.品名.contains(keyword)) {
					System.out.printf("品名: %s Title: %s 不合格原因: %s\n", toxin.品名, toxin.Title, toxin.不合格原因);
				}
			}
		} catch (IOException e) { // 因為 MalformedURLException | IOException 有繼承關係所以只要寫 IOException 即可
			System.out.println(e);
		}		
	}
}
