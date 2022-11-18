package com.ocp.day7_2;
/*
 * Java 1.5 之前版本，不支援 
 * 1) auto-boxing
 * 2) Annotation of "@Override"
 */


// Super Class (父類別) of Student.class and Teacher.class
public class Person {
	// These Global Variables only could be Visible in SAME Class, due to accessibility in "Private"
	// 全域變數，只可在此 Person class 中，被調用，因為權限是 Private
    private String name;
    private int age;    // int -> Integer , Suggested to be a type of Boxing
    

    // Constructors with arguments - name and age
    // 有參數建構子 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Encapsulation of getter method
    public String getName() {
        return name;
    }

    // Encapsulation of setter method
    public void setName(String name) {
        this.name = name;
    }
    
    // Encapsulation of getter method
    public int getAge() {
        return age;
    }

    // Encapsulation of setter method
    public void setAge(int age) {
        this.age = age;
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
        return "Person{" + "name = " + name + ", age = " + age + '}';
    }
    
}
