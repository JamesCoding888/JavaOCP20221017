package com.ocp.day20.fibonacci;
import java.util.concurrent.RecursiveTask;

public class FibonacciForkJoin extends RecursiveTask<Integer> {
    private final int n;

    public FibonacciForkJoin(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        } else {
            FibonacciForkJoin f1 = new FibonacciForkJoin(n - 1);
            f1.fork();
            FibonacciForkJoin f2 = new FibonacciForkJoin(n - 2);
            return f2.compute() + f1.join();
        }
    }
    public static void main(String[] args) {
        int n = 48;
        FibonacciForkJoin fibonacci = new FibonacciForkJoin(n);
        long startTime = System.nanoTime();
        int result = fibonacci.compute();
        long endTime = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        System.out.println("Elapsed time: " + (endTime - startTime) + " nanoseconds");
    }
}
