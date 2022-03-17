package in.akshob.projecteuler.util;

public class Utilities {
    public static boolean isPalindrome(int number) {
        if (number == 0) return true;
        if (number % 10 == 0) return false;
        int reversed = 0;
        while (number > reversed) {
            int digit = number % 10;
            number /= 10;
            if (number == reversed) return true;   // For odd number of digits
            reversed = reversed * 10 + digit;
            if (number == reversed) return true;   // For even number of digits
        }
        return false;
    }
}
