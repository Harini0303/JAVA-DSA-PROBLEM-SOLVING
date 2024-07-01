//https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

//User function Template for Java

class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0, j = 0;
        int count = 0;
        long result = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result = arr1[i];
                i++;
            } else {
                result = arr2[j];
                j++;
            }
            count++;
            if (count == k) {
                return result;
            }
        }

        while (i < n) {
            result = arr1[i];
            i++;
            count++;
            if (count == k) {
                return result;
            }
        }

        while (j < m) {
            result = arr2[j];
            j++;
            count++;
            if (count == k) {
                return result;
            }
        }

        return -1;
    }

}
