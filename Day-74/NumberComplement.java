// https://leetcode.com/problems/number-complement/description/

// The loop iterates through powers of two (1, 2, 4, etc.) and flips the corresponding bits in num.
// By XOR-ing num with each i, the bits in num are flipped, and we gradually build the complement of the original number.

class Solution {
    public int findComplement(int num) {
        for (long i = 1; i <= num; i <<= 1) {
            num ^= i;
        }
        return num;
    }
}
