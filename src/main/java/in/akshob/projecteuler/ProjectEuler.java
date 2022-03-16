package in.akshob.projecteuler;

import in.akshob.projecteuler.problems.Fibonacci;
import in.akshob.projecteuler.problems.MultiplesOf;
import in.akshob.projecteuler.problems.PrimeFactor;


public class ProjectEuler 
{
    public static void main( String[] args )
    {
        int i = 0;
        System.out.printf("Problem %d: %d\n", ++i, new MultiplesOf().findSum(1000));
        System.out.printf("Problem %d: %d\n", ++i, new Fibonacci().findEvenSum(4000000));
        System.out.printf("Problem %d: %d\n", ++i, new PrimeFactor().largestFactor(600851475143L));
    }
}
