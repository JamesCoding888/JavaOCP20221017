package com.ocp.day5;
/*
		According to the previously program (i.e., OO3.java), you will learn how to print out the value of global variable from void method
		
		依先前課程 (也就是 003.java)，您將可學到如何將全域變數的值，由 void 方法印出 
*/

// 4th pattern of Object-Oriented
public class OO4 {
    public static void main(String[] args) {

    	// Create Object by Constructors and also initialize the global variables
        Student s1 = new Student("John", 90);
        Student s2 = new Student("Mary", 80);
        Student s3 = new Student("Helen", 95);
        
        // Print out the value of global variable from void method
        s1.printStudentData();
        s2.printStudentData();
        s3.printStudentData();
        
    }
}


/*
	Console:
			John 90
			Mary 80
			Helen 95

*/