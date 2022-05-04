package in.akshob.projecteuler.problems;

import org.junit.Before;
import org.junit.Test;

import static in.akshob.projecteuler.util.Utilities.sum;
import static org.junit.Assert.assertEquals;

public class SumSquareDifferenceTest {
    private SumSquareDifference difference;

    @Before
    public void setUp() {
        difference = new SumSquareDifference();
    }

    @Test
    public void checkWhenNumberNotSet() {
        assertEquals(0, difference.calculate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInvalidPowerParam() {
        sum(10, -1);
    }

    @Test
    public void checkSumSquareTen() {
        difference.setNumber(10);
        assertEquals(2640, difference.calculate());
    }

    @Test
    public void checkSumSquareHundred() {
        difference.setNumber(100);
        assertEquals(25164150, difference.calculate());
    }
}
