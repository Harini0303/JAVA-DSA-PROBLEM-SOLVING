//https://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort

//{ Driver Code Starts
import java.util.*;

class Merge_Sort {
    // method to print the elements of the array
    static void printArray(int arr[]) {
        StringBuffer sb = new StringBuffer("");
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            sb.append(arr[i] + " ");
        System.out.println(sb.toString());
    }

    public static void main(String args[]) {
        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking testcases
        int T = sc.nextInt();
        while (T > 0) {
            // taking elements count
            int n = sc.nextInt();

            // creating an object of class Merge_Sort
            Merge_Sort ms = new Merge_Sort();

            // creating an array of size n
            int arr[] = new int[n];

            // adding elements to the array
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Solution g = new Solution();

            // calling the method mergeSort
            g.mergeSort(arr, 0, arr.length - 1);

            // calling the method printArray
            ms.printArray(arr);
            T--;
        }
    }
}

// } Driver Code Ends

class Solution {
    void merge(int arr[], int l, int m, int r) {
        // Temporary array list to store merged elements
        ArrayList<Integer> temp = new ArrayList<>();

        int i = l;
        int j = m + 1;

        // Merge the two subarrays into the temp array list
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        // Copy any remaining elements of the left subarray
        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        // Copy any remaining elements of the right subarray
        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        // Copy the merged elements back into the original array
        for (int a = l; a <= r; a++) {
            arr[a] = temp.get(a - l);
        }
    }

    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }
}
