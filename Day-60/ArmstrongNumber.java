//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

class Solution {
    static String armstrongNumber(int n) {
        // code here
        int count = cnt(n);
        int dup = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev + (int) Math.pow(digit, count);
            n /= 10;
        }

        if (rev == dup) {
            return "true";
        }
        return "false";
    }

    public static int cnt(int n) {
        int count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        return count;
    }
}

// class Solution {
// static String armstrongNumber(int n) {
// // Extract the digits
// int firstDigit = n / 100;
// int secondDigit = (n / 10) % 10;
// int thirdDigit = n % 10;

// // Calculate the sum of the cubes of the digits
// int sumOfCubes = (firstDigit * firstDigit * firstDigit) +
// (secondDigit * secondDigit * secondDigit) +
// (thirdDigit * thirdDigit * thirdDigit);

// // Check if the sum of cubes is equal to the original number
// if (sumOfCubes == n) {
// return "true";
// } else {
// return "false";
// }
// }
// }
