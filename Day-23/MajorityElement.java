// https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        int ele = -1;
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                c = 1;
                ele = nums[i];
            } else if (ele == nums[i]) {
                c++;
            } else {
                c--;
            }
        }

        int major = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ele == nums[i]) {
                major++;
            }
        }

        if (major > (int) nums.length / 2) {
            return ele;
        }
        return 0;

    }
}