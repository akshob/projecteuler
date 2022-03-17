package in.akshob.projecteuler.problems;

import static in.akshob.projecteuler.util.Utilities.isPalindrome;

public class Palindrome {

    public int largestPalindromeProduct(int digits) {
        int start = (int) Math.pow(10, digits - 1);
        int end = (int) Math.pow(10, digits) - 1;
        int largestProduct = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                int product = i * j;
                if (isPalindrome(product)) {
                    largestProduct = Math.max(largestProduct, product);
                }
            }
        }
        return largestProduct;
    }

    /**
     * optimizations from
     * https://codereview.stackexchange.com/a/248682/136891
     * https://codereview.stackexchange.com/a/248772/136891
     */
    public int largestPalindromeProductOfThreeDigitNumbers() {
        int maxProduct = 0;
        for (int primary = 979; primary >= 900; primary -= 22) {
            for (int secondary = 999; secondary >= 900; secondary -= 2) {
                int product = primary * secondary;
                if (is_6_digit_palindrome(product)) {
                    maxProduct = Math.max(product, maxProduct);
                    break;
                }
            }
        }
        return maxProduct;
    }

    public boolean is_6_digit_palindrome(int number) {
        int top3 = number / 1000;
        int btm3 = number % 1000;
        int btm3_reversed = btm3 % 10 * 99  +  btm3 % 100  +  btm3 / 100;
        return top3 == btm3_reversed;
    }
}
