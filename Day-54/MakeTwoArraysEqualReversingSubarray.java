// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/description/?envType=daily-question&envId=2024-08-03

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map = new int[1001];

        for (int i = 0; i < target.length; i++) {
            map[target[i]]++;
            map[arr[i]]--;
        }

        for (int i = 0; i < target.length; i++) {
            if (map[target[i]] != 0 || map[arr[i]] != 0) {
                return false;
            }
        }
        return true;

    }
}

// class Solution {
// public boolean canBeEqual(int[] target, int[] arr) {
// Arrays.sort(target);
// Arrays.sort(arr);

// for (int i = 0; i < target.length; i++) {
// if (target[i] != arr[i]) {
// return false;
// }
// }

// return true;
// }
// }