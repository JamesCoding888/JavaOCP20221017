package com.ocp.day7_2;
/*
		This is a Java class named "Classroom" which is designed to manage a classroom's information including its ID, teacher, and students. 
		
		The class has several methods, including constructors with arguments, getters, and setters for the ID and teacher, as well as methods 
		
		for adding and removing students from an ArrayList object.
		
		The class also includes two methods for calculating the average score of students and the average age of the teacher and students. 
		
		The former uses Java's Stream API to retrieve the score of each student and then calculate the average, while the latter calculates the average age of all students and the teacher, 
		
		depending on the number of students present.
*/
import java.util.ArrayList; 
import java.util.Arrays;

// A design pattern of 
public class Classroom {
	
	// These Global Variables only could be Visible in SAME Class, due to accessibility in "Private"
	// 全域變數，只可在此 Classroom class 中，被調用，因為權限是 Private
	private int id; // number of classroom (教室編號)
	private Teacher teacher;  
	private ArrayList<Student> students = new ArrayList<>(); // 建立 ArrayList object 來管理 Student 的物件

	// Constructors with arguments - id
    // 有參數建構子
	public Classroom(int id) {
		this.id = id;
	}

    // Encapsulation of getter method
	public int getId() {
		return id;
	}

    // Encapsulation of setter method
	public void setId(int id) {
		this.id = id;
	}

    // Encapsulation of getter method
	public Teacher getTeacher() {
		return teacher;
	}

    // Encapsulation of setter method
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// Appends the specified element(s) (i.e., object of Student) to the end of this list 
	// 使用 "ArrayList.add" 新增功能，新增一筆學生資料至 ArrayList 中
	public void addStudent(Student student) {
		students.add(student);
	}

	// Removes the element at the specified position in this list
    // A kindly reminder to reader, the right of removed element will be shifted to the left position
    // 刪除/移除 ArrayList 陣列中的特定元素值 (也就是學生的物件)
    // 請讀者注意，被移除的元素，最右邊的元素之位址，會往左進一
	public void removeStudent(int index) {
		students.remove(index);
	}

	// Clean all object of Student from ArrayList 
	// 從 ArrayList 陣列中，將所有學生清空
	public void removeAllStudents() {
		students.clear();
	}
	
	// Customization method to calculate the Average score from student(s)
	// 計算學生平均成績
	public double getAvgScoreOfStudents() {
		// If the length of students is equal to 0, then return 0.0
		// 若 students 的 ArrayList 長度等於 0，則回傳 0.0
		if (students.size() == 0) {
			return 0.0;
		}
		// 使用 Java 1.8 - Stream API，將 ArrayList<Student> 的元素，也就是 Student 的物件 (students)，
		// 由 Student.class 中的 getScore 方法，取得學生每一個學生分數，並運用 .mapToInt 將分數放入 IntStream 中
		return students.stream()
					   /*
						* 請讀者留意，兩種語法都可:
						* 1) .mapToInt(Student::getScore)
						* 2) .mapToInt(students -> students.getScore())
					   */
					   .mapToInt(Student::getScore)
					   // 使用 IntStream 和 OptionalDouble 之 API 獲取平均分數
					   .average().getAsDouble(); 
	}
	
	// Get the average age of teacher and all students
	// 計算老師和學生的總平均年齡
	public double getAvgAgeOfTeacherAndStudents() {
		// Initialize the local variable to be 0.0
		// 區域變數初始化為 0.0
		double avg = 0.0;
		
		// If the object of Teacher is Null and also the length from object of Student in ArrayList is 0
		// 若老師物件未被初始化 且 ArrayList 的長度為 0 (也就是無 Student 的物件０)
		if (teacher == null && students.size() == 0) {
			// return 0.0
			// 回傳 0.0
			return avg;
		}
		
		
		// If the object of Teacher is NOT Null and also the length from object of Student in ArrayList is 0,
		// then return the age of teacher
		// 若老師物件有被初始化 且 ArrayList 的長度為 0 (也就是無 Student 的物件)
		// 則回傳老師的 age
		if (teacher != null && students.size() == 0) {
			return teacher.getAge();
		}
		
		// Get the average age of student(s)
		// 計算出學生平均年齡
		double studentAgeOfAvg = students.stream()										 
										 // 由 Student.class 中的 getScore 方法，取得學生每一個學生分數，並運用 .mapToInt 將分數放入 IntStream 中
										 /*
										  * 請讀者留意，兩種語法都可:
										  * 1) .mapToInt(Student::getScore)
										  * 2) .mapToInt(students -> students.getScore())
										  */
										 .mapToInt(Student::getAge)
										 // 使用 IntStream 和 OptionalDouble 之 API 獲取平均分數
										 .average().getAsDouble(); 

		// If the object of Teacher is NOT Null, then leave the getAgeOfAvg() method by "return" 
		// 若老師物件未被初始化，也就是 Null，則使用 "return" 結束 getAgeOfAvg() 方法
		//若老師有學生沒有老師的情況下
		if (teacher == null) {
			return studentAgeOfAvg;
		}
		
		
		// Add-up age of teacher and student(s)
		// 計算學生年齡和老師年齡之和
		int sumOfAge = students.stream()
							  // 由 Student.class 中的 getScore 方法，取得學生每一個學生分數，並運用 .mapToInt 將分數放入 IntStream 中
							  /*
							   * 請讀者留意，兩種語法都可:
							   * 1) .mapToInt(Student::getScore)
							   * 2) .mapToInt(students -> students.getScore())
							   */
							   .mapToInt(Student::getAge)
							   // IntStream API - sum()，將學生年齡加總，再加上老師年齡
							   .sum() + teacher.getAge(); 
		
		// get the average age (A kindly reminder: Here we need to upcast to double from int 
		// 取得總平均年齡 (讀者留意，需轉型為 double)
		avg = sumOfAge / (double) (students.size() + 1);
		return avg;
	}

	
	/*    
    Override the method of "public String toString() { ... } from Object.class
    with Customization method of public String toString() { ... } from Classroom.class
    
    Classroom.class 中，使用客製化的 Public String toString() { ... } 去覆寫 Object.class 中的 "public String toString() { ... }。
    因建立任一的 Class，系統會自動產生無參數建構子，
    其建構子中之默認函數 "super()" 會調用父類別的 public Object() { }，
    意思就是說，任意的 Class 都繼承 Object.class     
    */
	@Override
	public String toString() {
		return "Classroom{" + "id = " + id + ", teacher = " + teacher + ", students = " + students + '}';
	}

}