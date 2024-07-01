//https://leetcode.com/problems/two-sum/

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

// Input: nums = [2, 7, 11, 15], target = 9
// Iterate through the array:
// i = 0, nums[0] = 2, complement = 9 - 2 = 7
// map is empty, so add 2 to map: map = {2: 0}
// i = 1, nums[1] = 7, complement = 9 - 7 = 2
// map contains 2, return indices [0, 1]
// The method returns [0, 1] because nums[0] + nums[1] == 9.