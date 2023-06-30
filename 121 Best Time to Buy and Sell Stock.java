class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int maxProfit = 0;
        int profit;
        while (sellIndex < prices.length) {
            if (prices[buyIndex] < prices[sellIndex]) {
                profit = prices[sellIndex] - prices[buyIndex];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyIndex = sellIndex;
            }
            sellIndex++;
        }
        return maxProfit;
    }
}