//problem link : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                c++;
            }
            if (c > 1) {
                return false;
            }
        }

        if (c == 1 && (nums[0] < nums[nums.length - 1])) {
            return false;
        }
        return true;

    }
}