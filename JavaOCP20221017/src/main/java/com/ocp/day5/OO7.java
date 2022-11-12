package com.ocp.day5;
import java.util.Arrays;

public class OO7 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("John", 80),
            new Student("Mary", 40),
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };
        // 印出及格者的平均分數 = ?
        // Java Stream
        double avg =  Arrays.stream(students)
                            .mapToInt(stud -> stud.score) // 80, 40, 90, 70, 50
                            .filter(score -> score >= 60)
                            .average()
                            .getAsDouble();
        System.out.println(avg);
    }
}

/*
	Console:
			80.0


*/