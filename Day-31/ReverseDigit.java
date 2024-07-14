// https://www.geeksforgeeks.org/problems/reverse-digit0316/1

// Input: 200
// Output: 2
// Explanation: By reversing the digits of 
// number, number will change into 2.
// Example 2:

// Input : 122
// Output: 221
// Explanation: By reversing the digits of 
// number, number will change into 221.

//User function Template for Java

class Solution {
    public long reverse_digit(long n) {
        long rev = 0;

        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}