// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Your code here

        long maximum = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maximum) {
                maximum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        return maximum;
    }
}