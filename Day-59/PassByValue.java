// https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value

class Solution {
    static int[] passedBy(int a, int b) {
        // code here
        int[] arr = new int[2];
        arr[0] = a + 1;
        arr[1] = b + 2;

        return arr;
    }
}