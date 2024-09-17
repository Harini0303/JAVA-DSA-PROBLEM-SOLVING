// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int n = arr.length;

        int[] count = new int[n];

        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;

        }

        for (int i = 0; i < n; i++) {
            if (count[i] > 1) {
                ls.add(arr[i]);
            }
        }

        if (ls.isEmpty()) {
            ls.add(-1);
        }

        return ls;
    }
}
