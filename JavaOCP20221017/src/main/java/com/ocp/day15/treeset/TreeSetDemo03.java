package com.ocp.day15.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo03 {

	public static void main(String[] args) {
		
		// 每次調用同一個 list 物件來存取字串 "1"
//		List<String> list = new ArrayList<>();
		double sum = 0.0;		
		// 執行 100 次迴圈
		for (int t = 0; t <= 100; t++) {
			// 每次調用新的 list 物件
			TreeSet<String> list = new TreeSet<>();
			long start = System.nanoTime();	
			// 執行 1,000,000 筆資料運算
			for (int n = 1; n <= 1000000; n++) {
				list.add("1");
			}
			// 避免計算效能誤差，不在此將數值轉成 10^-9，因為最後 stop 區域變數存取轉換後的數值，可能已不是原先的時間點
			long stop = System.nanoTime();
			// 已存取的 stop 區域變數數值在做 10^-9 轉換，會比較好
			double duration = (stop - start) * Math.pow(10, -9);
			sum += duration;
		}
		
		System.out.printf("Average duration of 100 times: %f ", sum / 100.0);
		
		
		
		
		/*
			// Creating TreeSet and adding elements to it
			TreeSet<String> tree_set = new TreeSet<String>();
			
			tree_set.add("Manish");
			tree_set.add("Kartik");
			tree_set.add("Anand");
			tree_set.add("Sahil");
	
			// Traversing elements of TreeSet
			Iterator<String> it = tree_set.iterator();
	
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		*/
	}

}
