package in.akshob.projecteuler.problems;

import in.akshob.projecteuler.util.Utilities;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Palindrome.
 */
public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void checkPalindromeBasic() {
        assertTrue(Utilities.isPalindrome(1001));
    }

    @Test
    public void checkPalindromeLarge() {
        assertTrue(Utilities.isPalindrome(156898651));
    }

    @Test
    public void checkPalindromeProductTwoDigits() {
        assertEquals(9009, palindrome.largestPalindromeProduct(2));
    }

    @Test
    public void checkPalindromeProductThreeDigits() {
        assertEquals(906609, palindrome.largestPalindromeProduct(3));
    }

    @Test
    public void checkPalindromeProductThreeDigitsOptimized() {
        assertEquals(906609, palindrome.largestPalindromeProductOfThreeDigitNumbers());
    }

    @Test
    public void checkPalindromeString() {
        assertTrue(Utilities.isPalindrome("malayalam"));
    }

    @Test
    public void checkPalindromeStringMixedCase() {
        assertFalse(Utilities.isPalindrome("Malayalam"));
    }
}
