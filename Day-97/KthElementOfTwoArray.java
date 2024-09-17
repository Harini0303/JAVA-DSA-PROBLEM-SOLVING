// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int res = 0;
        int i = 0, j = 0;
        int count = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                res = arr1[i];
                i++;
            } else {
                res = arr2[j];
                j++;
            }
            count++;

            if (count == k) {
                return res;
            }
        }

        while (i < n) {
            res = arr1[i];
            i++;
            count++;
            if (count == k) {
                return res;
            }
        }

        while (j < m) {
            res = arr2[j];
            j++;
            count++;
            if (count == k) {
                return res;
            }
        }

        return -1;

    }
}