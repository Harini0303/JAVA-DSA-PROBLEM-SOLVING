// https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        int e = -1;
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                c = 1;
                e = nums[i];
            } else if (nums[i] == e) {
                c++;
            } else {
                c--;
            }
        }

        int major = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e) {
                major++;
            }
        }

        if (major >= (nums.length / 2)) {
            return e;
        }
        return -1;

    }
}