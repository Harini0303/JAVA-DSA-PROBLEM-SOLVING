// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        return set.size();
    }
}