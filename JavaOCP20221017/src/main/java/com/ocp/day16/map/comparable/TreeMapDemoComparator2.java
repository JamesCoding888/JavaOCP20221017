package com.ocp.day16.map.comparable;
import java.util.Comparator; 
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemoComparator2 {

    public static void main(String[] args) {
        // In this Java code, you're creating a TreeMap with a custom comparator
        // using the Comparator.reverseOrder() to sort the keys in descending order.
        // Here's a breakdown of how the code works:

        // Exam and Student Classes (Assumed):
        // The code assumes you have two classes:
        // Exam, which has a subject (String) and a score (int).
        // Student, which has an id (int) and a name (String).

        // Instantiate objects of Exam
        Exam exam01 = new Exam("Mathematics", 98);
        Exam exam02 = new Exam("Microwave Engineering", 88);
        Exam exam03 = new Exam("RFIC Design", 59);
        Exam exam04 = new Exam("Java-1z0-819", 87);

        // Instantiate objects of Student
        Student student02 = new Student(2, "James");
        Student student03 = new Student(3, "David");
        Student student04 = new Student(4, "Elon");
        Student student01 = new Student(1, "Betty"); // Swap the position with student02

        // TreeMap Construction:
        // A TreeMap normally sorts entries by their keys in ascending order, 
        // but here you're using Comparator.reverseOrder() to reverse the natural order (descending).

        // Create a TreeMap with the custom comparator
        Map<Integer, Exam> treeMap1 = new TreeMap<>(Comparator.reverseOrder());

        // Steps in the Code:
        // First, you instantiate four Exam objects and four Student objects.
        // Then, you create a TreeMap<Integer, Exam> where:
        // The key is the student's id.
        // The value is the corresponding Exam object.
        // The TreeMap is sorted by the student id in descending order due to Comparator.reverseOrder().
        
        // Add Student and Exam objects to the map
        treeMap1.put(student01.getId(), exam01);
        treeMap1.put(student02.getId(), exam02);
        treeMap1.put(student03.getId(), exam03);
        treeMap1.put(student04.getId(), exam04);

        // When printed, the students and their exams appear in descending order of student IDs.
        System.out.println(treeMap1);
    }
}

/**
 *
 * {4=Exam [subject=Java-1z0-819, score=87], 3=Exam [subject=RFIC Design, score=59], 2=Exam [subject=Microwave Engineering, score=88], 1=Exam [subject=Mathematics, score=98]} 
 */  

