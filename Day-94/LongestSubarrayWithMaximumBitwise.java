// https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/description/

class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int currentLength = 0;
        int maxLength = 0;

        for (int num : nums) {
            if (num == max) {
                currentLength++;
                maxLength = Math.max(currentLength, maxLength);

            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }
}