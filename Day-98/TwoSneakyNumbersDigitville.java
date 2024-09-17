//https://leetcode.com/contest/weekly-contest-415/problems/the-two-sneaky-numbers-of-digitville/description/

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[2];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result[index++] = entry.getKey();
                if (index == 2) {
                    break;
                }
            }
        }

        return result;
    }
}
