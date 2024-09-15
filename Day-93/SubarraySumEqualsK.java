// https://leetcode.com/problems/subarray-sum-equals-k/description/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int target = sum - k;

            count += map.getOrDefault(target, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }
}