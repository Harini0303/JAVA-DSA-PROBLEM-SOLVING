// Input:
// a = "3", b = "10"
// Output:
// 9
// Explanation:
// 310 = 59049. Last digit is 9.

// https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1

//User function Template for Java

class Solution {
    static int getLastDigit(String a, String b) {
        // Convert the input strings 'a' and 'b' to BigInteger objects
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        // Check if A is zero
        if (A.equals(BigInteger.ZERO)) {
            return 0; // If A is zero, the result is always zero because 0^any number is 0
        }

        // Define a BigInteger representing the number 10
        BigInteger modulus = BigInteger.TEN;

        // Calculate A^B % 10 using the modPow method of BigInteger
        BigInteger result = A.modPow(B, modulus);

        // Convert the result to an integer and return it
        return result.intValue();
    }
}
