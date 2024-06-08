//problem link : https://www.geeksforgeeks.org/problems/alternative-sorting1311/1

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    ArrayList<Long> alternateSort(long arr[], int N) {

        // Your code goes here
        Arrays.sort(arr);
        ArrayList<Long> result = new ArrayList<Long>();
        int start = 0;
        int end = N - 1;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                result.add(arr[end--]);
            } else {
                result.add(arr[start++]);
            }
        }
        return result;

    }
}
