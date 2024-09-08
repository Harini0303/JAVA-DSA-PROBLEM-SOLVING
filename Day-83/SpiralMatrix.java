// https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, left = 0, right = n - 1, bottom = m - 1;

        List<Integer> ls = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ls.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ls.add(matrix[i][left]);
                }
            }
            left++;

        }
        return ls;
    }
}