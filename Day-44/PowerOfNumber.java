// https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    long power(int N, int R) {
        int modulus = 1000000007;
        long result = 1;

        while (R > 0) {
            if (R % 2 == 1) {
                result = (result * N) % modulus;
            }
            N = (int) (((long) N * N) % modulus);
            R /= 2;
        }

        return result;
    }
}
