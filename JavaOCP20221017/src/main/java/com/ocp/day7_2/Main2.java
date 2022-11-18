package com.ocp.day7_2;

public class Main2 {
	
	public static void main(String[] args) {
		Classroom classroom = new Classroom(405);
		
		Teacher teacher = new Teacher("Helen", 30, 70000);
		
		Student s1 = new Student("John", 18, 90);
		Student s2 = new Student("Mary", 17, 75);
		Student s3 = new Student("Anita", 20, 100);
		
		classroom.setTeacher(teacher);
		
		classroom.addStudent(s1);
		classroom.addStudent(s2);
		classroom.addStudent(s3);
		
		System.out.println(classroom);
		
		// 請求此班級出學生平均成績 ?
		double avg = classroom.getScoreOfAvg();
		System.out.println(avg);
		
		// 請求出此班級平均年齡
		System.out.println(classroom.getAgeOfAvg());
	}
}