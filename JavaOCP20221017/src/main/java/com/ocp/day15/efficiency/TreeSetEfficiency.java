package com.ocp.day15.efficiency;

import java.util.TreeSet;
public class TreeSetEfficiency {
	public static void main(String[] args) {
		// 每次調用同一個 treeSet 物件來存取字串 "1"
//		TreeSet<String> treeSet = new TreeSet<>();
		double sum = 0.0;		
		// 執行 100 次迴圈
		for (int t = 0; t <= 100; t++) {
			// 每次調用新的 treeSet 物件
			TreeSet<String> treeSet = new TreeSet<>();
			long start = System.nanoTime();	
			// 執行 1,000,000 筆資料運算
			for (int n = 1; n <= 1000000; n++) {
				treeSet.add("1");
			}
			// 避免計算效能誤差，不在此將數值轉成 10^-9，因為最後 stop 區域變數存取轉換後的數值，可能已不是原先的時間點
			long stop = System.nanoTime();
			// 已存取的 stop 區域變數數值在做 10^-9 轉換，會比較好
			double duration = (stop - start) * Math.pow(10, -9);
			sum += duration;
		}	
		System.out.printf("Average duration of 100 times: %f ", sum / 100.0);		
	}
}

/*
	Console 1) - 每次調用同一個 treeSet 物件:
			Average duration: 0.004431
	
	Console 2) - 每次調用新的 treeSet 物件: 			
			Average duration: 0.003804 
			
	Summary:
		每次調用同一個 treeSet 物件，經運算結果，反而時間多 0.000627。
		
		請比對 ListEfficiency.java 的 Console 結果，很驚訝地發現，TreeSet 的執行效率是 List 的 6 倍。
		 
		
*/
