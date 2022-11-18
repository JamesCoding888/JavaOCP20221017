package com.ocp.day7_2;
// This lesson we give a following introduction:
// 1) Inheritance
// 2) Encapsulation
// 3) Auto-boxing
// 4) Annotation of Override
public class Main {
	
    public static void main(String[] args) {
        // Initialization of arguments - name, age and score with created Constructors
    	// 將有參數建構子的 name、age 和 score 初始化
    	Student student1 = new Student("James", 18, 100);    	
        System.out.println(student1);   
        
        // Initialization of arguments - name, age and score with created Constructors
    	// 將有參數建構子的 name、age 和 score 初始化
        Student student2 = new Student("Betty", 28, 90);
        System.out.println(student2);
        
        // Initialization of arguments - name, age and salary with created Constructors
    	// 將有參數建構子的 name、age 和 salary 初始化
        Teacher teacher = new Teacher("David", 45, 70000);
        System.out.println(teacher);
    }
}

/*

	Console:
		Student{score = 100}Person{name = James, age = 18}
		Student{score = 90}Person{name = Betty, age = 28}
		Teacher{salary = 70000}Person{name = David, age = 45}
		
*/