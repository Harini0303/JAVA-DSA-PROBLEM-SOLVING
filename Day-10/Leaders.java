
//problem : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here

        ArrayList<Integer> list = new ArrayList<>();

        int maxi = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxi) {
                list.add(arr[i]);
                maxi = arr[i];
            }
        }

        Collections.reverse(list);
        return list;
    }
}
