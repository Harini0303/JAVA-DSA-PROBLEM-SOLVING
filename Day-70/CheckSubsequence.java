//https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1

class Solution {
    boolean isSubSequence(String A, String B) {
        int k = 0;
        for (int i = 0; i < B.length(); i++) {
            if (k < A.length() && A.charAt(k) == B.charAt(i)) {
                k++;
            }

        }
        return k == A.length();
    }
}