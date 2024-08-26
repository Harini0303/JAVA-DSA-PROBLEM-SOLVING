// https://leetcode.com/problems/robot-return-to-origin/description/

class Solution {
    public boolean judgeCircle(String moves) {

        char[] arr = moves.toCharArray();

        int i = 0, j = 0;

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 'U') {
                j++;
            } else if (arr[k] == 'D') {
                j--;
            } else if (arr[k] == 'L') {
                i--;
            } else if (arr[k] == 'R') {
                i++;
            }

        }

        if (i == 0 && j == 0) {
            return true;
        }

        return false;
    }
}
