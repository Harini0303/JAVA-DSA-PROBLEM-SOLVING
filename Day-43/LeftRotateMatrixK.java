// https://www.geeksforgeeks.org/problems/left-rotate-matrix-k-times2351/1

class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int m = mat.length;
        int n = mat[0].length;

        k = k % n;

        for (int i = 0; i < m; i++) {
            rotate(mat[i], 0, k - 1);
            rotate(mat[i], k, n - 1);
            rotate(mat[i], 0, n - 1);
        }
        return mat;
    }

    void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}