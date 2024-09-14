// https://www.geeksforgeeks.org/problems/remove-minimum-number-of-elements4032/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    public int minRemove(int[] arr1, int[] arr2) {
        // code here
        int c = 0;

        HashMap<Integer, Integer> countA = new HashMap<>();
        HashMap<Integer, Integer> countB = new HashMap<>();

        for (int num : arr1) {
            countA.put(num, countA.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            countB.put(num, countB.getOrDefault(num, 0) + 1);
        }

        for (int key : countA.keySet()) {
            if (countB.containsKey(key)) {
                c += Math.min(countA.get(key), countB.get(key));
            }
        }
        return c;

    }
}