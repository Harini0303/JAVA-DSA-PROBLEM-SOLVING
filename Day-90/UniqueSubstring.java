// https://www.geeksforgeeks.org/problems/unique-substrings0524/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    public static int unique_substring(String str) {
        // Your code here
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        return set.size();
    }
}