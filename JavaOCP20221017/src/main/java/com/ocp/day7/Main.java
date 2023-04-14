package com.ocp.day7;
/*
 		Overall, this code demonstrates object-oriented programming concepts such as inheritance, encapsulation, and polymorphism in Java.
		
		This lesson we give a following introduction:
 		1) Inheritance
 		2) Encapsulation
 		3) Auto-boxing
 		4) Annotation of Override
*/



public class Main {
	
    public static void main(String[] args) {
    	// Create Object by Constructors
        Student student = new Student();
        
        // Initialize the global variables by each Object
        student.setName("James");
        student.setAge(18);
        student.setScore(100);
        
        
    	// Create Object by Constructors
        Teacher teacher = new Teacher();
        
        
        // Initialize the global variables by each Object
        teacher.setName("Betty");
        teacher.setAge(30);
        teacher.setSalary(80000);
        
        
      
        /* 
           The specification of Oracle v1.0 has given the following description of PrintStream.class: 
           
           Description: 
           		
           		Prints a String and then terminate the line.  This method behaves as
           		though it invokes {@link #print(String)} and then
          		{@link #println()}.
         
           		@param x  The {@code String} to be printed.
          
           
           API of PrintStream.class as following:
         
			        public void println(String x) {
			            if (getClass() == PrintStream.class) {
			                writeln(String.valueOf(x));
			            } else {
			                synchronized (this) {
			                    print(x);
			                    newLine();
			                }
			            }
			        }
			讀者留意，student.getName() 回傳的是 String type 而 student.getAge() 回傳的是 int type，
			這兩者 type 不同，但因為上述 API 的方法，會將其轉換成 String type，
			最後由 Object 類別中的 "public String toString() { ... } 將資料拋出。         
        */
        
        System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getScore());
        System.out.println(teacher.getName() + ", " + teacher.getAge() + ", " + teacher.getSalary());
        
        // Invoke the method of Student Class
        // 調用 Student 類別中的 job() 方法
        student.job();

        // Invoke the method of Teacher Class        
        // 調用 Teacher 類別中的 job() 方法        
        teacher.job();
        
        
        /*    
        Returns a string representation of the object, 
        which is "public String toString() { ... }, 
        from Object.class.
        
        覆寫 Object 類別中的 "public String toString() { ... }。
        因建立任一的 Class （例如: Student.class)，系統會自動產生無參數建構子，
        其建構子中之默認函數 "super()" 會調用父類別的 public Object() { }，
        意思就是說，任意的 Class 都繼承 Object.class     
       */
        System.out.println(student); // student.toString();
        System.out.println(teacher); // teacher.toString();
    }
}


/*
	Console:
			James, 18, 100
			Betty, 30, 80000
			讀書
			教課
			Student{score = 100}
			Teacher{salary = 80000}

*/