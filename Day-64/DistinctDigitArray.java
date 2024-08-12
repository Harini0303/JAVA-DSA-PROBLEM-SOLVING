//https://www.geeksforgeeks.org/problems/make-a-distinct-digit-array2007/1

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        Set<Integer> digitSet = new HashSet<>();

        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                digitSet.add(digit);
                num /= 10;
            }
        }

        List<Integer> list = new ArrayList<>(digitSet);
        Collections.sort(list);

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}