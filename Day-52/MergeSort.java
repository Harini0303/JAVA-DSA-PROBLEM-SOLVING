// https://www.geeksforgeeks.org/problems/merge-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    void merge(int arr[], int l, int m, int r) {
        // Your code here
        ArrayList<Integer> temp = new ArrayList<>();

        int i = l;
        int j = m + 1;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }

        }

        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        for (int a = l; a <= r; a++) {
            arr[a] = temp.get(a - l);
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l < r) {

            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
}