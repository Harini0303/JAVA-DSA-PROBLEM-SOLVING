//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
        if (arr.size() == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < arr.size(); j++) {
            if (!arr.get(i).equals(arr.get(j))) {
                i++;
                arr.set(i, arr.get(j));
            }

        }
        return i + 1;
    }
}