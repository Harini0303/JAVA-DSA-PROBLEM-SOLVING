// https://leetcode.com/problems/3sum/description/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;

                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return result;
    }
}

// import java.util.*;

// public class tUf {
// public static List<List<Integer>> triplet(int n, int[] arr) {
// Set<List<Integer>> st = new HashSet<>();

// // check all possible triplets:
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// for (int k = j + 1; k < n; k++) {
// if (arr[i] + arr[j] + arr[k] == 0) {
// List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
// temp.sort(null);
// st.add(temp);
// }
// }
// }
// }

// // store the set elements in the answer:
// List<List<Integer>> ans = new ArrayList<>(st);
// return ans;
// }

// public static void main(String[] args) {
// int[] arr = { -1, 0, 1, 2, -1, -4};
// int n = arr.length;
// List<List<Integer>> ans = triplet(n, arr);
// for (List<Integer> it : ans) {
// System.out.print("[");
// for (Integer i : it) {
// System.out.print(i + " ");
// }
// System.out.print("] ");
// }
// System.out.println();
// }
// }
