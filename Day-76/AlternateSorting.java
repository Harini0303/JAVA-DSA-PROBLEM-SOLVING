// https://www.geeksforgeeks.org/problems/alternative-sorting1311/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        Arrays.sort(arr);

        ArrayList<Integer> ls = new ArrayList<>();

        int i = 0, j = arr.length - 1;

        while (i < j) {
            ls.add(arr[j--]);
            ls.add(arr[i++]);

        }

        if (i == j) {
            ls.add(arr[i]);
        }
        return ls;
    }
}
