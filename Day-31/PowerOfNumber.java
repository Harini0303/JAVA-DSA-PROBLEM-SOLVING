// https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

// Input:
// N = 12, R = 21
// Output: 864354781
// Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.

// Problem: Calculating large powers directly, such as 
// 𝑁
// 𝑅
// N 
// R
//  , can be computationally expensive and impractical due to potential overflow and the sheer number of multiplications required.
// Solution: Exponentiation by squaring significantly reduces the number of multiplications needed. Instead of multiplying N by itself R times, the algorithm takes advantage of the properties of exponents to perform fewer operations.

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

// Modulus Operation:

// Purpose: The modulus operation is used to prevent overflow and keep the
// numbers manageable within the limits of typical data types.
// Why Modulo
// 1000000007
// 1000000007: This is a large prime number commonly used in programming
// contests and real-world applications to ensure results fit within standard
// data types and to leverage the properties of prime numbers in modular
// arithmetic.
