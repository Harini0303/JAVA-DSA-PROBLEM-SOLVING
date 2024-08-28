// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m) {
        // add your code here

        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;

    }

}