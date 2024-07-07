// https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here
        int left = 0, right = n - 1;
        int maxLeft = 0, maxRight = 0;
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

// https://leetcode.com/problems/trapping-rain-water/description/

// class Solution {
// public int trap(int[] height) {
// int n = height.length;

// int waterTrapped = 0;

// for(int i=0;i<n;i++){
// int j=i;
// int leftMax =0, rightMax =0;
// while(j >= 0){
// leftMax = Math.max(leftMax , height[j]);
// j--;
// }
// j=i;

// while(j< n){
// rightMax = Math.max(rightMax , height[j]);
// j++;
// }

// waterTrapped+= Math.min(leftMax,rightMax)-height[i];

// }
// return waterTrapped;

// int n = height.length;
// int prefix[] = new int[n];
// int suffix[] = new int[n];
// prefix[0] = height[0];
// for (int i = 1; i < n; i++) {
// prefix[i] = Math.max(prefix[i - 1], height[i]);
// }
// suffix[n - 1] = height[n - 1];
// for (int i = n - 2; i >= 0; i--) {
// suffix[i] = Math.max(suffix[i + 1], height[i]);
// }
// int waterTrapped = 0;
// for (int i = 0; i < n; i++) {
// waterTrapped += Math.min(prefix[i], suffix[i]) - height[i];
// }
// return waterTrapped;

// int left = 0, right = height.length - 1;
// int maxLeft = 0, maxRight = 0;
// int res = 0;

// while (left <= right) {
// if (height[left] <= height[right]) {
// if (height[left] >= maxLeft) {
// maxLeft = height[left];
// } else {
// res += maxLeft - height[left];
// }
// left++;
// } else {
// if (height[right] >= maxRight) {
// maxRight = height[right];
// } else {
// res += maxRight - height[right];
// }
// right--;
// }
// }
// return res;

// }
// }