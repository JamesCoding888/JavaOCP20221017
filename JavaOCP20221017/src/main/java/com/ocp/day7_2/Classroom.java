package com.ocp.day7_2;

import java.util.ArrayList;
import java.util.Arrays;

// 組合模式
public class Classroom {
	
	// These Global Variables only could be Visible in SAME Class, due to accessibility in "Private"
	// 全域變數，只可在此 Classroom class 中，被調用，因為權限是 Private
	private int id; // number of classromm (教室編號)
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

	// 計算學生平均成績
	public double getScoreOfAvg() {
		if (students.size() == 0) {
			return 0.0;
		}
		return students.stream().mapToInt(Student::getScore)
				// .mapToInt(student -> student.getScore())
				.average().getAsDouble();
	}

	// 計算平均年齡
	public double getAgeOfAvg() {
		double avg = 0.0;
		if (teacher == null && students.size() == 0) {
			return avg;
		}
		if (teacher != null && students.size() == 0) {
			return teacher.getAge();
		}
		// 先計算出學生平均年齡
		double studentAgeOfAvg = students.stream().mapToInt(Student::getAge).average().getAsDouble();
		// 有學生沒有老師的情況下
		if (teacher == null) {
			return studentAgeOfAvg;
		}
		// 有學生有老師的情況下
		// 先計算出學生年齡總和 + 老師的年齡
		int sumOfAge = students.stream().mapToInt(Student::getAge).sum() + teacher.getAge();
		avg = sumOfAge / (double) (students.size() + 1);
		return avg;
	}

	
	/*    
    Returns a string representation of the object, 
    which is "public String toString() { ... }, 
    from Object.class.
    
    覆寫 Object 類別中的 "public String toString() { ... }。
    因建立任一的 Class，系統會自動產生無參數建構子，
    其建構子中之默認函數 "super()" 會調用父類別的 public Object() { }，
    意思就是說，任意的 Class 都繼承 Object.class     
    */
	@Override
	public String toString() {
		return "Classroom{" + "id=" + id + ", teacher=" + teacher + ", students=" + students + '}';
	}

}