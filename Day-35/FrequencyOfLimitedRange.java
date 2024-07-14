// https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        int[] freq = new int[N + 1];

        for (int i = 0; i < N; i++) {
            if (arr[i] >= 1 && arr[i] <= N) {
                freq[arr[i]]++;
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = freq[i + 1];
        }
    }
}
