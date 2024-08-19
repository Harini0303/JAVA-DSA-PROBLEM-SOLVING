// https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    arr.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    arr.add(matrix[i][j]);
                }

            }
        }
        return arr;
    }
}