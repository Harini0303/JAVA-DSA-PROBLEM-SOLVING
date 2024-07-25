// https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1

class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = temp;
            }
        }

    }
}