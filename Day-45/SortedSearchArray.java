//https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?page=1&category=Binary%20Search&sortBy=submissions

class Solution {
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        int low = 0;
        int high = N - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == K) {
                return 1;
            } else if (arr[mid] < K) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;

    }
}