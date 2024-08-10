//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }

        }
        return i + 1;
    }
}

// class Solution {
// public int removeDuplicates(int[] nums) {
// int j=1;
// for(int i=1;i<nums.length;i++){
// if(nums[i]!=nums[j-1]){
// nums[j]=nums[i];
// j++;
// }
// }
// return j;
// }
// }