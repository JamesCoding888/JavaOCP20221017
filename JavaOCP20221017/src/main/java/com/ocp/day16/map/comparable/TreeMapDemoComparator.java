package com.ocp.day16.map.comparable;
/*
	The code provided demonstrates the usage of a custom comparator with a TreeMap to sort the entries based on the keys. 
	
	The TreeMap is created with the custom comparator, and the keys are of type Integer. 
	
	The sorting is performed in reverse order of the keys using the custom comparator.
*/
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class CustomComparator implements Comparator<Integer> {
  
	@Override
    public int compare(Integer num1, Integer num2) {
        // Custom comparison logic
        // Return a negative value if num1 should be less than num2
        // Return a positive value if num1 should be greater than num2
        // Return 0 if num1 and num2 are considered equal

        // For example, sorting in reverse number order
        return num2.compareTo(num1);
    }
}

public class TreeMapDemoComparator {
	public static void main(String[] args) {
		
		// Create a custom comparator
        Comparator<Integer> customComparator = new CustomComparator();

		// Instantiate objects of Exam
		Exam exam01 = new Exam("Mathematics", 98);
		Exam exam02 = new Exam("Microwave Engineering", 88);
		Exam exam03 = new Exam("RFIC Design", 59);
		Exam exam04 = new Exam("Java-1z0-819", 87);

		// Instantiate objects of Student
		Student student02 = new Student(2, "James");
		Student student03 = new Student(3, "David");
		Student student04 = new Student(4, "Elon");
		Student student01 = new Student(1, "Betty"); // swap the position with student02
		
		// Create a TreeMap with the custom comparator
		Map<Integer, Exam> treeMap1 = new TreeMap<>(customComparator);
		treeMap1.put(student01.getId(), exam01);
		treeMap1.put(student02.getId(), exam02);
		treeMap1.put(student03.getId(), exam03);
		treeMap1.put(student04.getId(), exam04);
		System.out.println(treeMap1);
	}
}

/*
	Console:
			{4=Exam [subject=Java-1z0-819, score=87], 3=Exam [subject=RFIC Design, score=59], 2=Exam [subject=Microwave Engineering, score=88], 1=Exam [subject=Mathematics, score=98]}

			
*/