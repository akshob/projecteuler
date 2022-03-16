package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for Fibonacci.
 */
public class PrimeFactorTest
{
    @Test
    public void checkLargestPrimeFactor()
    {
        PrimeFactor p = new PrimeFactor();
        assertEquals(29, p.largestFactor(13195));
        assertEquals(6857, p.largestFactor(600851475143L));
        assertEquals(6857, p.largestFactor(47018449));
    }
}
