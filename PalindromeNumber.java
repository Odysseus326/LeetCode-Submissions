// Given an integer x, return true if x is a palindrome, and false otherwise.
class Solution {
    public boolean isPalindrome(int x) {
        // If x is nagative or (x is positive and ends with 0 but is not 0 itself) it can't be a palindrome
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        //Reverse the integer
        while (x != 0) {
            // Makes digit equal the last number of x
            int digit = x % 10;
            // Slides the digits to the left and adds digit5
            reversed = reversed * 10 + digit;
            // Removes the last number from x so the next loop makes digit equal to the next last number
            x /= 10;
        }
        // Compares the original and reversed versions of x and returns true if they are the same.
        return original == reversed;
    }
}

public class PalindromeNumber {
    public static void main(String args[])
    {
        int num1;
        num1 = 12321;

        int num2;
        num2 = 11223;

        Solution solution = new Solution();

        boolean result1 = solution.isPalindrome(num1);
        boolean result2 = solution.isPalindrome(num2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
    