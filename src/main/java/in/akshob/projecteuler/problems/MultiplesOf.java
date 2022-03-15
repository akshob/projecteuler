package in.akshob.projecteuler.problems;

public class MultiplesOf {
    /**
    * Returns the sum of all the multiples of 3 or 5 below n
    */
    public int findSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}