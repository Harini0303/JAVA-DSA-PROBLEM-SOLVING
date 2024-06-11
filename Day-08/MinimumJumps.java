//problem link : https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class Solution {
    static int minJumps(int[] arr, int n) {
        if (n == 1)
            return 0;
        if (arr[0] == 0)
            return -1;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= n - 1)
                    return jumps;
            }
        }
        return -1;
    }
}
