// https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S) {
        // Your code here
        int[] freq = new int[26];

        for (char c : S.toCharArray()) {
            freq[c - 'a']++;

        }

        for (int i = 0; i < S.length(); i++) {
            if (freq[S.charAt(i) - 'a'] == 1) {
                return S.charAt(i);
            }
        }
        return '$';
    }
}