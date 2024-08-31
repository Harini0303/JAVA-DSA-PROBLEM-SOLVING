// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minimum = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - minimum;
            profit = Math.max(cost, profit);
            minimum = Math.min(minimum, prices[i]);

        }

        return profit;
    }
}