// https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = Integer.MIN_VALUE;
        int e2 = Integer.MIN_VALUE;

        int c1 = 0, c2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (c1 == 0 && e2 != nums[i]) {
                c1 = 1;
                e1 = nums[i];
            } else if (c2 == 0 && e1 != nums[i]) {
                c2 = 1;
                e2 = nums[i];
            } else if (e1 == nums[i]) {
                c1++;
            } else if (e2 == nums[i]) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        c1 = 0;
        c2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                c1++;
            }
            if (nums[i] == e2) {
                c2++;
            }
        }

        int minimum = (int) (nums.length / 3) + 1;

        if (c1 >= minimum) {
            result.add(e1);
        }
        if (c2 >= minimum) {
            result.add(e2);
        }
        return result;
    }
}