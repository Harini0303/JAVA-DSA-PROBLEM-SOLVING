//https://www.geeksforgeeks.org/problems/reverse-digit0316/1

class Solution {
    public long reverse_digit(long n) {
        // Code here
        long rev = 0;
        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}

// Your implementation of the power function uses the concept of "modular
// exponentiation," which is efficient for calculating large powers modulo some
// number, typically
// 1
// 0
// 9
// +
// 7
// 10
// 9
// +7 in competitive programming. Let's walk through the code and explain it
// step by step using an example.

// Problem Example:
// Given:

// 𝑁
// =
// 12
// N=12
// 𝑅
// =
// 21
// R=21 (the reverse of 12)
// We need to compute
// 1
// 2
// 21
// m
// o
// d
//
//
// 1
// 0
// 9
// +
// 7
// 12
// 21
// mod10
// 9
// +7.

// Explanation of the Code:
// Initial Setup:

// int modulus = 1000000007;: This is the modulus value
// 1
// 0
// 9
// +
// 7
// 10
// 9
// +7.
// long result = 1;: This variable will store the intermediate and final
// results.
// Main Loop:

// The loop continues until
// 𝑅
// R becomes 0.
// Check if
// 𝑅
// R is odd:
// if (R % 2 == 1): If
// 𝑅
// R is odd, multiply the current result by
// 𝑁
// N and take modulus.
// result = (result * N) % modulus;
// Square
// 𝑁
// N:
// N = (int)(((long)N * N) % modulus);: Square
// 𝑁
// N and take modulus to avoid overflow.
// Divide
// 𝑅
// R by 2:
// R /= 2;: This effectively shifts
// 𝑅
// R to the right in binary representation.
// Example Walkthrough:
// Given
// 𝑁
// =
// 12
// N=12 and
// 𝑅
// =
// 21
// R=21:

// Initial values:

// result = 1
// N = 12
// R = 21
// Iteration 1:

// 𝑅
// =
// 21
// R=21 (odd):
// result = (1 * 12) % 1000000007 = 12
// N = (12 * 12) % 1000000007 = 144
// R = 21 / 2 = 10
// Iteration 2:

// 𝑅
// =
// 10
// R=10 (even):
// N = (144 * 144) % 1000000007 = 20736
// R = 10 / 2 = 5
// Iteration 3:

// 𝑅
// =
// 5
// R=5 (odd):
// result = (12 * 20736) % 1000000007 = 248832
// N = (20736 * 20736) % 1000000007 = 429981696
// R = 5 / 2 = 2
// Iteration 4:

// 𝑅
// =
// 2
// R=2 (even):
// N = (429981696 * 429981696) % 1000000007 = 600846617
// R = 2 / 2 = 1
// Iteration 5:

// 𝑅
// =
// 1
// R=1 (odd):
// result = (248832 * 600846617) % 1000000007 = 864354781
// N = (600846617 * 600846617) % 1000000007 = 633228111
// R = 1 / 2 = 0
// Final result: result = 864354781