//https://www.geeksforgeeks.org/problems/square-root/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    long floorSqrt(long x) {
        // Your code here
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1;
        long end = x;
        long ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}