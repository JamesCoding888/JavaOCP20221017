package com.ocp.day2;
/*
		This program will give you a tool which is API of "IntSummaryStatistics".
		
		讀者可從本節學到如何使用 Oracle 內建的 API - IntSummaryStatistics，此 Class 包被放置在此路徑中 java.util.stream.IntStream.summaryStatistics()，裡
		面提供了幾個好用的工具，例如計算總數、加總、平均、最大值和最小值
		
		You shall make a note of following built-in API from IntSummaryStatistics as
		1) Arrays.stream(name_of_ArrayObject).summaryStatistics().getCount()
		2) Arrays.stream(name_of_ArrayObject).summaryStatistics().getSum()
		3) Arrays.stream(name_of_ArrayObject).summaryStatistics().getAverage()
		4) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMax()
		5) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMin() 
*/
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