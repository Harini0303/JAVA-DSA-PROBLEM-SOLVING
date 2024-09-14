// https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int c = target - arr[i];

            if (map.containsKey(c)) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }
}

// https://leetcode.com/problems/two-sum/description/

// class Solution {
// public int[] twoSum(int[] nums, int target) {

// HashMap<Integer,Integer> map = new HashMap<>();

// for(int i=0;i<nums.length;i++){
// int c = target - nums[i];

// if(map.containsKey(c)){
// return new int[]{map.get(c),i};
// }else{
// map.put(nums[i],i);
// }
// }
// return new int[]{-1,-1};
// }
// }