//https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?itm_source=geeksforgeeks&itm_medium=Article&itm_campaign=bottom_sticky_on_Article

import java.util.Arrays;

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here

        // int count =0;

        // for(int i=0;i<n;i++){
        // for(int j=0;j<m;j++){
        // if(a[i] == b[j]){
        // count++;
        // }
        // }
        // }
        // return count;

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0, count = 0;

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }

            while (i > 0 && i < n && a[i] == a[i - 1]) {
                i++;
            }

            while (j > 0 && j < m && b[j] == b[j - 1]) {
                j++;
            }
        }
        return count;
    }
};