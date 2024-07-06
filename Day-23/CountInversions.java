//https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int) n];

            for (long i = 0; i < n; i++)
                arr[(int) i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int) n));
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return mergeSort(arr, 0, n - 1);

    }

    static long mergeSort(long arr[], int low, int high) {
        long c = 0;
        if (low >= high) {
            return c;
        }

        int mid = (low + high) / 2;

        c += mergeSort(arr, low, mid);
        c += mergeSort(arr, mid + 1, high);
        c += merge(arr, low, mid, high);

        return c;
    }

    static long merge(long arr[], int low, int mid, int high) {
        ArrayList<Long> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        long c = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                c += (mid - left + 1);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return c;

    }
}