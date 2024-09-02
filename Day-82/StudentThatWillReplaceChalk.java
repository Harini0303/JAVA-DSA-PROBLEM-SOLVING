// https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/description/?envType=daily-question&envId=2024-09-02

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }

        k %= totalChalk;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return -1;
    }
}