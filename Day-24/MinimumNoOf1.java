// https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int minRowIndex = 1;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                minRowIndex = i + 1;
            }
        }
        return minRowIndex;
    }
};