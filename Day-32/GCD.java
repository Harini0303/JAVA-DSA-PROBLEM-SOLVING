// https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

// Input: 
// a = 3
// b = 6
// Output: 3
// Explanation: GCD of 3 and 6 is 3

class Solution {
    public static int gcd(int a, int b) {
        // code here
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (b == 0) {
            return a;
        } else {
            return b;
        }
    }
}
