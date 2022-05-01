package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class SmallestMultipleTest {
    private SmallestMultiple smallestMultiple;

    @Before
    public void setUp() {
        smallestMultiple = new SmallestMultiple();
    }

    @Test(expected = IllegalStateException.class)
    public void checkNumbersInitialization() {
        smallestMultiple.LCM();
    }

    @Test
    public void checkLCMFirstTenNumbers() {
        smallestMultiple.setNumbers(IntStream.range(1, 10).toArray());
        assertEquals(2520, smallestMultiple.LCM());
    }

    @Test
    public void checkLCMFirstTwentyNumbers() {
        smallestMultiple.setNumbers(IntStream.range(1, 20).toArray());
        assertEquals(232792560, smallestMultiple.LCM());
    }

    @Test
    public void checkLCMFirstHundredNumbers() {
        smallestMultiple.setNumbers(IntStream.range(1, 100).toArray());
        assertEquals(128028428, smallestMultiple.LCM());
    }
}
