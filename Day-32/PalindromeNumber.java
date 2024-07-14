// https://www.geeksforgeeks.org/problems/palindrome0746/1

class Solution {
    public String is_palindrome(int n) {
        // Code here
        int rev = 0;
        int dup = n;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;

        }
        if (rev == dup) {
            return "Yes";
        }
        return "No";
    }
}