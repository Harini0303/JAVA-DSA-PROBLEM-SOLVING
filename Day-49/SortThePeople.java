//https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] people = new String[n];
        for (int i = 0; i < n; i++) {
            people[i] = map.get(heights[n - i - 1]);
        }

        return people;
    }
}