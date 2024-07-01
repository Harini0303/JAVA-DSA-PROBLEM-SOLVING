// https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int complement = x - arr[i];

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(arr[i]);
        }

        return false;
    }
}
