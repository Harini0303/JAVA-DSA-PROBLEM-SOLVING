// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int low = 0;
        int high = n - 1;

        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == arr[mid]) {
                return mid;
            } else if (arr[mid] < x) {
                floor = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }
}