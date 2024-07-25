//https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxCount = 0;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}