//https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    static int nthFibonacci(int n) {
        final int MOD = 1000000007;

        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1;
        int b = 1;

        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = (a + b) % MOD;
            a = b;
            b = current;
        }

        return current;
    }
}
