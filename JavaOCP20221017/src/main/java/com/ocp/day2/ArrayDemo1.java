package com.ocp.day2;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] x = new int[3]; // [0, 0, 0]
        int len = x.length; // 陣列長度
        System.out.println(x[0]); // 印出 x[0] 的內容
        System.out.println(x[1]); // 印出 x[1] 的內容
        System.out.println(x[2]); // 印出 x[2] 的內容
        System.out.println("x 的陣列長度 = " + len);
        x[0] = 100; // 修改 x[0] 所存放的內容
        x[1] = 85;  // 修改 x[1] 所存放的內容
        x[2] = 74;  // 修改 x[2] 所存放的內容
        // 此時陣列內容依序為: [100, 85, 74]
        System.out.println(x[0]); // 印出 x[0] 的內容
        System.out.println(x[1]); // 印出 x[1] 的內容
        System.out.println(x[2]); // 印出 x[2] 的內容
        // 陣列的最小維度 = 0
        // 陣列的最大維度 = 陣列長度 - 1
    }
}
