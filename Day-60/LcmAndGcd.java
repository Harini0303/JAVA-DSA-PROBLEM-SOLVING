// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {
        // code here
        Long gcd = gcd(A, B);

        Long lcm = (A * B) / gcd;

        return new Long[] { lcm, gcd };

    }

    static Long gcd(Long a, Long b) {
        while (b != 0) {
            Long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
};