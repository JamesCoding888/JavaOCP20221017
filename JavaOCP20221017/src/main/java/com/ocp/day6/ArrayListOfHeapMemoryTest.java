package com.ocp.day6;
/*
   在做壓力測試時，需清楚了解系統之最嚴苛的使用狀況下，最多可分配多少的 RAM 給 JVM 使用。 
   1) 底下程式碼，係實驗目前測試環境之最大的 heap memory 可容忍的測試數值
   2) 若在有限的 heap memory 供給 JVM 使用時，但又得讓更多筆新增資料被 ArrayList 管理，如何優化程式之架構呢？
   	  我們可切分多個 ArrayList 物件，再交由一個 ArrayList 的 Container 來管理
   3) 如果 2) 的方式，其 heap memory 還不夠給 JVM 使用，我們可從硬體著手，也就是在 Run Configurations 中的 VM arguments，下指令。
      Command: -Xms1000m
	  Description: 1M （若硬體允許，可開到最大來做測試。例如本系統 Mac M1 內建 8M DDR4，那指令可改為 -Xms8000m）
	  
*/
import java.util.ArrayList;

public class ArrayListOfHeapMemoryTest {
	public static void main(String[] args) {
		// 1)
		System.out.println("Giving the limited number to be 236557360 for testing the heap memory");
		ArrayList<String> arrayList = new ArrayList<>();
		String repeatedName = "1";
		for(long n = 1 ; n <= 236557360 ; n++) { // the max heap memory: 236557360
			arrayList.add(repeatedName);			
		}
		
		System.out.printf("heap memory is Sufficient to handle with this limited number: %s!\n", arrayList.size());

		// 2)
		ArrayList<ArrayList<String>> arrayListContainer = new ArrayList<>();
		ArrayList<String> arrayList1 = new ArrayList<>(); 
		ArrayList<String> arrayList2 = new ArrayList<>(); 
		ArrayList<String> arrayList3 = new ArrayList<>(); 
		
		System.out.println("The limited number will be enhanced to " + 105136605 * 3); // 315409815
		arrayListContainer.add(arrayList1);
		arrayListContainer.add(arrayList2);
		arrayListContainer.add(arrayList3);
		
		for(long n = 1 ; n <= 105136605 ; n++) {  
			arrayList1.add(repeatedName);
			arrayList2.add(repeatedName);	
			arrayList3.add(repeatedName);	
		}
		
		System.out.printf("Allocate an ArrayListContainer to collect all Object of ArrayList to test limited number: %s , Successfully !\n", arrayList1.size() + arrayList2.size() + arrayList3.size());
		
		// 3)
		System.out.println("Allocated more resource from RAM to JVM for testing the limited number: 709672080, by giving VM with -Xms7000M");
		ArrayList<String> arrayListVMCommand = new ArrayList<>();
		for (long n = 1; n <= 236557360 * 2; n++) {
			arrayListVMCommand.add(repeatedName);
		}

		System.out.printf("heap memory is Sufficient to handle with this limited number: %s!\n", arrayListVMCommand.size());
	}
}


/*
	Console:
		Giving the limited number to be 236557360 for testing the heap memory
		heap memory is Sufficient to handle with this limited number: 236557360!
		The limited number will be enhanced to 315409815
		Allocate an ArrayListContainer to collect all Object of ArrayList to test limited number: 315409815 , Successfully !
		Allocated more resource from RAM to JVM for testing the limited number: 709672080, by giving VM with -Xms7000M

*/
