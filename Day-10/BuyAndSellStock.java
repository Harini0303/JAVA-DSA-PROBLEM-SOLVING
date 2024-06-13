//problem : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// class Solution {
//     public int maxProfit(int[] prices) {
//         int minimum = prices[0];
//         int profit =0;

//         for(int i=1;i<prices.length;i++){
//             int cost = prices[i] - minimum;
//             profit = Math.max(profit,cost);
//             minimum = Math.min(minimum,prices[i]);
//         }
//         return profit;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > maxprofit) {
                maxprofit = prices[i] - min;
            }
        }
        return maxprofit;

    }
}