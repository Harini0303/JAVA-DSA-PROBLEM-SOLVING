// Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG fashion as shown in figure.

// Example:
// Input: 
// 1 2 3
// 4 5 6
// 7 8 9
// Output: 
// 1 2 4 7 5 3 6 8 9

public class ZigZag {

    public static void printZigZag(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean goingUp = true;

        int row = 0, col = 0;

        while (row < n && col < m) {
            System.out.print(matrix[row][col] + " ");

            if (goingUp) {
                if (col == m - 1) {
                    row++;
                    goingUp = false;
                } else if (row == 0) {
                    col++;
                    goingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == n - 1) {
                    col++;
                    goingUp = true;
                } else if (col == 0) {
                    row++;
                    goingUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printZigZag(matrix);
    }
}
