package com.ocp.day5;
public class Student {
	// Global Variable 
	// 全域變數
	String name;
	Integer score; // Supposed to be a type of Boxing (應該使用 Boxing 的 type，不建議使用 int)
	
	// Default Constructor 
	public Student() {
		super(); // 此行程式碼可寫可不寫，系統預設會自動幫您帶入此程式
		System.out.println("建立 Student 物件");
	}
	
	// Constructor with arguments
	// 有參數建構子
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// Print out the value of global variable by void method
	// 印出學生資料之方法
	public void printStudentData() {
		System.out.println(name + " " + score);
	}
	
}
