// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

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

    static long merge(long[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        ArrayList<Long> temp = new ArrayList<>();

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