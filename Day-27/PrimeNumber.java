// https://www.geeksforgeeks.org/problems/prime-number2314/1

class Solution {
    static int isPrime(int N) {
        if (N == 1) {
            return 0;
        }

        int sqrtN = (int) Math.sqrt(N);
        for (int i = 2; i <= sqrtN; i++) {
            if (N % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}