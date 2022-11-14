package com.ocp.day6;
// This lesson will share you how to use API of "ArrayList"
// 此節將介紹如何使用 ArrayList 的 API
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
    	// Firstly we create an Object of dynamic array with "new ArrayList<T>"
    	// T is the type of element(s)
    	// Here the sample code we do use type of String 
    	// 首先建立一個動態的 ArrayList<T> 物件
    	// T 係指元素資料的型別
    	// 在此的程式範例，我們使用 String 的資料型別
    	/*
    	 	讀者請留意，底下兩種程式碼撰寫，係相同的功能，開發者可任意使用
    	 	ArrayList<String> names = new ArrayList<String>();
    	 	ArrayList<String> names = new ArrayList<>();
    	 */
    	ArrayList<String> arrayList = new ArrayList<>();
    	// Print out the value of all element(s) in dynamic array
    	// 印出動態陣列所有元素內容
        System.out.println(arrayList); 
        // Print out the the number of elements in this list
        // 印出動態陣列的元素個數
        System.out.println(arrayList.size()); 
        
        // Appends the specified element(s) to the end of this list 
        // 加入元素
        arrayList.add("James");
        arrayList.add("Betty");
        arrayList.add("Jack");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        // Returns the element at the specified position in this list
        // 取得 ArrayList 陣列中的特定元素值
        System.out.println(arrayList.get(1)); 

        // Removes the element at the specified position in this list
        // A kindly reminder to reader, the right of removed element will be shifted to the left position
        // 刪除/移除 ArrayList 陣列中的特定元素值
        // 請讀者注意，被移除的元素，最右邊的元素之位址，會往左進一
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        // for-each to print out the each element(s) of ArrayList
        // 利用 for-each 逐一印出所有元素內容
        for(String valueOfElement : arrayList) {
            System.out.println(valueOfElement);
        }
        // Replaces the element at the specified position in this list with
        // the specified element
        // Syntax: set(index, modified value of specified position)
        // 修改某一個特定的元素位址，利用內建 API - set method
        // 修改利用 set(index, 修改的資料內容)
        // 將 James 改為 David
        System.out.println("修改前: " + arrayList);
        arrayList.set(0, "David");
        System.out.println("修改後: " + arrayList);     
    }
}