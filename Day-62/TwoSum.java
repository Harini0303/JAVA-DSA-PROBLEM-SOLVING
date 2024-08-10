//https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}

// class Solution {
// public int[] twoSum(int[] nums, int target) {

// int n = nums.length;
// HashMap<Integer,Integer> map = new HashMap<>();

// for(int i=0;i<n;i++){
// int c = target - nums[i];
// if(map.containsKey(c)){
// return new int[]{i,map.get(c)};
// }
// map.put(nums[i], i);
// }
// return new int[]{-1,-1};
// }
// }