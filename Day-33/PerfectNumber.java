// a perfect number is a positive integer that is equal to the sum of its positive proper divisors, that is,
//  divisors excluding the number itself. For instance, 6 has proper divisors 1, 2 and 3, 
//  and 1 + 2 + 3 = 6, so 6 is a perfect number. The next perfect number is 28, since 1 + 2 + 4 + 7 + 14 = 28.

// https://www.geeksforgeeks.org/problems/perfect-numbers3207/1

class Solution {
    static int isPerfectNumber(long N) {
        // code here
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }

            if (sum - N == N) {
                return 1;
            }
        }
        return 0;
    }
};