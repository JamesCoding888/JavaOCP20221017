package com.ocp.day7;
/*
 * Java 1.5 之前版本，不支援 
 * 1) auto-boxing 
 * 2) Annotation of "@Override"
 */

// Child Class (子類別)
// Inheritance of Parent Class: Person
public class Student extends Person {
    
	private int score; // int -> Integer , Suggested to be a type of Boxing
    
    // Encapsulation of getter method
    public Integer getScore() {
        return score;
    }

    // Encapsulation of setter method
    public void setScore(int score) {
        this.score = score;
    }
    
    // Override the method of Parent class (i.e., Person.class)
    // 覆寫父類別 Person 的方法
    @Override
    public void job() {
        //super.job();
        System.out.println("讀書");
    }
    
    /*    
     Returns a string representation of the object, 
     which is "public String toString() { ... }, 
     from Object.class.
     
     覆寫 Object 類別中的 "public String toString() { ... }。
     因建立任一的 Class （例如: Student.class)，系統會自動產生無參數建構子，
     其建構子中之默認函數 "super()" 會調用父類別的 public Object() { }，
     意思就是說，任意的 Class 都繼承 Object.class     
    */
    @Override
    public String toString() {
        return "Student{" + "score = " + score + '}';
    }
    
}