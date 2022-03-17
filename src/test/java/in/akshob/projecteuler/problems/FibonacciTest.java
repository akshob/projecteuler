package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Fibonacci.
 */
public class FibonacciTest 
{
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void checkSumOfEvenFibonacciBasic()
    {
        assertEquals(10, fibonacci.findEvenSum(15));
    }

    @Test
    public void checkSumOfEvenFibonacciLargeNumber()
    {
        assertEquals(4613732, fibonacci.findEvenSum(4000000));
    }

    @Test
    public void checkSumOfEvenFibonacciProblemNumber()
    {
        assertEquals(82790070, fibonacci.findEvenSum(40000000));
    }

    @Test
    public void checkSumOfEvenFibonacciVeryLargeNumber()
    {
        assertEquals(350704366, fibonacci.findEvenSum(400000000));
    }
}
