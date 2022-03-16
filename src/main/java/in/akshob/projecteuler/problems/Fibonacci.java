package in.akshob.projecteuler.problems;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
    private final List<Integer> sequence;

    public Fibonacci() {
        sequence = new ArrayList<>();
        sequence.addAll(Arrays.asList(0, 1, 1));
    }

    /**
    * Returns the sum of all the even fibonacci numbers below limit
    */
    public int findEvenSum(int limit) {
        int sum = 0;
        int fib = 0, i = 0;
        while (fib < limit) {
            fib = fibonacci(++i);
            if (fib % 2 == 0) sum += fib;
        }
        return sum;
    }

    private int fibonacci(int n) {
        if (sequence.size() >= n) return sequence.get(n-1);
        int next = fibonacci(n - 1) + fibonacci(n - 2);
        sequence.add(next);
        return next;
    }
}