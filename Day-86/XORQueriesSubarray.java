// https://leetcode.com/problems/xor-queries-of-a-subarray/?envType=daily-question&envId=2024-09-13

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXor = new int[n];
        prefixXor[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i];
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left == 0) {
                res[i] = prefixXor[right];
            } else {
                res[i] = prefixXor[right] ^ prefixXor[left - 1];
            }
        }
        return res;
    }
}
