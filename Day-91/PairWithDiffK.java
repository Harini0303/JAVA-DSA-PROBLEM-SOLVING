// https://www.geeksforgeeks.org/problems/pairs-with-difference-k1713/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }

            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

// class Solution {
// int countPairsWithDiffK(int[] arr, int k) {
// // code here
// int count = 0;

// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++)
// if (arr[i] - arr[j] == k ||
// arr[j] - arr[i] == k)
// count++;
// }
// return count;
// }
// }