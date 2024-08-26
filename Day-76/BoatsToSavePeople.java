// https://leetcode.com/problems/boats-to-save-people/description/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int minBoats = 0;
        int i = 0, j = people.length - 1;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;

            }

            j--;
            minBoats++;
        }

        return minBoats;

    }
}