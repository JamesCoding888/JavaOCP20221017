package com.ocp.day6;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 動態陣列<元素資料型別>
        ArrayList<String> names = new ArrayList<>(); // new ArrayList<String>();
        System.out.println(names); // 印出動態陣列所有元素內容
        System.out.println(names.size()); // 元素個數
        // 加入元素
        names.add("John");
        names.add("Mary");
        names.add("Jack");
        System.out.println(names);
        System.out.println(names.size());
        // 取得元素
        System.out.println(names.get(1));
        // 刪除/移除元素
        names.remove(1);
        System.out.println(names);
        System.out.println(names.size());
        // 利用 for-each 逐一印出所有元素內容
        for(String name : names) {
            System.out.println(name);
        }
        // 修改利用 set(index, 修改的資料內容)
        // 將 John 改為 Helen
        // [John, Jack] -> [Helen, Jack]
        System.out.println("修改前: " + names);
        names.set(0, "Helen");
        System.out.println("修改後: " + names);
        
    }
}