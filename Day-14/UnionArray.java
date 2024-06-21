//problrm : https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

class Solution {
    public static int doUnion(int a[], int n, int b[], int m) {
        // Create a HashSet to store unique elements
        HashSet<Integer> unionSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            unionSet.add(b[i]);
        }

        return unionSet.size();
    }
}