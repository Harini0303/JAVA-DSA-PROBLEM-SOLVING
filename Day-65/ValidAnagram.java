//https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

// class Solution {
// public boolean isAnagram(String s, String t) {
// int[] freq=new int[26];
// for(char ch:s.toCharArray()){
// freq[ch-'a']++;
// }
// for(char ch:t.toCharArray()){
// freq[ch-'a']--;
// }
// for(int i=0;i<26;i++){
// if(freq[i]!=0) return false;
// }
// return true;
// }
// }
