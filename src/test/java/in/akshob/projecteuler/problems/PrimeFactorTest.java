package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Fibonacci.
 */
public class PrimeFactorTest
{
    private PrimeFactor primeFactor;

    @Before
    public void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void checkLargestPrimeFactorBasic()
    {
        assertEquals(29, primeFactor.largestFactor(13195));
    }

    @Test
    public void checkLargestPrimeFactorProblemNumber()
    {
        assertEquals(6857, primeFactor.largestFactor(600851475143L));
    }

    @Test
    public void checkLargestPrimeFactorPrimeSquare()
    {
        assertEquals(6857, primeFactor.largestFactor(47018449));
    }
}
