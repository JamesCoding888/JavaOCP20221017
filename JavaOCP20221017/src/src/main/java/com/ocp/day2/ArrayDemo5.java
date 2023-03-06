package com.ocp.day2;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] scores = {100, 92, 85, 73, 68};
        IntSummaryStatistics summary = Arrays.stream(scores).summaryStatistics();
        System.out.printf("個數: %d\n", summary.getCount());
        System.out.printf("總和: %d\n", summary.getSum());
        System.out.printf("平均: %.1f\n", summary.getAverage());
        System.out.printf("最大: %d\n", summary.getMax());
        System.out.printf("最小: %d\n", summary.getMin());        
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