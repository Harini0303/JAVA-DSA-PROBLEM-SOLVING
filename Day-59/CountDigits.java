//https://www.geeksforgeeks.org/problems/count-digits5716/1

class Solution {
    static int evenlyDivides(int N) {
        // code here
        int count = 0;
        int dup = N;

        while (N > 0) {
            int rem = N % 10;
            if (rem > 0 && dup % rem == 0) {
                count += 1;
            }
            N /= 10;
        }
        return count;
    }
}