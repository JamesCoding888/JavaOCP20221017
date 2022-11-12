package com.ocp.day5;
public class OO5 {
    public static void main(String[] args) {
        Student[] students = new Student[10]; // 預設每個元素都是 null
        students[0] = new Student("John", 90); // 配置 Student 物件
        students[1] = new Student("Mary", 80); // 配置 Student 物件
        // 必須一個一個配置 ...
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[9]);
    }
}
/*
		Console:
				com.ocp.day5.Student@1b701da1
				com.ocp.day5.Student@1edf1c96
				null

*/