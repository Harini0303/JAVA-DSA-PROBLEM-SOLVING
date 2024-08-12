//https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1

class Solution {

    public void sortIt(Long arr[]) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int k = 0;

        while (l < r) {
            while (arr[l] % 2 != 0) {
                l++;
                k++;
            }

            while (arr[r] % 2 == 0 && l < r) {
                r--;
            }

            if (l < r) {
                long temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        Arrays.sort(arr, 0, k, Collections.reverseOrder());
        Arrays.sort(arr, k, n);
    }
}