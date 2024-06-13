// prblem : https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

class Solution {

    public static long pairWithMaxSum(long arr[], long N) {
        // Handling edge cases where array has fewer than 2 elements
        if (N < 2)
            return 0;

        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < N - 1; i++) {
            long currentSum = arr[i] + arr[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
