// https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here
        int left = 0, right = n - 1, maxLeft = 0, maxRight = 0;
        long res = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= maxLeft) {
                    maxLeft = arr[left];
                } else {
                    res += maxLeft - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= maxRight) {
                    maxRight = arr[right];
                } else {
                    res += maxRight - arr[right];
                }
                right--;
            }
        }
        return res;
    }
}