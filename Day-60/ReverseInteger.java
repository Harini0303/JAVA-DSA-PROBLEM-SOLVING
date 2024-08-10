// https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digits = x % 10;
            // if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digits
            // > 7)) return 0;
            // if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digits
            // < -8)) return 0;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digits >= Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digits <= Integer.MIN_VALUE % 10)) {
                return 0;
            }

            rev = rev * 10 + digits;
            x /= 10;
        }
        return rev;

    }
}