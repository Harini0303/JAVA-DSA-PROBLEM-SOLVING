// https://www.geeksforgeeks.org/problems/count-of-distinct-substrings/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class GfG {
    public static int countDistinctSubstring(String st) {
        // your code here

        Set<String> set = new HashSet<>();

        for (int i = 0; i <= st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                set.add(st.substring(i, j));
            }
        }
        return set.size() + 1;

    }
}