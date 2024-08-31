// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];

        int evenPosition = 0;
        int oddPosition = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[evenPosition] = nums[i];
                evenPosition += 2;
            } else {
                arr[oddPosition] = nums[i];
                oddPosition += 2;
            }

        }
        return arr;

    }
}