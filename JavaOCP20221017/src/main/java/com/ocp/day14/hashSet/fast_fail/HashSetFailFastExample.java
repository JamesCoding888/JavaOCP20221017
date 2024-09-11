package com.ocp.day14.hashSet.fast_fail;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetFailFastExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.printf("%s %s\n", LocalDateTime.now(), set);
        // 使用迭代器遍歷 HashSet
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // 在迭代過程中修改 HashSet，會導致 ConcurrentModificationException
            if (element.equals("B")) {
                set.remove("C"); // Exception in thread "main" java.util.ConcurrentModificationException
            }
        }
        System.out.printf("%s %s\n", LocalDateTime.now(), set);
    }
}
