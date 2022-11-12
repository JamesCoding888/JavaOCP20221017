package com.ocp.day5;

public class OO2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.score = 90;
        Student s2 = new Student();
        s2.name = "Mary";
        s2.score = 80;
        Student s3 = new Student();
        s3.name = "Helen";
        s3.score = 95;
        System.out.println(s1.name + " " + s1.score);
        System.out.println(s2.name + " " + s2.score);
        System.out.println(s3.name + " " + s3.score);
    }
}


/*
	Console:
			建立 Student 物件
			建立 Student 物件
			建立 Student 物件
			John 90
			Mary 80
			Helen 95


*/
