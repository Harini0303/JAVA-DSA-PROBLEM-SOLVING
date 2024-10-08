// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here

        ArrayList<Integer> ls = new ArrayList<>();

        int currentLeader = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= currentLeader) {
                ls.add(arr[i]);
                currentLeader = arr[i];
            }
        }

        Collections.reverse(ls);

        return ls;
    }
}