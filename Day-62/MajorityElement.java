//https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int element = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        int majority = 0;

        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i]) {
                majority++;
            }
        }

        if (majority > (int) nums.length / 2) {
            return element;
        }
        return -1;

    }
}