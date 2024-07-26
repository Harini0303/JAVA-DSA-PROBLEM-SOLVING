//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

//also put using BINARY SEARCH
class Solution {
    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}