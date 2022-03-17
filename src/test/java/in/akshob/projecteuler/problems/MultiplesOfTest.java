package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for MultiplesOf.
 */
public class MultiplesOfTest 
{
    private MultiplesOf multiplesOf;

    @Before
    public void setUp() {
        multiplesOf = new MultiplesOf();
    }

    @Test
    public void checkSumOfMultiplesBasic()
    {
        assertEquals(23, multiplesOf.findSum(10));
    }

    @Test
    public void checkSumOfMultiplesProblemNumber()
    {
        assertEquals(233168, multiplesOf.findSum(1000));
    }
}
