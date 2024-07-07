// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

class Solution {
    static String armstrongNumber(int n) {
        // code here
        int ori = n;
        int rev = 0;
        int cnt = count(n);
        while (n > 0) {
            int digit = n % 10;
            rev = rev + (int) Math.pow(digit, cnt);
            n /= 10;

        }

        if (ori == rev) {
            return "Yes";
        }
        return "No";

    }

    static int count(int n) {
        int c1 = 0;
        while (n > 0) {
            c1++;
            n /= 10;
        }
        return c1;
    }
}