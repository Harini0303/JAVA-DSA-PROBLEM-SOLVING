//https://www.geeksforgeeks.org/problems/final-destination4628/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    static int canReach(Long a, Long b, Long x) {
        long minSteps = Math.abs(a) + Math.abs(b);

        if (x >= minSteps && (x - minSteps) % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}