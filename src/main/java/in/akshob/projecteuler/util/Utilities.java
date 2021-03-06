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

    public static boolean isPalindrome(String input) {
        int startIndex = -1;
        int endIndex = input.length();
        while(++startIndex < --endIndex) {
            if (input.charAt(startIndex) != input.charAt(endIndex)) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }

    public static long sum(long n, int pow) {
        if (pow == 1)
            return n * (n + 1) / 2;
        else if (pow == 2)
            return n * (n + 1) * (2*n + 1) / 6;
        else if (pow == 3)
            return n*n * (n + 1)*(n + 1) / 4;
        throw new IllegalArgumentException("Sum is not implemented for power: " + pow);
    }
}
