package com.ocp.day2;
/*
		Since you already understood of how to design your own method(s) as previously lecture, then plz check out the following API with 
		regards to "Arrays.stream" 
		
		讀者應能從上節 ArrayDemo3.java 了解如何自行建立 method(s)，本節將介紹如何使用 Arrays.stream 來實作 ArrayDemo3.java 提到的範例
		1) Arrays.stream(name_of_ArrayObject).count()
		2) Arrays.stream(name_of_ArrayObject).sum()
		3) Arrays.stream(name_of_ArrayObject).average().getAsDouble()
		4) Arrays.stream(name_of_ArrayObject).max().getAsInt()
		5) Arrays.stream(name_of_ArrayObject).min().getAsInt()
*/
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = {100, 92, 85, 73, 68};
        // 計算個數, 總和, 平均, 最大值, 最小值
        // 使用 Java Stream 來解決
        // 因為串流 Stream 用完之後不得重複使用所以每一次都要重新建立串流Stream
        // 不然會拋出 stream has already been operated upon or closed
        System.out.printf("個數: %d\n", Arrays.stream(scores).count());
        System.out.printf("總和: %d\n", Arrays.stream(scores).sum());
        System.out.printf("平均: %.1f\n", Arrays.stream(scores).average().getAsDouble());
        System.out.printf("最大: %d\n", Arrays.stream(scores).max().getAsInt());
        System.out.printf("最小: %d\n", Arrays.stream(scores).min().getAsInt());
    }
}

/*
	Console:
		個數: 5
		總和: 418
		平均: 83.6
		最大: 100
		最小: 68


*/