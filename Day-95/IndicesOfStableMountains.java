// https://leetcode.com/contest/biweekly-contest-139/problems/find-indices-of-stable-mountains/description/

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stableMountains = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                stableMountains.add(i);
            }
        }

        return stableMountains;
    }
}
