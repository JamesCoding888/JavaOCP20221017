package com.ocp.day5;
import java.util.Arrays;

public class OO8 {
    public static void main(String[] args) {
        Student[] stu1 = {
            new Student("John", 80),
            new Student("Mary", 40)
        };
        Student[] stu2 = {
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };
        Student[][] studentses = {stu1, stu2};
        System.out.println(studentses);
        // 印出及格者的平均分數 = ?
        double avg = Arrays.stream(studentses) // student 二維陣列 stream
                           .flatMap(studs -> Arrays.stream(studs)) // student 一維陣列 stream
                           .mapToInt(stud -> stud.score) // [80, 40, 90, 70, 50] int stream
                           .filter(score -> score >= 60) // 過濾
                           .average() // 平均
                           .getAsDouble(); // 取得平均的 double 值
        System.out.println(avg);
        
    }
}

/*
	Console:
			[[Lcom.ocp.day5.Student;@1b701da1
			80.0


*/