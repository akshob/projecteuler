package in.akshob.projecteuler.problems;

import static in.akshob.projecteuler.util.Utilities.sum;

public class SumSquareDifference {
    private long number;

    public SumSquareDifference() {
        super();
    }

    public SumSquareDifference(long number) {
        this.number = number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long calculate() {
        long sumN = sum(number, 1);
        return sumN*sumN - sum(number, 2);
    }
}
