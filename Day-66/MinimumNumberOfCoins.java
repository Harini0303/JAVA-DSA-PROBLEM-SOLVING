//https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        int[] coins = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

        List<Integer> res = new ArrayList<>();

        for (int coin : coins) {
            while (N >= coin) {
                N -= coin;
                res.add(coin);
            }
        }
        return res;
    }
}

// import java.util.*;

// public class GfG {

// public static void countCurrency(int amount) {
// int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
// int[] noteCounter = new int[9];

// for (int i = 0; i < 9; i++) {
// if (amount >= notes[i]) {
// noteCounter[i] = amount / notes[i];
// amount = amount % notes[i];
// }
// }

// System.out.println("Currency Count ->");
// for (int i = 0; i < 9; i++) {
// if (noteCounter[i] != 0) {
// System.out.println(notes[i] + " : " + noteCounter[i]);
// }
// }
// }

// public static void main(String argc[]) {
// int amount = 868;
// countCurrency(amount);
// }
// }
