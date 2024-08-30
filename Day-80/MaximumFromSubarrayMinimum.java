// https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            currentSum = arr.get(i) + arr.get(i + 1);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}