package com.ocp.day15.efficiency;
/*
 	本次 List 效率實驗，如下：
*/

import java.util.ArrayList;
import java.util.List;
public class ListEfficiency {
	public static void main(String[] args) {
		// 每次調用同一個 list 物件來存取字串 "1"
//		List<String> list = new ArrayList<>();
		double sum = 0.0;		
		// 執行 1,000,000 筆資料運算
		for (int t = 0; t <= 100; t++) {
			// 每次調用新的 list 物件
			List<String> list = new ArrayList<>();
			long start = System.nanoTime();			
			for (int n = 1; n <= 1000000; n++) {
				list.add("1");
			}
			// 避免計算效能誤差，不在此將數值轉成 10^-9，因為最後 stop 區域變數存取轉換後的數值，可能已不是原先的時間點
			long stop = System.nanoTime();
			// 已存取的 stop 區域變數數值在做 10^-9 轉換，會比較好
			double duration = (stop - start) * Math.pow(10, -9);
			sum += duration;
		}
		System.out.printf("Average duration: %f ", sum / 100.0);
	}
}

/*
	Console 1) - 每次調用同一個 list 物件:
			Average duration: 0.028037 
	
	Console 2) - 每次調用新的 list 物件: 			
			Average duration: 0.018791
			
	Summary:
		每次調用同一個 list 物件，經運算結果，反而時間多 0.009246s。
		也就是說，開發者若對於效能很講究，用記憶體空間來換取效能，也不失為一個解決方法。
		畢竟現今 SSD 的價格低廉，在絞盡思考如何優化程式碼的效能，可能花錢的方式會更有效率。
		
*/
