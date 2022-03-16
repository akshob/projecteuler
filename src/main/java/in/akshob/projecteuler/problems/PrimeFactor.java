package in.akshob.projecteuler.problems;

import java.util.*;

public class PrimeFactor {
    private final List<Integer> factors;

    public PrimeFactor() {
        this.factors = new ArrayList<>();
    }

    public int largestFactor(long number) {
        int i = 2;
        while (number != 1) {
            if (number % i == 0) {
                factors.add(i);
                number /= i;
                i = 2;
            }
            i++;
        }
        return Collections.max(factors);
    }
}
