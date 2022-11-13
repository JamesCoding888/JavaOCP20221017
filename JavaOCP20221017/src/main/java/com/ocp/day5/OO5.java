package com.ocp.day5;
public class OO5 {
    public static void main(String[] args) {
    	// Create 1-D array of Student with 10 Fixed Memory
    	// 建立一維陣列的學生物件，並給予 10 固定的記憶體位置
        Student[] students = new Student[10];  // 預設每個元素都是 null
        // 在陣列的第一個位置 (也就是 '0' 的物件)，將 global variable 初始化
        students[0] = new Student("John", 90); 
        // 在陣列的第二個位置 (也就是 '1' 的物件)，將 global variable 初始化
        students[1] = new Student("Mary", 80);
        // 依此類推，就不在撰寫 student[2] ~ student[9] 的程式碼
        // ...

        // Print out the memory of 1-D array Object at 0, 1 and 9
        // 印出一維陣列的 0, 1, 9 位置的記憶體
        System.out.println(students[0]);
        System.out.println(students[1]);
      
        
        // Because the 1-D array object at 10th memory 
        // is NOT initiated by Constructor of Student.
        // Therefore, the result of students[9] is null
        // 因為一維陣列的第十個位置之記憶體，尚未被 Student 建構子產生 Object 的記憶體
        // 因此印出的結果為 null
        System.out.println(students[9]); 
        
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
        // Index 10 out of bounds for length 10
        // 如上述一開始提到，一維陣列的固定長度為 10
        // 當嘗試拋出第 11 的記憶體位置時，已經超出預先配置好的記憶體空間
        // 因此在 Java JRE (Java Run Time) machine，會幫開發者拋出例外
        System.out.println(students[10]);
        
        
        // Here we're going to print out the actually value of global variable as following
        // 印出一維陣列在 0, 1, 9 記憶體中的 Student Objects，並調用全域變數的值
        System.out.println(students[0].name + " " + students[0].score);
        System.out.println(students[1].name + " " + students[1].score);
        
        // Exception in thread "main" java.lang.NullPointerException: 
        // Cannot read field "name" because "students[9]" is null    
        // 一維陣列在第 10 的記憶體位置，沒有被 Student 建構子產生一個 Student 的物件
        // 因此 students[9].name 或 students[9].score 的值都為 null
        // 在 Java JRE (Java Run Time) machine，當在調用 System.out.println 之 API，去印出物件的值時
        // 如果物件的值是 null，則會拋出 "NullPointerException" 
        // 意思就是說，系統會主動告知開發者，此物件的值為 Null，根本就沒被初始化，僅僅作為提醒之
        // 這個好處是，開發者可藉由判斷物件值是否為 "Null"，如果是，則不進行後續的業務邏輯運算
        System.out.println(students[9].name + " " + students[9].score);
    }
}
/* 		
		
		"Please to be noticed here, the value of memory could be differently, according to the JSE version. 
		This sample code is run by JSE: 11.0 and JRE: 16.0.1, for your info." 
		
		Console: 
				com.ocp.day5.Student@1b701da1
				com.ocp.day5.Student@1edf1c96
				null
		

*/