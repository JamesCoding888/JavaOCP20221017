package com.ocp.day5;
public class Student {
	// 物件變數
	String name;
	int score;
	// Constructor 
	public Student() {
		System.out.println("建立 Student 物件");
	}
	
	// 有參數建構子
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// 物件方法
	// 印出學生資料之方法
	public void printStudentData() {
		System.out.println(name + " " + score);
	}
	
}
