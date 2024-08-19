// https://leetcode.com/problems/2-keys-keyboard/?envType=daily-question&envId=2024-08-19

class Solution {
    public int minSteps(int n) {
        if (n == 1) {
            return 0;

        }

        int result = 0;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result += i;
                n /= i;

            }

        }
        return result;

    }
}