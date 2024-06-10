//problem link : https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution {
    public int firstUniqChar(String s) {
        // Map<Character, Integer> frequencyMap = new HashMap<>();
        // for (char c : s.toCharArray()) {
        // frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        // }

        // for (int i = 0; i < s.length(); i++) {
        // if (frequencyMap.get(s.charAt(i)) == 1) {
        // return i;
        // }
        // }

        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }
}
