package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for MultiplesOf.
 */
public class MultiplesOfTest 
{
    @Test
    public void checkSumOfMultiples()
    {
        MultiplesOf m = new MultiplesOf();
        assertEquals(23, m.findSum(10));
        assertEquals(233168, m.findSum(1000));
    }
}
