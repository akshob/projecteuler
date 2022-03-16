package in.akshob.projecteuler.problems;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for Fibonacci.
 */
public class FibonacciTest 
{
    @Test
    public void checkSumOfEvenFibonacci()
    {
        Fibonacci fib = new Fibonacci();
        assertEquals(10, fib.findEvenSum(15));
        assertEquals(4613732, fib.findEvenSum(4000000));
        assertEquals(82790070, fib.findEvenSum(40000000));
        assertEquals(350704366, fib.findEvenSum(400000000));
    }
}
