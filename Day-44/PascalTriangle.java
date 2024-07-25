//https://www.geeksforgeeks.org/problems/pascal-triangle0652/1?page=1&category=Recursion&difficulty=Easy&sortBy=submissions

//Leetcode
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                temp.add(pascal(i - 1, j - 1));
            }
            result.add(temp);

        }
        return result;

    }

    public static int pascal(int r, int c) {
        int ans = 1;
        for (int i = 0; i < c; i++) {
            ans = ans * (r - i);
            ans = ans / (i + 1);
        }
        return ans;

    }
}