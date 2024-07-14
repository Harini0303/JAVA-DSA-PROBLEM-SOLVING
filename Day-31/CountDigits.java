// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.

// https://www.geeksforgeeks.org/problems/count-digits5716/1

class Solution {
    static int evenlyDivides(int N) {
        // code here
        int count = 0;
        int original = N;

        while (N > 0) {
            int digit = N % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            N /= 10;

        }
        return count;
    }
}