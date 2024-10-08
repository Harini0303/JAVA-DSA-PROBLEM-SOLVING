// problem : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public int helper(int num, int step) {
        if (num == 0) {
            return step;
        }

        if (num % 2 == 0) {
            return helper(num / 2, step + 1);
        }
        return helper(num - 1, step + 1);
    }
}