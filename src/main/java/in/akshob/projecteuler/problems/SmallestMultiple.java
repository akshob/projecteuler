package in.akshob.projecteuler.problems;

import static in.akshob.projecteuler.util.Utilities.lcm;

public class SmallestMultiple {
    private int[] numbers;

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int LCM() throws IllegalStateException {
        if (numbers == null) {
            throw new IllegalStateException("Cannot calculate LCM when numbers array is not initialized");
        }
        int result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result = lcm(result, numbers[i]);
        }
        return result;
    }
}
