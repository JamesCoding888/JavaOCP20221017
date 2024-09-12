package com.ocp.day3;
/*
 * This is expected behavior given the nature of StringBuilder and StringBuffer. 
 * To avoid these discrepancies, for thread-safe operations, always use StringBuffer or other synchronized methods to ensure consistent results when working with multiple threads.
 */
public class StringBuilderVsStringBuffer {
    // Demonstration of StringBuilder (Not Thread-Safe)
    public static void stringBuilderExample() {
        StringBuilder sb = new StringBuilder();

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
            System.out.println("StringBuilder length by Task1: " + sb.length());
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("B");
            }
            System.out.println("StringBuilder length by Task2: " + sb.length());
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final StringBuilder length: " + sb.length());
    }
    // Demonstration of StringBuffer (Thread-Safe)
    public static void stringBufferExample() {
        StringBuffer sb = new StringBuffer();

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
            System.out.println("StringBuffer length by Task1: " + sb.length());
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("B");
            }
            System.out.println("StringBuffer length by Task2: " + sb.length());
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final StringBuffer length: " + sb.length());
    }
    public static void main(String[] args) {
        System.out.println("StringBuilder Example (Not Thread-Safe):");
        stringBuilderExample();

        System.out.println("\nStringBuffer Example (Thread-Safe):");
        stringBufferExample();
    }
}
