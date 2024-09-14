// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here

        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        return set.size();
    }
}