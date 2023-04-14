package com.ocp.day7_2;
/*
		This is a Java program that demonstrates concepts of object-oriented programming such as inheritance, encapsulation, auto-boxing, annotation of override, 
		
		and the use of the Stream API to calculate the average age and score.
		
		This lesson we give a following introduction:
 		1) Inheritance
 		2) Encapsulation
 		3) Auto-boxing
 		4) Annotation of Override
 		5) Application of Stream API to calculate the average age and score
*/


public class Main2 {
	
	public static void main(String[] args) {
		
		// Initialize the Global variable of id by Constructor of Classroom
	    // 有參數建構子 Classroom 將 id 全域變數初始化
		Classroom classroom = new Classroom(405);
		
		// Initialize the variables of name, age, and salary by Constructor of Teacher
	    // 有參數建構子 Teacher 將變數 name、age 和 salary 初始化
		Teacher teacher = new Teacher("James", 18, 70000);
		
		// Initialize the variables of name, age, and salary by Constructor of Student
	    // 有參數建構子 Student 將變數 name、age 和 score 初始化
		Student student1 = new Student("Jack", 28, 100);
		Student student2 = new Student("Tim", 47, 75);
		Student student3 = new Student("Mercy", 30, 90);
		
		// Encapsulation of setter method
		classroom.setTeacher(teacher); // setTeacher(teacher) -> Teacher teacher = new Teacher("James, 18, 70000)
		
		// Appends the specified element(s) (i.e., object of Student) to the end of this list 
		// 使用 "ArrayList.add" 新增功能，新增一筆學生資料至 ArrayList 中
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		classroom.addStudent(student3);
		
		/*    
	    Override the method of "public String toString() { ... } from Object.class
	    with Customization method of public String toString() { ... } from Classroom.class
	    
	    Classroom.class 中，使用客製化的 Public String toString() { ... } 去覆寫 Object.class 中的 "public String toString() { ... }。
	    因建立任一的 Class，系統會自動產生無參數建構子，
	    其建構子中之默認函數 "super()" 會調用父類別的 public Object() { }，
	    意思就是說，任意的 Class 都繼承 Object.class     
	    */
		System.out.println("Print out the object reference of Classroom: " + classroom);
		
		
		// To get the Average score from student(s)
		// 計算學生平均成績
		double avgScoreOfStudents = classroom.getAvgScoreOfStudents();
		System.out.printf("Get the average score from student(s): %.3f (by 3rd decimal place)\n", avgScoreOfStudents);
		
		
		// Get the average age of teacher and all students from Classroom
		// 求出此班級的老師和總學生之平均年齡
		System.out.println("Get the average age of teacher and all students from classroom: "+ classroom.getAvgAgeOfTeacherAndStudents());
	}
}


/*
 	Console:
 				Print out the object reference of Classroom: Classroom{id = 405, teacher = Teacher{salary = 70000}Person{name = James, age = 18}, students = [Student{score = 100}Person{name = Jack, age = 28}, Student{score = 75}Person{name = Tim, age = 47}, Student{score = 90}Person{name = Mercy, age = 30}]}
				Get the average score from student(s): 88.333 (by 3rd decimal place)
				Get the average age of teacher and all students from classroom: 30.75


*/
