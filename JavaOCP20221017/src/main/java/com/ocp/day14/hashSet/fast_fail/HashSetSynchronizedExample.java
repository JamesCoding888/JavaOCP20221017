package com.ocp.day14.hashSet.fast_fail;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSynchronizedExample {
    public static void main(String[] args) {
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.printf("%s %s\n", LocalDateTime.now(), set);
        // 必須在同步區塊中迭代集合
        synchronized (set) {
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
                // 在同步區塊中安全地修改集合
                if (element.equals("B")) {
                    iterator.remove(); // 使用 iterator.remove() 方法安全地移除元素
                }
            }
        }
        System.out.printf("%s %s\n", LocalDateTime.now(), set);
    }
}
