package com.ocp.day14.pojo;

import java.util.HashSet;
import java.util.Set;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overriding equals() to compare based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Overriding hashCode() to return a hash based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Implementing compareTo() for sorting by age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    // toString() method to print person details
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("David", 30);
        Person p2 = new Person("David", 30);

        set.add(p1);
        set.add(p2);

        // p1 and p2 should be considered the same if equals and hashCode are correctly overridden
        System.out.println(set.size() + " " + set.toString());  // Should print 1 if equals and hashCode are correct
        
    }
}

    