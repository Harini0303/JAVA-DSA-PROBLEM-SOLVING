//problem link :https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {

        // for(int i=0;i<nums.length;i++){
        // int count =0;
        // for(int j=0;j<nums.length;j++){
        // if(nums[j] == nums[i]){
        // count++;
        // }
        // }
        // if(count > nums.length/2){
        // return nums[i];
        // }
        // }
        // return 0;

        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        // for(int i=0;i<nums.length;i++){
        // int count = map.getOrDefault(nums[i],0);
        // map.put(nums[i],count+1);
        // }

        // for(int majority :map){
        // if(majority > (nums.size()/2)){
        // return map.first;
        // }
        // }
        // return 0;

        int count = 0;
        int element = -1;

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

        int major = 0;
        // count =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                major++;
            }
        }
        if (major > (nums.length / 2)) {
            return element;
        }
        return 0;
    }
}