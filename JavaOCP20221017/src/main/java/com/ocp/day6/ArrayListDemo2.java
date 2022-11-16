/************************************************************************************************************
* 	Before studying this lesson, please go back to package: ScannerPractice for deeply learning of Scanner  *
*	開始學習本課程之前，請讀者先將 package: ScannerPractice 的課程研讀後，再回來此節									*
*************************************************************************************************************/


package com.ocp.day6;

// Following the previously lesson (i.e., ArrayListDemo1.java),   
// we design an Office Check-in System with function of CRUD by ArrayList.
// 此課程延續 ArrayListDemo1.java，設計一個 CRUD 的簽到系統，使用 ArrayList API

import java.awt.Toolkit;   
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDemo2 {
    // Create a static variable - new ArrayList<>()
	// 建立類別變數來存放所有簽到資料 
    static ArrayList<String> names = new ArrayList<>();
    
	// Create an Global Object variable for user to choose service
	// 建立一個全域物件變數，給使用者輸入所需的服務
	static Scanner scanner = new Scanner(System.in);
    
    // Entry point of programming
    // 程式進入起始點
    public static void main(String[] args) {
    	// an infinite loop to execute menu() method
    	// 無窮迴圈，不斷執行 menu() 方法
        while (true) {            
             menu();
        }
    }
    // The menu of Office Check-in System
    // 系統功能目錄
    public static void menu() {
        System.out.println("簽到系統");
        System.out.println("----------------");
        System.out.println("1. 簽到");
        System.out.println("2. 修改");
        System.out.println("3. 刪除");
        System.out.println("4. 單筆查詢");
        System.out.println("5. 全部查詢");
        System.out.println("6. 多筆(批次)新增");
        System.out.println("7. 根據人名來修改");
        System.out.println("8. 根據人名來刪除");
        System.out.println("9. 清空打卡資訊");
        System.out.println("0. Exit");
        System.out.println("----------------");
        System.out.print("請選擇: ");
        
        
        // Scans the next token of the input as an "int"
        int choice = scanner.nextInt(); 
        // The allocator of services
        // 這裡稱之為服務選項之分派器
        switch (choice) {
            case 1:
                add(); // Check-in (簽到)
                break;
            case 2:
                update(); // Update (修改)
                break;
            case 3:
                delete(); // Delete (刪除)
                break;
            case 4:
                findOne(); // QueryForOneRow (單筆查詢)
                break;
            case 5:
                findAll(); // QueryForAllRow (全部查詢)
                break;
            case 6:
                batchAdd(); // Multiple added (多筆 "批次" 新增) 
                break;
            case 7:
                updateByName(); // Update data by Name (根據人名來修改)    
                break;
            case 8:
                deleteByName(); // Delete data by Name (根據人名來刪除)
                break;
            case 9:
                clear(); // Clean all check-in info (清空打卡資訊)
                break;
            case 0:
                exit(); // Exit (離開)
                break;
            default:
            	// API - Alert with beep tone
            	// 發出聲音之 API
                Toolkit.getDefaultToolkit().beep();
                System.out.println("無此選單, 請重新輸入...");
        }
        System.out.println("請按下 y 繼續 ...");
        scanner.next();
        
    }
    
    // 1. Check-in (簽到)
    public static void add() {
        System.out.println("簽到");
        System.out.print("請輸入人名: ");
        String name = scanner.next();
        // API - ArrayList.add(String element)
        // Description: Appends the specified element to the end of this list
        names.add(name); // 將 name 加入到 names 集合中
        System.out.println("簽到完成");
    }
    
    // 2. Update (修改)
    public static void update() {
        System.out.println("修改");
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        System.out.print("請輸入修改後的人名: ");
        String updateName = scanner.next();
        // API - ArrayList.set(int index, String element)
        // Description: Replaces the element at the specified position in this list with the specified element.
        names.set(index, updateName); 
        System.out.println("修改完成");
    }
    
    // 3. Delete (刪除)
    public static void delete() {
        System.out.println("刪除");
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        // API - ArrayList.remove(int index)
        // Removes the element at the specified position in this list. 
        // Shifts any subsequent elements to the left (subtracts one from their indices).
        // 移除 ArrayList 物件中的特定陣列位址的 value，並將此位址右邊的所有位址減 1，也就是往左移一個位址
        names.remove(index); // 移除
        System.out.println("刪除完成");
    }
    
    // 4. QueryForOneRow (單筆查詢)
    public static void findOne() {
        System.out.println("單筆查詢");
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        // API - String ArrayList.get(int index)
        // Returns the element at the specified position in this list.
        // 回傳 ArrayList 物件中的特定陣列位址的 String value
        String name = names.get(index);
        System.out.println("人名: " + name);
    }
    
    // 5. QueryForAllRow (全部查詢)
    public static void findAll() {
        System.out.println("全部查詢");        
        
        /* ArrayList class:         
         * 
	     * The array buffer into which the elements of the ArrayList are stored.
	     * The capacity of the ArrayList is the length of this array buffer. Any
	     * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
	     * will be expanded to DEFAULT_CAPACITY when the first element is added.
	     *  
    	 * transient Object[] elementData; // non-private to simplify nested class access
    	 * 
    	 * 新增的 element(s) 將被暫時性的存放在 Object[] elementData 收集
    	 * 當開發者呼叫 System.out.println(names)，則將 elementData.toString
         */
//        new ArrayList().
//        System.out.println(names);
        System.out.println("資料筆數: " + names.size());
    }
    
    // 6. Multiple added (多筆 "批次" 新增)
    public static void batchAdd() {
        System.out.println("多筆(批次)新增");
        System.out.print("請輸入人名(名字間請用空白隔開): ");
        String allname = scanner.nextLine(); // 讀取一整列
        String[] array = allname.split(" ");
        // 透過 for-each 逐筆新增到 names 中
        for(String name : array) {
            names.add(name);
        }
        System.out.println("多筆(批次)新增完成");
    }
    
    // 7. Update data by Name (根據人名來修改)
    public static void updateByName() {
        System.out.println("根據人名來修改");
        System.out.print("輸入要修改的人名(修改前 修改後): ");
        String pairName = scanner.nextLine();
        String[] array = pairName.split(" ");
        if(array.length == 2) {
            String beforeName = array[0];
            String afterName = array[1];
            for(int index=0;index<names.size();index++) {
                if(names.get(index).equals(beforeName)) {
                    names.set(index, afterName);
                    System.out.println("修改完成");
                    return; // 方法結束
                }
            }
        }
        System.out.println("修改失敗/查無此人");
    }
    
    // 8. Delete data by Name (根據人名來刪除)
    public static void deleteByName() {
        System.out.println("根據人名來刪除");
        System.out.print("請輸入欲刪除的人名: ");
        String name = scanner.next();
        if(names.remove(name)) {
            System.out.println("刪除成功");
        } else {
            System.out.println("刪除失敗");
        }
    }
    
    // 9. Clean all check-in info (清空打卡資訊)
    public static void clear() {
        System.out.print("是否要清空打卡資訊(y/n): ");
        String check = scanner.next();
        if(check.equalsIgnoreCase("y")) {
            names.clear();
            System.out.println("清空打卡資訊成功");
        }
    }
    
    // 0. Exit (離開)
    public static void exit() {
        // status: 0 表示結束當前正在運行的程式
        // status: 1 表示非正常結束
        System.out.println("離開系統");
        // Close scanner
        scanner.close();
        // Terminates the currently running Java Virtual Machine
        System.exit(0); 
    }
    
}